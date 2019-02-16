import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Screen3 GUI
 */
public class Screen3 extends JFrame {
	JButton[][] Seat = new JButton[5][8];
	JPanel[][] Panel = new JPanel[5][3];
	JPanel Panel2 = new JPanel();
	JPanel[] FirstPanel = new JPanel[4];
	ImageIcon img;
	int width = 1100, height = 800;
	
	JComboBox Kind = new JComboBox();  
	JButton Next = new JButton("Next");	
	JLabel Screen = new JLabel("Screen 3",JLabel.CENTER);
	int[][] states = new int[5][8];
	int[][] Select = new int[5][8];
	int i,j;
	
	String[] typeWord={"Child","Adult","Senior","Student"};
    JPanel jp=new JPanel();
    JLabel choiceWord=new JLabel("Choose type:");
    Font choiceFont = new Font("Arial",Font.BOLD,50);
    
    /**
	* Screen3 constructor
	* @param states
	* Determine whether this seat is ordered
	* @param TicketID
	* Generate new ticketID
	*/
	public Screen3(int[][] states,String TicketID){
		this.states=states;
		JLabel bg = new JLabel(img);
		img = new ImageIcon("Image/BG.jpg");
		Image image = img.getImage();
		image = image.getScaledInstance(width, height, Image.SCALE_DEFAULT); 
		img.setImage(image); 
		bg.setIcon(img);  
		bg.setSize(width, height); 
		JPanel imgPanel = (JPanel)this.getContentPane();
		imgPanel.setOpaque(false);
		imgPanel.setLayout(new GridLayout(0,1));
		this.getLayeredPane().setLayout(null);
		this.getLayeredPane().add(bg, new Integer(Integer.MIN_VALUE));
		
		for(i=0; i<4; i++)
			for(j=0; j<6; j++){
				if(states[i][j] == 1){
					Seat[i][j] = new JButton("✩");
					Seat[i][j].setBorder(BorderFactory.createRaisedBevelBorder());
					Seat[i][j].addActionListener(new ButtonListener());
				}
				else {
					Seat[i][j] = new JButton(Integer.toString(j+1));
					Seat[i][j].setBorder(BorderFactory.createRaisedBevelBorder());
					Seat[i][j].addActionListener(new ButtonListener());
				}
			}

		for(j=0; j<8; j++){
				if(states[4][j] == 1){
					Seat[4][j] = new JButton("✩");
					Seat[4][j].setBorder(BorderFactory.createRaisedBevelBorder());
					Seat[4][j].addActionListener(new ButtonListener());
				}
				else {
					Seat[4][j] = new JButton(Integer.toString(j+1));
					Seat[4][j].setBorder(BorderFactory.createRaisedBevelBorder());
					Seat[4][j].addActionListener(new ButtonListener());
				}
			}

		for(i=0; i<4; i++)
			for(j=0; j<3; j++)
				Panel[i][j] = new JPanel();

		for(i=0; i<4; i++){
			FirstPanel[i] = new JPanel();
			FirstPanel[i].setLayout(new GridLayout(1,3));
		}

		Panel[4][0] = new JPanel();

		for(i=0; i<3; i++)
			for(j=0; j<6; j++)
				if(j<2){
					Seat[i][j].setFont(new Font("Arial",Font.BOLD, 30));
					Seat[i][j].setForeground(Color.white);
					Panel[i][0].add(Seat[i][j]);}
				else if(j<4 && j>=2){
					Seat[i][j].setFont(new Font("Arial",Font.BOLD, 30));
					Seat[i][j].setForeground(Color.white);
					Panel[i][1].add(Seat[i][j]);}
				else{
					Seat[i][j].setFont(new Font("Arial",Font.BOLD, 30));
					Seat[i][j].setForeground(Color.white);
					Panel[i][2].add(Seat[i][j]);}

		for(j=0; j<8; j++){
			Seat[4][j].setFont(new Font("Arial",Font.BOLD, 30));
			Seat[4][j].setForeground(Color.white);
				Panel[4][0].add(Seat[4][j]);}

		for(i=0; i<4; i++)
			for(j=0; j<3; j++){
				Panel[i][j].setOpaque(false);
				FirstPanel[i].add(Panel[i][j]);}
		Screen.setOpaque(false);
		Screen.setForeground(Color.white);
		add(Screen);
		Screen.setFont(choiceFont);
		for(i=0; i<4; i++){
			FirstPanel[i].setOpaque(false);
			add(FirstPanel[i]);}
		Panel[4][0].setOpaque(false);
		add(Panel[4][0]);
		jp.setForeground(Color.white);
		jp.setOpaque(false);
		add(jp);
		jp.setLayout(new FlowLayout());
		choiceWord.setForeground(Color.white);
		choiceWord.setOpaque(false);
		jp.add(choiceWord);
		choiceWord.setFont(choiceFont);
		jp.add(Kind);
		Kind.setPreferredSize(new Dimension(100,50));
		for(int i=0;i<4;i++){			
			Kind.addItem(typeWord[i]);			
		}
		Next.setBorder(BorderFactory.createRaisedBevelBorder());
		Next.setForeground(Color.white);
		add(Next);
		setSize(1100,800);
		
		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String optionValue=(String) Kind.getSelectedItem();
				int type=0;
				for(;type<4;type++){
					if(typeWord[type].equals(optionValue)){
						type++;
						break;
					}						
				}
				
				int seatOrder=0;
				int[] x=new int[32];
				int[] y=new int[32];
				for(int i=0;i<32;i++){
					x[i]=-1;
					y[i]=-1;
				}
				for(int i=0;i<5;i++){
					for(int j=0;j<8;j++){
						if(Select[i][j]==1){
							x[seatOrder]=i+1;
							y[seatOrder]=j+1;
							seatOrder++;
						}
					}
				}
				String[] xx=new String[seatOrder];
				String[] yy=new String[seatOrder];
				String[] ticketID0=new String[seatOrder];
				String[] studentID0=new String[seatOrder];
				
				for(int a=0;a<seatOrder;a++){
					xx[a]=(x[a]/4+1)+""+(x[a]%4+1);
					yy[a]=(y[a]/4+1)+""+(y[a]%4+1);
					ticketID0[a]=TicketID+xx[a]+yy[a]+type;
					studentID0[a]="0";
				}
				
				if(type==4){
					for(int b=0;b<seatOrder;b++){
						studentID0[b] = (String) JOptionPane.showInputDialog
								(null, "Student ID\n", "ID", JOptionPane.PLAIN_MESSAGE, null, null,  "");
					}
				}
				dispose();
				Confirm war=new Confirm(ticketID0, studentID0);
			}
		});
		
		setVisible(true);
	}

	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			for(i=0; i<5; i++)
				for(j=0; j<8; j++)
					if(e.getSource()==Seat[i][j] && (e.getActionCommand().equals("1")||e.getActionCommand().equals("2")||e.getActionCommand().equals("3")||
						e.getActionCommand().equals("4")||e.getActionCommand().equals("5")||e.getActionCommand().equals("6")||e.getActionCommand().equals("7")||
						e.getActionCommand().equals("8"))) {
							Seat[i][j].setText("✩");
							Select[i][j] = 1;
						}
						else if(e.getSource()==Seat[i][j] && e.getActionCommand()=="✩"){
							System.out.println(e.getActionCommand());
							Seat[i][j].setText(Integer.toString(j+1));
							Select[i][j] = 0;
						}
						else
							continue;
		}
	}
}
