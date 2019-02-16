import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Movie time GUI
 */
public class Time extends JFrame{
	JPanel p1=new JPanel();
	JLabel head=new JLabel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JButton[] TimeButtons=new JButton[5]; 
	JLabel[] TimeLabels=new JLabel[5];
	FileContentHandling FileHandle=new FileContentHandling("Tickets.txt");
	int[] CurTime = new int[2];
	ImageIcon img;
	int width = 1100, height = 800;
	String movies[][]={{"Beauty and Beast","Kong: Skull Island",""},{"La La Land","Moonlight","Kong: Skull Island"},{"Beauty and Beast","Logan","Kong: Skull Island"}};
	
	/**
	 * Get system current time
	 * @return
	 * return an int[2] including current hour and min using for compare
	 */
	public int[] CurrentTime(){
		int[] time = new int[2];
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		time[0] = Integer.parseInt(df.format(new Date()).substring(11,13));
		time[1] = Integer.parseInt(df.format(new Date()).substring(14,16));
		//String sec = df.format(new Date()).substring(17,19);
		//System.out.println(df.format(new Date()));
		return time;
	}
	/**
	 * Movie time GUI constructor
	 * @param movie
	 * Movie chose
	 * @param time
	 * Get timetable
	 * @param screen
	 * Get all screens which will display this movie
	 * @param order
	 * Determine whether ordered or not
	 */
	public Time(String movie,String[] time,String[] screen,String[] order){
		super("Order");
		CurTime = CurrentTime();
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
		
		setSize(1100,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int index=screen.length;
		int in=0;
		for(;in<index;in++){
			if(screen[in].equals("0"))
				break;
		}
		
		head.setText(movie);
		head.setFont(new Font("Arial",Font.BOLD, 80));
		head.setOpaque(false);
		head.setForeground(Color.white);
		p1.add(head);
		p1.setOpaque(false);
		add(p1);
		p2.setLayout(new GridLayout(2, in));
		p2.setOpaque(false);
		for(int i=0;i<5;i++){
			TimeButtons[i]=new JButton();
		}
		for(int i=0;i<in;i++){
			TimeButtons[i].setText(time[i]);
			//System.out.println(TimeButtons[i].getText());
			TimeButtons[i].setFont(new Font("Arial",Font.PLAIN, 25));
			
			TimeButtons[i].setForeground(Color.white);
			TimeButtons[i].setBorder(BorderFactory.createRaisedBevelBorder());
			p2.add(TimeButtons[i]);
		}
		for(int i=0;i<in;i++){
			TimeLabels[i]=new JLabel("  Screen "+screen[i]);
			TimeLabels[i].setFont(new Font("Arial",Font.BOLD,40));
			TimeLabels[i].setForeground(Color.white);
			p2.add(TimeLabels[i]);
		}
		add(p2);
		
		p3.setLayout(new FlowLayout());
		p3.setOpaque(false);
		JButton BackButton=new JButton("back");
		BackButton.setOpaque(false);
		BackButton.setBorder(BorderFactory.createRaisedBevelBorder());
		BackButton.setForeground(Color.white);
		BackButton.setFont(new Font("Arial",Font.PLAIN, 25));
		p3.add(BackButton);
		add(p3);
		//this.setLocationRelativeTo(null);
		setVisible(true);
		
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Movie mi=new Movie();
				dispose();
			}
		});
		
		TimeButtons[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int k=1;
				for(;k<=3;k++){
					if(movie.equals(movies[Integer.parseInt(screen[0])-1][k-1])){
						break;
					}
				}
				String ticketID=screen[0]+k+order[0];
				int snum=Integer.parseInt(screen[0]);
				if(Integer.parseInt(TimeButtons[0].getText().substring(0,2)) < CurTime[0]) {
					JOptionPane.showMessageDialog(null,"The film has already begun", "Failed", JOptionPane.OK_OPTION);
					Movie Movie = new Movie();
					dispose();
				}
				else if(Integer.parseInt(TimeButtons[0].getText().substring(0,2)) == CurTime[0]){
					if(Integer.parseInt(TimeButtons[0].getText().substring(3,5)) <= CurTime[1]){
						JOptionPane.showMessageDialog(null,"The film has already begun", "Failed", JOptionPane.OK_OPTION);
						Movie Movie = new Movie();
						dispose();
					}
					else{
						switch(snum){
						case 1: 
							Screen1 screen1=new Screen1(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 2: 
							Screen2 screen2=new Screen2(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 3: 
							Screen3 screen3=new Screen3(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						default:
							System.out.println("Error!");
						}
					}
				}
				else{
					switch(snum){
						case 1: 
							Screen1 screen1=new Screen1(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 2: 
							Screen2 screen2=new Screen2(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 3: 
							Screen3 screen3=new Screen3(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						default:
							System.out.println("Error!");
					}
				}
				dispose();
			}
		});
		TimeButtons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int k=1;
				for(;k<=3;k++){
					if(movie.equals(movies[Integer.parseInt(screen[1])-1][k-1])){
						break;
					}
				}
				String ticketID=screen[1]+k+order[1];
				int snum=Integer.parseInt(screen[1]);
				if(Integer.parseInt(TimeButtons[1].getText().substring(0,2)) < CurTime[0]) {
					JOptionPane.showMessageDialog(null,"The film has already begun", "Failed", JOptionPane.OK_OPTION);
					Movie Movie = new Movie();
					dispose();
				}
				else if(Integer.parseInt(TimeButtons[1].getText().substring(0,2)) == CurTime[0]){
					if(Integer.parseInt(TimeButtons[1].getText().substring(3,5)) <= CurTime[1]){
						JOptionPane.showMessageDialog(null,"The film has already begun", "Failed", JOptionPane.OK_OPTION);
						Movie Movie = new Movie();
						dispose();
					}
					else{
						switch(snum){
						case 1: 
							Screen1 screen1=new Screen1(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 2: 
							Screen2 screen2=new Screen2(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 3: 
							Screen3 screen3=new Screen3(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						default:
							System.out.println("Error!");
						}
					}
				}
				else{
					switch(snum){
						case 1: 
							Screen1 screen1=new Screen1(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 2: 
							Screen2 screen2=new Screen2(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 3: 
							Screen3 screen3=new Screen3(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						default:
							System.out.println("Error!");
					}
				}
				dispose();
			}
		});
		TimeButtons[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int k=1;
				for(;k<=3;k++){
					if(movie.equals(movies[Integer.parseInt(screen[2])-1][k-1])){
						break;
					}
				}
				String ticketID=screen[2]+k+order[2];
				int snum=Integer.parseInt(screen[2]);
				if(Integer.parseInt(TimeButtons[2].getText().substring(0,2)) < CurTime[0]) {
					JOptionPane.showMessageDialog(null,"The film has already begun", "Failed", JOptionPane.OK_OPTION);
					Movie Movie = new Movie();
					dispose();
				}
				else if(Integer.parseInt(TimeButtons[2].getText().substring(0,2)) == CurTime[0]){
					if(Integer.parseInt(TimeButtons[2].getText().substring(3,5)) <= CurTime[1]){
						JOptionPane.showMessageDialog(null,"The film has already begun", "Failed", JOptionPane.OK_OPTION);
						Movie Movie = new Movie();
						dispose();
					}
					else{
						switch(snum){
						case 1: 
							Screen1 screen1=new Screen1(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 2: 
							Screen2 screen2=new Screen2(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 3: 
							Screen3 screen3=new Screen3(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						default:
							System.out.println("Error!");
						}
					}
				}
				else{
					switch(snum){
						case 1: 
							Screen1 screen1=new Screen1(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 2: 
							Screen2 screen2=new Screen2(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 3: 
							Screen3 screen3=new Screen3(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						default:
							System.out.println("Error!");
					}
				}
				dispose();
			}
		});
		TimeButtons[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int k=1;
				for(;k<=3;k++){
					if(movie.equals(movies[Integer.parseInt(screen[3])-1][k-1])){
						break;
					}
				}
				String ticketID=screen[3]+k+order[3];
				int snum=Integer.parseInt(screen[3]);
				if(Integer.parseInt(TimeButtons[3].getText().substring(0,2)) < CurTime[0]) {
					JOptionPane.showMessageDialog(null,"The film has already begun", "Failed", JOptionPane.OK_OPTION);
					Movie Movie = new Movie();
					dispose();
				}
				else if(Integer.parseInt(TimeButtons[3].getText().substring(0,2)) == CurTime[0]){
					if(Integer.parseInt(TimeButtons[3].getText().substring(3,5)) <= CurTime[1]){
						JOptionPane.showMessageDialog(null,"The film has already begun", "Failed", JOptionPane.OK_OPTION);
						Movie Movie = new Movie();
						dispose();
					}
					else{
						switch(snum){
						case 1: 
							Screen1 screen1=new Screen1(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 2: 
							Screen2 screen2=new Screen2(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 3: 
							Screen3 screen3=new Screen3(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						default:
							System.out.println("Error!");
						}
					}
				}
				else{
					switch(snum){
					case 1: 
						Screen1 screen1=new Screen1(FileHandle.readFileSeat(ticketID),ticketID);
					break;
					
					case 2: 
						Screen2 screen2=new Screen2(FileHandle.readFileSeat(ticketID),ticketID);
					break;
					
					case 3: 
						Screen3 screen3=new Screen3(FileHandle.readFileSeat(ticketID),ticketID);
					break;
					
					default:
						System.out.println("Error!");
					}
				}
				dispose();
			}
		});
		TimeButtons[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int k=1;
				for(;k<=3;k++){
					if(movie.equals(movies[Integer.parseInt(screen[4])-1][k-1])){
						break;
					}
				}
				String ticketID=screen[4]+k+order[4];
				int snum=Integer.parseInt(screen[4]);
				if(Integer.parseInt(TimeButtons[4].getText().substring(0,2)) < CurTime[0]) {
					JOptionPane.showMessageDialog(null,"The film has already begun", "Failed", JOptionPane.OK_OPTION);
					Movie Movie = new Movie();
					dispose();
				}
				else if(Integer.parseInt(TimeButtons[4].getText().substring(0,2)) == CurTime[0]){
					if(Integer.parseInt(TimeButtons[4].getText().substring(3,5)) <= CurTime[1]){
						JOptionPane.showMessageDialog(null,"The film has already begun", "Failed", JOptionPane.OK_OPTION);
						Movie Movie = new Movie();
						dispose();
					}
					else{
						switch(snum){
						case 1: 
							Screen1 screen1=new Screen1(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 2:
							Screen2 screen2=new Screen2(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 3: 
							Screen3 screen3=new Screen3(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						default:
							System.out.println("Error!");
						}
					}
				}
				else{
					switch(snum){
						case 1: 
							Screen1 screen1=new Screen1(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 2:
							Screen2 screen2=new Screen2(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						case 3: 
							Screen3 screen3=new Screen3(FileHandle.readFileSeat(ticketID),ticketID);
						break;
						
						default:
							System.out.println("Error!");
					}
				}
				dispose();
			}
		});
	}
}
