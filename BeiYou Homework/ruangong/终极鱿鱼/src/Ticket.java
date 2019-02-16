import java.lang.*;
/**
 * TicketID class
 * Generate TicketID
 */
public class Ticket {
	String ID;
	int screen,movie,order,row,col,thisType;
	String studentID = "null";
	String identify;
	String movies[][] = {{"Beauty and Beast","Kong: Skull Island",""},{"La La Land","Moonlight","Kong: Skull Island"},{"Beauty and Beast","Logan","Kong: Skull Island"}};
	String type[] = {"Child","Adult","Senior","Student"};
	String time[][][] = {{{"10:00","12:30",""},{"15:30","18:30","21:00"},{"","",""}},{{"10:30","13:00",""},{"16:00","18:00",""},{"20:00","",""}},{{"10:30","13:00",""},{"15:30","18:00",""},{"20:30","",""}}};
	
	/**
	 * Pass an ID and split it for each attribute
	 * @param ID
	 * Ticket ID
	 */
	public Ticket(String ID){
		this.ID = ID;
		this.screen = Integer.parseInt(ID.substring(0, 1));
		//1 for Screen
		this.movie = Integer.parseInt(ID.substring(1, 2));
		// 2 for Movie
		this.order = Integer.parseInt(ID.substring(2, 3));
		// 3 for Order
		this.row = (Integer.parseInt(ID.substring(3, 4))-1)*4+Integer.parseInt(ID.substring(4, 5))-1;
		// 4,5 For row number	
		this.col = (Integer.parseInt(ID.substring(5, 6))-1)*4+Integer.parseInt(ID.substring(6, 7))-1;
		//6,7 For column number
		this.thisType = Integer.parseInt(ID.substring(7, 8));
		// 8 for Type
		this.identify = ID.substring(0, 3);
	}
	
	/**
	 * Pass an ID and split it for each attribute
	 * @param ID
	 * Ticket ID
	 * @param studentID
	 * Pass in a student ticket ID with its student ID
	 */
	public Ticket(String ID, String studentID){
		this.ID = ID;
		this.screen = Integer.parseInt(ID.substring(0, 1));
		this.movie = Integer.parseInt(ID.substring(1, 2));
		this.order = Integer.parseInt(ID.substring(2, 3));		
		this.row = (Integer.parseInt(ID.substring(3, 4))-1)*4+Integer.parseInt(ID.substring(4, 5))-1;	
		this.col = (Integer.parseInt(ID.substring(5, 6))-1)*4+Integer.parseInt(ID.substring(6, 7))-1;
		this.thisType = Integer.parseInt(ID.substring(7, 8));
		this.identify = ID.substring(0, 3);
		this.studentID = studentID;
	}
	
	/**
	 * Print what information this ticket has
	 */
	public String toString(){
		return "Time: "+time[screen-1][movie-1][order-1]+"\n"+"Name: "+movies[screen-1][movie-1]+"\nScreen: "+screen + "\nSeat: "+(char)(row+64)+(col)+"\nType: "+type[thisType-1] + "\nStudent ID: " + studentID + "\nTicket ID: "+ID;
	}
}
