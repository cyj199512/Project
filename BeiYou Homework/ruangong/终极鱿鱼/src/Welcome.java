import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Welcome GUI
 */
public class Welcome extends JFrame{
	
		JPanel BG = new JPanel();
		ImageIcon img;
		JPanel ButtonPanel=new JPanel();
		JPanel TextPanel=new JPanel();
		JButton admin=new JButton("Admin");
		JButton buy=new JButton("Buy Tickets");
		JButton exit=new JButton("Exit");
		int width = 800, height = 600;
		
		/**
		 * Welcome GUI constructor
		 */
		public Welcome(){
			super("Film ballot system");
			JLabel bg = new JLabel(img);
			img = new ImageIcon("Image/BG.jpg");
			Image image = img.getImage();
			image = image.getScaledInstance(width, height, Image.SCALE_DEFAULT); 
			img.setImage(image); 
			bg.setIcon(img);  
			bg.setSize(width, height); 
			JPanel imgPanel = (JPanel)this.getContentPane();
			imgPanel.setOpaque(false);
			imgPanel.setLayout(new GridLayout(2,1));
			this.getLayeredPane().setLayout(null);
			this.getLayeredPane().add(bg, new Integer(Integer.MIN_VALUE));
			
			JTextArea WelcomeWords=new JTextArea("\n\n\n\n" +      "       Welcome to movie system!");
			WelcomeWords.setEditable(false);
			WelcomeWords.setFont(new  Font("Arial",Font.BOLD, 50));
			WelcomeWords.setOpaque(false);
			WelcomeWords.setForeground(Color.white);
			WelcomeWords.setAlignmentX(LEFT_ALIGNMENT);
			this.add(WelcomeWords);

			ButtonPanel.setLayout(new GridLayout(1,3));
			admin.setForeground(Color.white);
			admin.setBorder(BorderFactory.createRaisedBevelBorder()); 
			admin.setFont(new Font("Arial",Font.PLAIN, 25));
			buy.setForeground(Color.white);
			buy.setBorder(BorderFactory.createRaisedBevelBorder());
			buy.setFont(new Font("Arial",Font.PLAIN, 25));
			exit.setForeground(Color.white);
			exit.setBorder(BorderFactory.createRaisedBevelBorder());
			exit.setFont(new Font("Arial",Font.PLAIN, 25));
			ButtonPanel.add(admin);
			ButtonPanel.add(buy);
			ButtonPanel.add(exit);
			ButtonPanel.setOpaque(false);
			UIManager.put("Button.select", Color.blue);
			JPanel a=new JPanel(new BorderLayout());
			a.add(ButtonPanel,BorderLayout.SOUTH);
			ButtonPanel.setPreferredSize(new Dimension(0, 50));
			
			a.setOpaque(false);
			this.add(a);
			this.getContentPane().setBackground(Color.white);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			admin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
					Admin lg=new Admin();
				}
			});
			
			buy.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					dispose();
					Movie MovieGUI=new Movie();
				}
			});
			
			exit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
			this.setSize(800,600);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//this.setLocationRelativeTo(null);
		}
		
		public static void main(String[] args) {
			Welcome WelcomeGUI = new Welcome();
		}
}
