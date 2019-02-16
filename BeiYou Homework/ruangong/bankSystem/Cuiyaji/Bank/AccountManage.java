import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AccountManage extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1335833871271292224L;

	public AccountManage(){
		this.init();
	}
	
	public void clear(){
		this.getContentPane().removeAll();
		this.repaint();
	}
	
	public void init(){
		this.getContentPane().add(BorderLayout.NORTH,new JScrollPane(setTable()));
		this.setSize(600,400);
		Font f=new Font("Times",Font.BOLD,30);
		JButton suspend = new JButton("Suspend account");
		suspend.setForeground(Color.red);
		suspend.setFont(f);
		JButton dissuspend = new JButton("Dissuspend account");
		dissuspend.setForeground(Color.green);
		dissuspend.setFont(f);
		JButton manageLimit = new JButton("Manage overdraft limit");
		manageLimit.setForeground(Color.blue);
		manageLimit.setFont(f);
		
		
		suspend.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				suspend(true);
			}
		});
		
		dissuspend.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				suspend(false);
			}
			
		});
		
		manageLimit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SetLimit();
			}
			
		});
		
		JPanel panel = new JPanel(new GridLayout(1,3));
		panel.add(suspend);
		panel.add(dissuspend);
		panel.add(manageLimit);
		this.getContentPane().add(BorderLayout.CENTER,panel);
		this.setSize(1300,900);
		this.setBackground(Color.blue);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public JTable setTable(){
		Object [][] tableData = new Object[Main.status.accounts.size()][11];
		String type[] = {"Saver account","Junior account","Current account"};
		Object [] columnTitle = {"AccNo.","Name","Address","Birth Date","Account Type","Balance",
				"Un-cleared Balance","Overdraft Limit","Noticed Date","PIN","State"};
		int i = 0;
		for(Entry<Integer,BankAccount> en:Main.status.accounts.entrySet()){
			int accNo = en.getKey();
			tableData[i][0] = accNo;
			tableData[i][1] = Main.status.customers.get(accNo).getName();
			tableData[i][2] = Main.status.customers.get(accNo).getBirth().get(Calendar.YEAR)+
					"/"+Main.status.customers.get(accNo).getBirth().get(Calendar.MONTH)+
					"/"+Main.status.customers.get(accNo).getBirth().get(Calendar.DAY_OF_MONTH);
			tableData[i][3] = Main.status.customers.get(accNo).getAddress();
			tableData[i][4] = type[en.getValue().getAccountType()];
			tableData[i][5] = en.getValue().getBalance();
			tableData[i][6] = en.getValue().getUnClearedBalance();
			if(en.getValue().getAccountType() != 2)
			tableData[i][7] = "--";
			else tableData[i][7] = ((CurrentAccount)en.getValue()).getOverdraftLimit();
			if(en.getValue().getAccountType() != 0){
				tableData[i][8] = "--";
			}
			else{
				SavingAccount temp = (SavingAccount) en.getValue();
				if(temp.isNoticed())
					tableData[i][8] = temp.getNoticeDate().get(Calendar.YEAR) + 
					"/" + temp.getNoticeDate().get(Calendar.MONTH) + "/" +
							temp.getNoticeDate().get(Calendar.DAY_OF_MONTH);
				else
					tableData[i][8] = "Haven't set";
			}
			if(en.getValue().isSuspend())
				tableData[i][9] = "Suspended";
			else tableData[i][9] = "Normal";
			tableData[i][10] = en.getValue().getPIN();
			i++;
		}
		JTable table = new JTable(tableData,columnTitle);
		return table;
	}
	
	void suspend(boolean a){
		final JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Suspend account");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout(3,1));
		frame.add(new JLabel("Please Enter account number:"));
		final JTextField accNo = new JTextField();
		JButton confirm = new JButton("Confirm~");
		confirm.setForeground(Color.green);
		confirm.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!Main.status.accounts.containsKey(Integer.parseInt(accNo.getText()))){
					JOptionPane.showMessageDialog(null, "Account doesn't exit!");
					return;
				}
				Main.status.accounts.get(Integer.parseInt(accNo.getText())).setSuspend(a);
				Main.status.saveAccount();
				Main.status.saveCustomers();
				frame.dispose();
				clear();
				init();
				
			}
			
		});
		frame.add(accNo);
		frame.add(confirm);
		frame.setSize(600,400);;
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	void SetLimit(){
		final JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Set overdraft limit");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout(3,1));
		JPanel in=new JPanel(new GridLayout(2,2));
		JLabel accNumber = new JLabel("Account Number:");
		JLabel OLimit= new JLabel("Overdraft Limit:");

		final JTextField accNo = new JTextField("");
		final JTextField limit = new JTextField("");
		
		in.add(accNumber);
		in.add(accNo);
		in.add(OLimit);
		in.add(limit); 
		JButton confirm = new JButton("Confirm");
		confirm.setForeground(Color.green);
		confirm.setLayout(null);
		confirm.setSize(20,30);
		
		confirm.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(accNo.getText().equals("")||limit.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter all the quired information!!Please try again~~~");
					return;
				}else if(!Main.status.accounts.containsKey(Integer.parseInt(accNo.getText()))){
					JOptionPane.showMessageDialog(null, "Account doesn't exit!!Please confirm your ID");
					return;
				}else if(Main.status.accounts.get(Integer.parseInt(accNo.getText())).getAccountType() != 2){
					JOptionPane.showMessageDialog(null, "It's not a current account!!!");
					return;
				}
				((CurrentAccount)Main.status.accounts.get(Integer.
						parseInt(accNo.getText()))).setOverdraftLimit(Integer.parseInt(limit.getText()));
				
				Main.status.saveAccount();
				Main.status.saveCustomers();
				frame.dispose();
				clear();
				init();
				
			}
			
		});
		frame.add(new JLabel("Please enter a account number:"));
		frame.add(in);
		frame.add(confirm);
		frame.setSize(600,400);;
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
