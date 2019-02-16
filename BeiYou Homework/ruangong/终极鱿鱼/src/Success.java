import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * Successful payment GUI
 */
public class Success extends JFrame {
	JPanel FinishPanel=new JPanel();
	JPanel ShowTicket=new JPanel();
	JPanel Buttons=new JPanel();
	JButton finish=new JButton("Finish");
	JButton exit=new JButton("Exit");
	double totalPrice = 0;
	ImageIcon img;
	int width = 1100, height = 800;
	
	/**
	 * Constructor
	 * @param ticketID
	 *  Ordered successfully ticketID
	 * @param studentID
	 * If it is an student ticket, pass studentID. If not, it is 0
	 */
	public Success(String[] ticketID,String[] studentID){	
		JLabel bg = new JLabel(img);
		img = new ImageIcon("Image/BG.jpg");
		Image image = img.getImage();
		image = image.getScaledInstance(width, height, Image.SCALE_DEFAULT); 
		img.setImage(image); 
		bg.setIcon(img);  
		bg.setSize(width, height); 
		JPanel imgPanel = (JPanel)this.getContentPane();
		imgPanel.setOpaque(false);
		imgPanel.setLayout(new GridLayout(3,1,10,10));
		this.getLayeredPane().setLayout(null);
		this.getLayeredPane().add(bg, new Integer(Integer.MIN_VALUE));
			
		Ticket[] ticket=new Ticket[ticketID.length];
		JTextArea[] InfoLabels=new JTextArea[ticketID.length];
	    setSize(1100,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FinishPanel.setOpaque(false);
		add(FinishPanel);
		
		ShowTicket.setLayout(new GridLayout(1, ticketID.length));
		if(ticketID.length > 0){
			int ticketType=Integer.parseInt(ticketID[0].substring(7, 8));
			switch(ticketType){
				case 1:
					totalPrice = 8*ticketID.length;
					break;
				case 2:
					totalPrice = 16*ticketID.length;
					break;
				case 3:
					totalPrice = 12.8*ticketID.length;
					break;
				case 4:
					totalPrice = 13.6*ticketID.length;
					break;
				default:
					break;
			}
		}
		
		JTextArea word=new JTextArea(" Successful payment: " + totalPrice + "$" + "\n Your order shows following: ");
		word.setSize(1000, 500);
		word.setLineWrap(true);
	    word.setWrapStyleWord(true);
	    word.setEditable(false);
	    word.setOpaque(false);
	    word.setForeground(Color.white);
	    word.setFont(new Font("Arial",Font.BOLD, 60));
	    FinishPanel.add(word);
	    
		for(int i=0;i<ticketID.length;i++){
			if(studentID[0].equals("0")){
				ticket[i]=new Ticket(ticketID[i]);
			}else{
				ticket[i]=new Ticket(ticketID[i],studentID[i]);
			}
			InfoLabels[i]=new JTextArea(ticket[i].toString());
			InfoLabels[i].setFont(new Font("Arial",Font.PLAIN, 23));
			InfoLabels[i].setOpaque(false);
			InfoLabels[i].setForeground(Color.white);
			ShowTicket.add(InfoLabels[i]);
		}

		ShowTicket.setOpaque(false);
		add(ShowTicket);

		finish.setBorder(BorderFactory.createRaisedBevelBorder());
		finish.setForeground(Color.white);
		finish.setFont(new Font("Arial",Font.PLAIN, 25));
		Buttons.add(finish);
		exit.setForeground(Color.white);
		exit.setBorder(BorderFactory.createRaisedBevelBorder());
		exit.setFont(new Font("Arial",Font.PLAIN, 25));
		Buttons.add(exit);
		Buttons.setForeground(Color.white);
		Buttons.setOpaque(false);
		add(Buttons);
		
		finish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Welcome welcome = new Welcome();
			}
		});
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		this.getContentPane().setBackground(Color.white);
		setVisible(true);
	}
}
