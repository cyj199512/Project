import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Notice extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6769327494829098398L;

	public Notice(Customer customer,BankAccount account){
		Integer day[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,
				16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		String month[] = {"Jan.","Feb.","Mar.","Apr.","May.","Jun.",
				"July ","Aug.","Sept.","Oct.","Nov.","Dec."};
		Integer year[] = new Integer[60];
		@SuppressWarnings("unused")
		String type[] = {"Saver account","Junior account","Current account"};
		
		for(int i = 0; i < 60; i++){
			year[i] = (int)(Calendar.getInstance().get(Calendar.YEAR))+i;
		}
		Notice tempFrame = this;
		
		JPanel welcomeInfo = new JPanel(new GridLayout(3,2));
		JLabel birthDay = new JLabel("The day is noticed~~~");
		JComboBox<Integer> dayBox = new JComboBox<>(day);
		welcomeInfo.add(birthDay);
		welcomeInfo.add(dayBox);
		
		JLabel birthMonth = new JLabel("The month is noticed~~~");
		JComboBox<String> monthBox = new JComboBox<>(month);
		welcomeInfo.add(birthMonth);
		welcomeInfo.add(monthBox);
		
		JLabel birthYear = new JLabel("The year is noticed~~~");
		JComboBox<Integer> yearBox = new JComboBox<>(year);
		welcomeInfo.add(birthYear);
		welcomeInfo.add(yearBox);
		
		JButton confirm = new JButton("Confrim!");
		confirm.setForeground(Color.green);
		confirm.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int day = (int) dayBox.getSelectedItem();
				int month = monthBox.getSelectedIndex() + 1;
				int year = (int)(Calendar.getInstance().get(Calendar.YEAR))+yearBox.getSelectedIndex();
			    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			    long to = 0;
			    long from = System.currentTimeMillis();
				try {
					to = df.parse(year + "-" +month + "-" + day).getTime();
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				
				int days = (int) ((to - from)/(1000 * 60 * 60 * 24)); 
				if(days < 7){
					JOptionPane.showMessageDialog(null, "The date is closed. Please change another day!");
					return;
				}else{
					SavingAccount temp = (SavingAccount)account;
					temp.setNotice(new GregorianCalendar(year,month,day));
					JOptionPane.showMessageDialog(null, "Successfully!!!");
					Main.status.saveAccount();
					Main.status.saveCustomers();
					tempFrame.dispose();
					return;
				}
				
			}
			
		});
		this.getContentPane().add(BorderLayout.NORTH,new JLabel("Select the noticed day~~"));
		this.getContentPane().add(BorderLayout.CENTER,welcomeInfo);
		this.getContentPane().add(BorderLayout.SOUTH,confirm);
		this.pack();//在使用pack（）之后会使这个外部容器自动调整成刚好装下这几个按钮的大小的尺寸
		this.setBackground(Color.blue);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

}
