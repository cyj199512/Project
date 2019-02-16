import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Deposit extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6941034707296803333L;

	public Deposit(Customer customer,BankAccount account){
		Deposit tempFrame = this;
		String type[] = {"Saver account","Junior account","Current account"};
		String fundType[] = {"Cleared Fund","Un-cleared Fund"};
		
		JPanel welcomeInfo = new JPanel(new GridLayout(3,1));
		JLabel welcomeName = new JLabel("Welcome！ " + customer.getName());
		JLabel welcomeType = new JLabel("Your account type: " + type[account.getAccountType()]);
		welcomeInfo.add(welcomeName);
		welcomeInfo.add(welcomeType);
		JTextArea detailnfo = new JTextArea();
		detailnfo.setEditable(false);
		detailnfo.append("Cleared balance: " + account.getBalance() + "\n");
		detailnfo.append("Un-cleared balance: " + account.getUnClearedBalance() + "\n");
		if(account.getAccountType() == 2){
			CurrentAccount temp = (CurrentAccount) account;
			detailnfo.append("Overdrft limit: " + temp.getOverdraftLimit());
		}
		welcomeInfo.add(detailnfo);
		
		JPanel operation = new JPanel(new GridLayout(3,2));
		JLabel amountLabel = new JLabel("Deposit amount!");
		JTextField amountText = new JTextField();
		JButton confirm = new JButton("Confirm~");
		operation.add(amountLabel);
		operation.add(amountText);
		
		operation.add(new JLabel("Fund type:"));
		JComboBox<String> fundBox = new JComboBox<>(fundType);
		operation.add(fundBox);
		operation.add(new JLabel());
		operation.add(confirm);
		confirm.setForeground(Color.green);
		
		confirm.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int amount = Integer.parseInt(amountText.getText());
				int type = fundBox.getSelectedIndex();
				if(type == 0)
					account.deposit(amount);
				else if(type == 1)
					account.depositUnclear(amount);
				JOptionPane.showMessageDialog(null, "Congratulation!!! Successfully deposit!!");
				Main.status.saveAccount();
				tempFrame.dispose();
			}
			
		});
		this.getContentPane().add(BorderLayout.CENTER,welcomeInfo);
		this.getContentPane().add(BorderLayout.SOUTH,operation);
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
