import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;

/**
* class Admin
* Admin GUI contruction and statistics report generation
*/
public class Admin extends JFrame{
	String[] __pwd__ = new String[100];
	String[] __user__ = new String[100];
	
	FileContentHandling FileHandle=new FileContentHandling("Tickets.txt");
	String[] AllID = FileHandle.R_Ticket();
	String movies[][]={{"Beauty and Beast","Kong: Skull Island",""},{"La La Land","Moonlight","Kong: Skull Island"},{"Beauty and Beast","Logan","Kong: Skull Island"}};
	String type[]={"Child","Adult","Senior","Student"};
	String movie[] = {"Beauty and Beast","Kong: Skull Island","La La Land","Moonlight","Logan"};
	
	int width = 800, height = 600;
	ImageIcon img;
	JPasswordField password;
	TextField username;
	int[] MovieSale = MovieSale();
	int[] TypeSale = TypeSale();
	
	/**
	* Get sales sorted by movie
	* @return
	* return an integer array of sales of 5 movies.
	*/
	public int[] MovieSale(){
		int[] stat = new int[5];
		int screen = 0;
		int moviekind = 0;

		for(int i=0; i<AllID.length; i++){
			screen=Integer.parseInt(AllID[i].substring(0, 1));
			moviekind=Integer.parseInt(AllID[i].substring(1, 2));
			if(movies[screen-1][moviekind-1].equals(movie[0]))
				stat[0]++;			
			else if(movies[screen-1][moviekind-1].equals(movie[1]))
				stat[1]++;
			else if(movies[screen-1][moviekind-1].equals(movie[2]))
				stat[2]++;
			else if(movies[screen-1][moviekind-1].equals(movie[3]))
				stat[3]++;
			else if(movies[screen-1][moviekind-1].equals(movie[4]))
				stat[4]++;
			else{}
			
		}
		return stat;
	}
	
	/**
	* Get sales sorted by ticket type
	* @return
	* return an integer array of 4 kinds
	*/
	public int[] TypeSale(){
		int[] stat = new int[4];
		int ticketType = 0;
		for(int i=0; i<AllID.length; i++){
			ticketType=Integer.parseInt(AllID[i].substring(7, 8));
			switch(ticketType) {
				case 1:
					stat[0]++;
					break;
				case 2:
					stat[1]++;
					break;
				case 3:
					stat[2]++;
					break;
				case 4:
					stat[3]++;
					break;
				default:
					break;
			}
		}
		return stat;
	}
	
	/**
	* Get admin account and password
	*/
	public void FileReader() {
		try {
                File file=new File("AdminAcc.txt");
                if(file.exists()){ 			
                    FileReader read = new FileReader(file);	
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String s = null;
                    int i = 0;
                    while(((s = bufferedReader.readLine()) != null)){
	                    String attr[] = s.split(" ");
	                    __user__[i] = attr[0];
	                    __pwd__[i] = attr[1];
	                    i++;
                	}
                    read.close();
                }
		        else{
		           	System.out.println("Cannot find AdminFile!");
		        }
        }
		catch (Exception e) {
            System.out.println("Read failed!");
            e.printStackTrace();
        }
	}
	
	/**
	* constructor
	*/
	public Admin(){
		FileReader();
		JLabel bg = new JLabel(img);
		img = new ImageIcon("Image/BG.jpg");
		Image image = img.getImage();
		image = image.getScaledInstance(width, height, Image.SCALE_DEFAULT); 
		img.setImage(image); 
		bg.setIcon(img);  
		bg.setSize(width, height); 
		JPanel imgPanel = (JPanel)this.getContentPane();
		imgPanel.setOpaque(false);
		imgPanel.setLayout(new GridLayout(3,1));
		this.getLayeredPane().setLayout(null);
		this.getLayeredPane().add(bg, new Integer(Integer.MIN_VALUE));

		JPanel pan1=new JPanel();
		JLabel LoginLabel=new JLabel("Admin Login");
		LoginLabel.setFont(new Font("Arail",Font.BOLD, 50));
		LoginLabel.setForeground(Color.white);
		pan1.add(LoginLabel);
		pan1.setOpaque(false);
		add(pan1);

		JPanel pan2=new JPanel(new GridLayout(2,2));
		JLabel name=new JLabel("Username:",JLabel.CENTER);
		JLabel pass = new JLabel("Password:",JLabel.CENTER);
		name.setForeground(Color.white);
		pass.setForeground(Color.white);
		name.setFont(new Font("Arail",Font.BOLD, 40));
		pass.setFont(new Font("Arail",Font.BOLD, 40));
		pan2.add(name);
		
		
		username=new TextField(20);
		username.setText("");
		password=new JPasswordField(15);
		password.setEchoChar('*');

		pan2.add(username);
		pan2.add(pass);
		pan2.add(password);
		pan2.setOpaque(false);
		add(pan2);

		JPanel pan3 = new JPanel(new GridLayout(1,2));
		JButton b_log=new JButton("Sign in");
		b_log.setFont(new Font("Arail",Font.BOLD, 30));
		b_log.addActionListener(new ButtonListener1());
		b_log.setForeground(Color.white);
		b_log.setBorder(BorderFactory.createRaisedBevelBorder());
		pan3.add(b_log);
		JButton b_exit=new JButton("Back");
		b_exit.setFont(new Font("Arail",Font.BOLD, 30));
		b_exit.setBorder(BorderFactory.createRaisedBevelBorder());
		b_exit.setForeground(Color.white);
		b_exit.addActionListener(new ButtonListener2());
		pan3.add(b_exit); 
		pan3.setOpaque(false);
		this.add(pan3);
		setTitle("Admin Login");
		this.setSize(800,600);
		setVisible(true);
		//this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}

		public String get_pwd(){
			return new String(password.getPassword());
	
		}
		public String get_user(){
			return username.getText();
		}

		class ButtonListener1 implements ActionListener {
			public void actionPerformed(ActionEvent e){
				for(int i=0; i<__user__.length; i++){
					if(get_user().equals(__user__[i]) && get_pwd().equals(__pwd__[i])){
						JOptionPane.showMessageDialog(null,"Report has been sent!\n\n" + AllID.length+" tickets are sold today\n"
								+ "Beauty and Beast: " + MovieSale[0] + "\nKong: Skull Island: " + MovieSale[1]
								+ "\nLa La Land: " + MovieSale[2] + "\nMoonlight: " + MovieSale[3]
								+ "\nLogan: " + MovieSale[4] + "\n\n"
								+ "Child: "+ TypeSale[0] + "\nAdult: " +TypeSale[1]
								+ "\nSenior: " + TypeSale[2] + "\nStudent: " + TypeSale[3], "Report", JOptionPane.OK_OPTION);
						password.setText("");
						username.setText("");
						break;
					}
					if(__user__.length -1 == i) {
						JOptionPane.showMessageDialog(null, "Wrong Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
						password.setText("");
						username.setText("");
					}
				}
			}
		}
		
		class ButtonListener2 implements ActionListener {
			public void actionPerformed(ActionEvent e){
				Welcome WelcomeGUI = new Welcome();
				dispose();
			}
		}
}
