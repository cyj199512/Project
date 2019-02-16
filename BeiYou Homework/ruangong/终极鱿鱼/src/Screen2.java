import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
* Screen2 GUI
*/
public class Screen2 extends JFrame {
	JButton[][] Seat = new JButton[4][8];
	JPanel[][] Panel = new JPanel[4][2];
	JPanel Panel2 = new JPanel();
	JButton Next = new JButton("Next");	
	JPanel[] HoriPanel = new JPanel[4];
	JLabel Screen = new JLabel("Screen 2",JLabel.CENTER);
	JComboBox Types = new JComboBox();  
	
    String[] typeWord={"Child","Adult","Senior","Student"};
    JPanel jp=new JPanel();
    JLabel choiceWord=new JLabel("Choose type:");

    ImageIcon img;
	int width = 1100, height = 800;

	int[][] states = new int[4][8];
	int[][] Sel = new int[4][8];
	int i,j;
	
	/**
	* Screen2 constructor
	* @param states
	* Determine whether this seat is ordered
	* @param TicketID
	* Generate new ticketID
	*/
	public Screen2(int[][] states,String TicketID){
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
		
		for(i=0; i<3; i++)
			for(j=0; j<6; j++){
				if(states[i][j] == 1){
					Seat[i][j] = new JButton("✩");
					Seat[i][j].setForeground(Color.red);
					Seat[i][j].setFont(new  Font("Arial",Font.BOLD, 20));
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
				if(states[3][j] == 1){
					Seat[3][j] = new JButton("✩");
					Seat[3][j].setBorder(BorderFactory.createRaisedBevelBorder());
					Seat[3][j].addActionListener(new ButtonListener());
				}
				else {
					Seat[3][j] = new JButton(Integer.toString(j+1));
					Seat[3][j].setBorder(BorderFactory.createRaisedBevelBorder());
					Seat[3][j].addActionListener(new ButtonListener());
				}
			}

		for(i=0; i<4; i++)
			for(j=0; j<2; j++)
				Panel[i][j] = new JPanel();

		for(i=0; i<4; i++){
			HoriPanel[i] = new JPanel();
			HoriPanel[i].setLayout(new GridLayout(1,2));
		}

		for(i=0; i<3; i++)
			for(j=0; j<6; j++)
				if(j<3){
					Seat[i][j].setFont(new  Font("Arial",Font.BOLD, 30));
					Seat[i][j].setForeground(Color.white);
					Panel[i][0].add(Seat[i][j]);}
				else{
					Seat[i][j].setFont(new  Font("Arial",Font.BOLD, 30));
					Seat[i][j].setForeground(Color.white);
					Panel[i][1].add(Seat[i][j]);}

		for(j=0; j<8; j++)
				if(j<4){
					Seat[3][j].setFont(new  Font("Arial",Font.BOLD, 30));
					Seat[3][j].setForeground(Color.white);
					Panel[3][0].add(Seat[3][j]);}
				else{
					Seat[3][j].setFont(new  Font("Arial",Font.BOLD, 30));
					Seat[3][j].setForeground(Color.white);
					Panel[3][1].add(Seat[3][j]);}

		for(i=0; i<4; i++)
			for(j=0; j<2; j++){
				Panel[i][j].setOpaque(false);
				HoriPanel[i].add(Panel[i][j]);}
		Screen.setOpaque(false);
		Screen.setForeground(Color.white);
		add(Screen);
		Screen.setFont(new Font("Arial",Font.BOLD,50));
		for(i=0; i<4; i++){
			HoriPanel[i].setOpaque(false);
			add(HoriPanel[i]);}

				jp.setOpaque(false);
				add(jp);
				jp.setLayout(new FlowLayout());
				jp.setForeground(Color.white);
				choiceWord.setFont(new Font("Arial",Font.BOLD,50));
				choiceWord.setForeground(Color.white);
				jp.add(choiceWord);
				choiceWord.setFont(new Font("Arial",Font.BOLD,50));
				jp.add(Types);
				Types.setPreferredSize(new Dimension(100,50));
				for(int i=0;i<4;i++){			
					Types.addItem(typeWord[i]);			
				}
		Next.setBorder(BorderFactory.createRaisedBevelBorder());
		Next.setForeground(Color.white);
		add(Next);
		setVisible(true);
		setSize(1100,800);
		
		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String optionValue=(String) Types.getSelectedItem();
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
				for(int i=0;i<4;i++){
					for(int j=0;j<8;j++){
						if(Sel[i][j]==1){
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
	}
	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			for(i=0; i<4; i++)
				for(j=0; j<8; j++)
					if(e.getSource()==Seat[i][j] && (e.getActionCommand().equals("1")||e.getActionCommand().equals("2")||e.getActionCommand().equals("3")||
						e.getActionCommand().equals("4")||e.getActionCommand().equals("5")||e.getActionCommand().equals("6")||e.getActionCommand().equals("7")||
						e.getActionCommand().equals("8"))) {
							Seat[i][j].setText("✩");
							Sel[i][j] = 1;
						}
						
						else if(e.getSource()==Seat[i][j] && e.getActionCommand()=="✩"){
							System.out.println(e.getActionCommand());
							Seat[i][j].setText(Integer.toString(j+1));
							Sel[i][j] = 0;
						}
						else
							continue;
		}
	}
}
