import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Register extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7818047805721418776L;

	public Register(){
		Register temp_frame = this;
		Integer day[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,
				16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		String month[] = {"Jan.","Feb.","Mar.","Apr.","May.","Jun.",
				"July ","Aug.","Sept.","Oct.","Nov.","Dec."};
		Integer year[] = new Integer[60];
		String type[] = {"Saver account","Junior account","Current account"};
		
		for(int i = 0; i < 60; i++){
			year[i] = (int)(Calendar.getInstance().get(Calendar.YEAR))-i;
		}
		
		int accNo = (int) (100000+899999*Math.random());
		
		while(Main.status.customers.containsKey(accNo)){
			accNo = (int) (100000+899999*Math.random());
		}
		
		final int tempaccNo = accNo;
		
		this.setLayout(new GridLayout(2,1));
		JPanel welcomInfo = new JPanel(new GridLayout(2,1));
		JLabel welcom = new JLabel("Account number :");
		welcom.setFont(new java.awt.Font("Dialog",1,15)); 
		JLabel showAccNo = new JLabel(""+accNo,JLabel.CENTER);
		showAccNo.setForeground(Color.red);
		showAccNo.setFont(new java.awt.Font("Dialog",1,20)); 
		welcomInfo.add(welcom);
		welcomInfo.add(showAccNo);
		
		
		JPanel input = new JPanel(new GridLayout(10,2));
		
		JLabel namelabel = new JLabel("Name:");
		JTextField nameText = new JTextField();
		input.add(namelabel);
		input.add(nameText);
		
		JLabel addresslabel = new JLabel("Address:");
		JTextField addressText = new JTextField();
		input.add(addresslabel);
		input.add(addressText);
		
		JLabel birthDay = new JLabel("The day you birth:");
		JComboBox<Integer> dayBox = new JComboBox<>(day);
		input.add(birthDay);
		input.add(dayBox);
		
		JLabel birthMonth = new JLabel("The month you birth:");
		JComboBox<String> monthBox = new JComboBox<>(month);
		input.add(birthMonth);
		input.add(monthBox);
		
		JLabel birthYear = new JLabel("The year you birth:");
		JComboBox<Integer> yearBox = new JComboBox<>(year);
		input.add(birthYear);
		input.add(yearBox);
		
		JLabel accType = new JLabel("Account type:");
		JComboBox<String> typeBox = new JComboBox<>(type);
		input.add(accType);
		input.add(typeBox);
		
		JLabel PINLabel = new JLabel("PIN:");
		JTextField PINText = new JTextField();
		input.add(PINLabel);
		input.add(PINText);
		
		JLabel PIN2Label = new JLabel("PIN again:");
		JTextField PIN2Text = new JTextField();
		input.add(PIN2Label);
		input.add(PIN2Text);
		
		JButton confirm = new JButton("Confirm");
		confirm.setForeground(Color.green);
		confirm.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameText.getText();
				String address = addressText.getText();
				int day = (int) dayBox.getSelectedItem();
				int month = monthBox.getSelectedIndex()+1;
				int year = (int)(Calendar.getInstance().get(Calendar.YEAR))-yearBox.getSelectedIndex();
				int type = typeBox.getSelectedIndex();
				String PIN = PINText.getText();
				String PIN2 = PIN2Text.getText();
				
				if(name.equals("") || address.equals("") || PIN.equals("") || PIN2.equals("")){
					JOptionPane.showMessageDialog(null, "Please enter all the quired information!!Please try again~~~");
					return;
				}else if(!PIN.equals(PIN2)){
					JOptionPane.showMessageDialog(null, "Please enter the SAME password as in PIN");
					return;
				}else if((year < ((int)(Calendar.getInstance().get(Calendar.YEAR))-16)) && (type == 1)){
					JOptionPane.showMessageDialog(null, "Junior account is only for people under 16 years old! Please confirm your age~~~");
					return;
				}else{
					Customer newcustomer = new Customer(name,address,new GregorianCalendar(year,month,day));
					Main.status.openAccount(tempaccNo, name, type, PIN);
					Main.status.addCustomer(tempaccNo, newcustomer);
					Main.status.saveAccount();
					Main.status.saveCustomers();
					temp_frame.dispose();
					return;
				}
			}
			
		});
		input.add(new JLabel(""));
		input.add(new JLabel(""));
		input.add(new JLabel(""));
		input.add(confirm);
		this.add(welcomInfo);
		this.add(input);
		this.pack();
		this.setBackground(Color.blue);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
