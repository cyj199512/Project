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

public class Identificate extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6415444502714223357L;

	public Identificate(int type){
		Identificate temp_this = this;
		
		JLabel welcome = new JLabel();
		welcome.setText("Please enter your"+
					" account No. and PIN"+
					"to idetify");
		this.getContentPane().add(BorderLayout.NORTH, welcome);
		
		JPanel put = new JPanel(new GridLayout(2,2));
		
		JLabel accNoLabel = new JLabel("Account No.:");
		JTextField accNoText = new JTextField();
		accNoText.setCaretColor(Color.blue);
		
		JLabel PINLabel = new JLabel("PIN:");
		JTextField PINText = new JTextField();
		PINText.setCaretColor(Color.blue);
		
		put.add(accNoLabel);
		put.add(accNoText);
		put.add(PINLabel);
		put.add(PINText);
		this.getContentPane().add(BorderLayout.CENTER, put);
		
		JButton confirm = new JButton("Confirm");
		confirm.setForeground(Color.green);
		confirm.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int accNo = 0;
				try{
					accNo = Integer.parseInt(accNoText.getText());
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Please enter right Account Number~~~");
					return;
				}
				
					
				String PIN = PINText.getText();
				if(!Main.status.accounts.containsKey(accNo)){
					JOptionPane.showMessageDialog(null, "Not such account???? Please try again~~~");
					return;
				}
				
				if(Main.status.accounts.get(accNo).isSuspend()){
					JOptionPane.showMessageDialog(null, "The account is suspended!!!! Please put another account!!!");
					return;
				}
				
				if(!Main.status.accounts.get(accNo).getPIN().equals(PIN)){
					JOptionPane.showConfirmDialog(null, "Your PIN get wrong, Please try again~~~");
					return;
				}
				if(type == 1)
					new Deposit(Main.status.customers.get(accNo),Main.status.accounts.get(accNo));
				
				if(type == 2)
					new Withdraw(Main.status.customers.get(accNo),Main.status.accounts.get(accNo));
				
				if(type == 3){
					
					if(Main.status.accounts.get(accNo).getAccountType() != 0){
						JOptionPane.showMessageDialog(null, "This function is only for saver account, Please try again~~~");
						return;
					}
					if(((SavingAccount)Main.status.accounts.get(accNo)).isNoticed()){
						JOptionPane.showMessageDialog(null, "The account has been noticed, Please try again~~~~");
						return;
					}
					new Notice(Main.status.customers.get(accNo),Main.status.accounts.get(accNo));
				}
				
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
