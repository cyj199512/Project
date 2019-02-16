import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Withdraw extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8092609465910624036L;

	public Withdraw(Customer customer,BankAccount account){
	Withdraw temp_frame = this;
	
	String type[] = {"Saver account","Junior account","Current account"};
	JPanel welcome_info = new JPanel(new GridLayout(3,1));
	JLabel welcome_name = new JLabel("Welcome, " + customer.getName());
	JLabel welcome_type = new JLabel("Your account type: " + type[account.getAccountType()]);
	welcome_info.add(welcome_name);
	welcome_info.add(welcome_type);
	
	JTextArea detail_info = new JTextArea();
	detail_info.setEditable(false);
	detail_info.append("Cleared balance:    " + account.getBalance() + "\n");
	detail_info.append("Un-cleared balance: " + account.getUnClearedBalance() + "\n");
	if(account.getAccountType() == 0){
		SavingAccount temp = (SavingAccount) account;
		if(temp.isNoticed())
		detail_info.append("Noticed date: " + temp.getNoticeDate().get(Calendar.YEAR) + "/" + temp.getNoticeDate().get(Calendar.MONTH) + "/" +temp.getNoticeDate().get(Calendar.DAY_OF_MONTH) + "\n");
		else detail_info.append("Noticed date: -----" );
	}else if(account.getAccountType() == 2){
		CurrentAccount temp = (CurrentAccount) account;
		detail_info.append("Overdrft limit:     " + temp.getOverdraftLimit());
	}
	welcome_info.add(detail_info);
	JPanel operation = new JPanel(new GridLayout(3,2));
	JLabel amount_label = new JLabel("Withdraw amount");
	JTextField amount_text = new JTextField();
	JButton confirm = new JButton("Confirm");
	operation.add(amount_label);
	operation.add(amount_text);
	operation.add(new JLabel());
	operation.add(new JLabel());
	operation.add(new JLabel());
	operation.add(confirm);
	confirm.setForeground(Color.green);
	
	confirm.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			int amount = Integer.parseInt(amount_text.getText());
			if(account.getAccountType() == 0){
				SavingAccount temp = (SavingAccount) account;
				if(!temp.isNoticed()){
					JOptionPane.showMessageDialog(null, "Please set the noticed day");
					return;
				}else{
					String string = temp.getNoticeDate().get(Calendar.YEAR)+"-"+temp.getNoticeDate().get(Calendar.MONTH)+"-"+temp.getNoticeDate().get(Calendar.DAY_OF_MONTH);
					long NoticedDate = 0;
					try {
						NoticedDate = (new SimpleDateFormat("yyyy-MM-dd")).parse(string).getTime();
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					long currentDate = System.currentTimeMillis();
					System.out.println(NoticedDate);
					System.out.println(currentDate);
					if(NoticedDate > currentDate){
						JOptionPane.showMessageDialog(null, "It's not the day you can withdraw the money");
						return;
					}else{
						if(temp.withdraw(amount)){
							JOptionPane.showMessageDialog(null, "Withdraw Successfully");
							Main.status.saveAccount();
							temp_frame.dispose();
							return;
						}else{
							JOptionPane.showMessageDialog(null, "Not enough balance");
							return;
						}
					}
				}
			}else if(account.getAccountType() == 2){
				CurrentAccount temp = (CurrentAccount) account;
				if(temp.withdraw(amount)){
					JOptionPane.showMessageDialog(null, "Withdraw Successfully");
					Main.status.saveAccount();
					temp_frame.dispose();
					return;
				}else{
					JOptionPane.showMessageDialog(null, "Not enough balance");
					return;
				}
			}else{
				if(account.withdraw(amount)){
					JOptionPane.showMessageDialog(null, "Withdraw Successfully");
					Main.status.saveAccount();
					temp_frame.dispose();
					return;
				}else{
					JOptionPane.showMessageDialog(null, "Not enough balance");
					return;
				}
			}
		}
		
	});
	this.getContentPane().add(BorderLayout.CENTER,welcome_info);
	this.getContentPane().add(BorderLayout.SOUTH,operation);
	this.pack();
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setLocationRelativeTo(null);
}
}
