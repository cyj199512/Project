import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * Warning GUI including payment confirmation and movie choice confirmation
 */
public class Confirm extends JFrame {
	JButton yes=new JButton("Yes");
	JButton no=new JButton("No ");
	FileContentHandling MovieFileHandle=new FileContentHandling("Movies.txt");	
	String movie[]=MovieFileHandle.R_Movie();
	String time[][]=MovieFileHandle.R_Time();
	String screen[][]=MovieFileHandle.R_Screen();
	String order[][]=MovieFileHandle.R_Order();
	FileContentHandling TicketFileHandle=new FileContentHandling("Tickets.txt");	
	
	/**
	 * Choice confirmation
	 * @param option
	 * Movie choice
	 * @param Fname
	 * Extends super class
	 */
	public Confirm(String option,String Fname){
		super(Fname);
		setSize(400,50);
		//setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		FlowLayout flo=new FlowLayout();
		setLayout(flo);
		add(yes);
		add(no);
				no.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Movie mi=new Movie();
						dispose();
					}
				});
				
		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<5;i++){
					if(option.equals(" " +  movie[i])){
						Time cti=new Time(movie[i],time[i], screen[i],order[i]);
						break;
					}
				}
				dispose();
			}
		});
		
		this.getContentPane().setBackground(Color.white);
		setVisible(true);
	}

	/**
	 * Payment confirmation
	 * @param TicketID
	 * TicketID generation and write into file
	 * @param StudentID
	 * If it belongs to student ticket write studentID into file
	 */
	public Confirm(String[] TicketID,String[] StudentID){
		super("Sure to pay?");
		//setLocationRelativeTo(null);
		setSize(400,50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		add(yes);
		add(no);
		this.getContentPane().setBackground(Color.white);
		setVisible(true);
		
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Movie mi=new Movie();
				dispose();
			}
		});
				
		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String infor[]=new String[TicketID.length+StudentID.length];
				int j=0;
				for(int i=0;i<TicketID.length;i++){
					infor[j++]=TicketID[i];
					infor[j++]=StudentID[i];
				}
					
				for(int k=0; k<infor.length; k+=2) {
					if(k < infor.length - 1){
						if(infor[k].length() == 8 ){
							//System.out.println(infor[k] + ";" + infor[k+1] + ";\n");
							TicketFileHandle.writeFileArray2(infor[k] + ";" + infor[k+1] + ";\n");
							
						}
						else
							TicketFileHandle.writeFileArray2(infor[k+1] + ";" + infor[k] + ";\n");
					}
						else if(k == infor.length -1) 
						break;
				}
			Success suc = new Success(TicketID, StudentID);
			dispose();
			}
		});
	}
}
