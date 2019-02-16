import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
* Movie choice GUI
*/
public class Movie extends JFrame{
	JPanel ImgPanel=new JPanel();
	JLabel[][] choice=new JLabel[5][3];
	JPanel NamePanel=new JPanel();
	JPanel TimePanel=new JPanel();
	JPanel Selections=new JPanel();
	JLabel choiceWord=new JLabel("Movie selection:",JLabel.CENTER);
	JComboBox<String> option=new JComboBox<String>();
	JButton Next= new JButton();
	JPanel BottomButtons=new JPanel();
	JButton back=new JButton();
	JButton exit=new JButton("Exit");
	
	ImageIcon img;
	int width = 1100, height = 800;
	
	JPanel MainPanel1=new JPanel();
	JPanel MainPanel2=new JPanel();

	String images[]={"Image/Kong_SkullIsland.jpg","Image/LOGAN.jpg","Image/BeautyAndTheBeast.jpg","Image/MOONLIGHT.jpg","Image/LALALAND.jpg"};
	String MovieName_Labels[]={"Kong: Skull Island","118 min","Logan","135 min","Beauty and Beast","130 min","Moonlight","111 min","La La Land","128 min"};
	String[][] moviesInformation;
	
	/**
	* MovieGUI constructor
	*/
	public Movie(){
		super("Movies");
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
		this.getLayeredPane().add(bg,new Integer(Integer.MIN_VALUE));
		
		setSize(1100,800);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ImgPanel.setLayout(new GridLayout(1,5));
		ImgPanel.setOpaque(false);
		for(int i=0;i<5;i++){
			choice[i][0]=new JLabel();
	        choice[i][0].setIcon(new ImageIcon(images[i]));
	        choice[i][0].setOpaque(false);
	        
			ImgPanel.add(choice[i][0]);
		}
		
		MainPanel1.setLayout(new GridLayout(2,1,0,0));
		MainPanel1.setOpaque(false);
		MainPanel2.setLayout(new GridLayout(2,1,0,0));
		MainPanel2.setOpaque(false);
		NamePanel.setLayout(new GridLayout(1,5));
		NamePanel.setOpaque(false);
		for(int j=0;j<5;j++){
			choice[j][1]=new JLabel(MovieName_Labels[2*j]);
			choice[j][1].setOpaque(false);
			choice[j][1].setFont(new Font("Arial",Font.PLAIN,23));
			choice[j][1].setForeground(Color.white);
			NamePanel.add(choice[j][1]);
		}
		MainPanel2.add(NamePanel);
		
		TimePanel.setLayout(new GridLayout(1,5));
		TimePanel.setOpaque(false);
		for(int j=0;j<5;j++){
			choice[j][1]=new JLabel(MovieName_Labels[2*j+1]);
			choice[j][1].setOpaque(false);
			choice[j][1].setFont(new Font("Arial",Font.BOLD,50));
			choice[j][1].setForeground(Color.white);
			TimePanel.add(choice[j][1]);
		}
		MainPanel2.add(TimePanel);
		
		choiceWord.setFont(new Font("Arial",Font.BOLD, 50));
		choiceWord.setForeground(Color.white);
		choiceWord.setOpaque(false);
		option.setPreferredSize(new Dimension(500,50));
		for(int i=0;i<5;i++){			
			option.addItem(" " + MovieName_Labels[2*i]);			
		}
		Next.setText("Next");
		Next.setFont(new Font("Arial",Font.PLAIN, 25));
		Next.setForeground(Color.white);
		Next.setFont(new Font("Arial",Font.PLAIN, 25));
		Next.setBorder(BorderFactory.createRaisedBevelBorder()); 
		Selections.setOpaque(false);
		Selections.setLayout(new GridLayout(1,2,10,10));
		Selections.add(choiceWord);
		Selections.add(option);
		Selections.setOpaque(false);
		MainPanel1.add(Selections);
		
		back.setText("Back");
		back.setFont(new Font("Arial",Font.PLAIN, 25));
		back.setForeground(Color.white);
		back.setFont(new Font("Arial",Font.PLAIN, 25));
		back.setBorder(BorderFactory.createRaisedBevelBorder()); 
		exit.setFont(new Font("Arial",Font.PLAIN, 25));
		exit.setForeground(Color.white);
		exit.setBorder(BorderFactory.createRaisedBevelBorder()); 
		exit.setFont(new Font("Arial",Font.PLAIN, 25));
		
		BottomButtons.setOpaque(false);
		BottomButtons.setLayout(new FlowLayout(FlowLayout.CENTER,10,50));
		BottomButtons.add(Next);
		BottomButtons.add(back);
		BottomButtons.add(exit);
		MainPanel1.add(BottomButtons);
		
		this.add(MainPanel2);
		this.add(ImgPanel);
		this.add(MainPanel1);
		//this.setLocationRelativeTo(null);
		setVisible(true);
		
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				Welcome wel = new Welcome();
				dispose();
			}		
		});
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		Next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String optionValue=(String) option.getSelectedItem();
				Confirm Warning = new Confirm(optionValue,"You are ordering" + optionValue +"\n\n" );
				dispose();
			}		
		});
	}
}
