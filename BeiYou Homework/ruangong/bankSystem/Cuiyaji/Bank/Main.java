import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Main extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3910811863187111834L;
	
	public static Bank status = new Bank();
	public Main(){
		this.setLayout(new GridLayout(2,1));
		JLabel welcome = new JLabel("Welcome to our bank system!",JLabel.CENTER);
		welcome.setFont(new java.awt.Font("Dialog",1,20));
		this.add(welcome);
		
		UIManager.put("Button.select", Color.blue);
		JPanel buttons = new JPanel();
		
		buttons.setLayout(new GridLayout(2,3));
		JButton open = new JButton("Open Account");
		open.setForeground(Color.green);

		JButton close = new JButton("Close Account");
		close.setForeground(Color.red);
		
		JButton withdraw = new JButton("Withdraw");
		withdraw.setForeground(Color.blue);
		
		JButton deposit = new JButton("Deposit");
		deposit.setForeground(Color.gray);
		
		JButton manage = new JButton("View Account");
		manage.setForeground(Color.magenta);
		
		JButton setNotice = new JButton("Set Noticed Date");
		setNotice.setForeground(Color.cyan);
		
		setNotice.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {		
				new Identificate(3);
			}
			
		});
		
		manage.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new AccountManage();
			}
			
		});
		
		open.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Register();
			}
			
		});
		close.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new Delete();
			}
			
		});
		withdraw.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new Identificate(2);
			}
			
		});
		deposit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new Identificate(1);
			}
			
		});
		buttons.add(withdraw);
		buttons.add(deposit);
		buttons.add(open);
		buttons.add(close);
		buttons.add(manage);
		buttons.add(setNotice);
		this.add(buttons);
		this.setSize(600,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	
	
	public static void main(String arg[]){
		new Main();
		Timer a = new Timer();
		a.start();
	}

}
