import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Delete extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8097404000689088680L;

	public Delete(){
		Delete temp_this = this;
		JLabel welcomeInfo = new JLabel("Please enter your account No. and PIN to idetify");
		this.getContentPane().add(BorderLayout.NORTH, welcomeInfo);
		
		JPanel input = new JPanel(new GridLayout(2,2));
		JLabel accNoLabel = new JLabel("Account No.:");
		JTextField accNoText = new JTextField();
		JLabel PINLabel = new JLabel("PIN:");
		JTextField PINText = new JTextField();
		input.add(accNoLabel);
		input.add(accNoText);
		input.add(PINLabel);
		input.add(PINText);
		this.getContentPane().add(BorderLayout.CENTER, input);
		
		JButton confirm = new JButton("Confirm");
		confirm.setForeground(Color.green);
		confirm.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int accNo = 0;
				try{
					accNo = Integer.parseInt(accNoText.getText());
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Please enter right accNo!!!");
					return;
				}
				
				String PIN = PINText.getText();
				if(!Main.status.accounts.containsKey(accNo)){
					JOptionPane.showMessageDialog(null, "Not such a account!!!");
					return;
				}
				if(!Main.status.accounts.get(accNo).getPIN().equals(PIN)){
					JOptionPane.showConfirmDialog(null, "Wrong PIN!!!Please try again~");
					return;
				}
				if(Main.status.accounts.get(accNo).getBalance() != 0){
					JOptionPane.showMessageDialog(null, "Balance need to be cleared, Please try again~");
					return;
				}
				Main.status.accounts.remove(accNo);
				Main.status.customers.remove(accNo);
				Main.status.saveAccount();
				Main.status.saveCustomers();
				JOptionPane.showMessageDialog(null, "Successfully close!!!");
				temp_this.dispose();
				return;
			}
			
		});
		this.getContentPane().add(BorderLayout.SOUTH, confirm);
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	
}
