import java.io.*;

/**
 * All IO and file operation class
 */
public class FileContentHandling {

	private String path;
	
	/**
	 * Get file path
	 * @param path
	 * pass file path to attribute
	 */
	public FileContentHandling(String path){
		this.path=path;
	}
	
	/**
	 * Read movie names
	 * @return
	 * Return string[] including movie names
	 */
	public String[] R_Movie(){
		String ReadContents;
		ReadContents=getRead(path);	
		String[] contents=Movie(ReadContents);
		return contents;
	}
	
	/**
	 * Read movie times
	 * @return
	 * Return string[] including movie time
	 */
	public String[][] R_Time(){
		String ReadContents;
		ReadContents=getRead(path);	
		String[][] contents=Time(ReadContents);
		return contents;
	}
	
	/**
	 * Read movie screen
	 * @return
	 * Return string[] including movie screen
	 */
	public String[][] R_Screen(){
		String ReadContents;
		ReadContents=getRead(path);	
		String[][] contents=Screen(ReadContents);
		return contents;
	}
	
	/**
	 * Read whether ordered or not
	 * @return
	 * Return string[] of order
	 */
	public String[][] R_Order(){
		String ReadContents;
		ReadContents=getRead(path);	
		String[][] contents=Order(ReadContents);
		return contents;
	}
	
	/**
	 * Read tickets information
	 * @return
	 * Return string[] of ticket ID
	 */
	public String[] R_Ticket(){
		String ReadContents;
		ReadContents=getRead(path);
		String[] contents=Ticket(ReadContents);
		return contents;
	}
	
	/**
	 * 
	 * @return
	 * Return string[] of ID of student tickets
	 */
	public String[] R_Student(){
		String ReadContents;
		ReadContents=getRead(path);	
		String[] contents=Student(ReadContents);
		return contents;
	}
	
	/**
	 * Read seat states
	 * @param ticketID
	 * Read ticket ID and determine seat states
	 * @return
	 * Return int[] of seats states
	 */
	public int[][] readSeat(String[] ticketID){
		int[][] rt=new int[5][8];
		for(int i=0;i<5;i++)
			for(int j=0;j<8;j++)
				rt[i][j]=0;
		int len=ticketID.length;
		for(int k=0;k<len;k++){
			Ticket tid=new Ticket(ticketID[k]);
			rt[tid.row-1][tid.col-1]=1;
		}
		return rt;
	}
	
	/**
	 * Read seat states II
	 * @param str
	 * File contents
	 * @return
	 * Return int[] of seats states
	 */
	public int[][] readFileSeat(String str){
		FileContentHandling sh =new FileContentHandling(path);
		String[] tic=sh.R_Ticket();
		int len=tic.length;
		String[] ticket=new String[len];		
		for(int a=0;a<len;a++)
			ticket[a]="";
		int j=0;
		for(int i=0;i<len;i++){
			Ticket tid=new Ticket(tic[i]);
			if(tid.identify.equals(str)){
				ticket[j]=tid.ID;
				j++;
			}
		}
		String[] rt=new String[j];
		for(int a=0;a<j;a++)
			rt[a]=ticket[a];
		return sh.readSeat(rt);
	}
	
	/**
	 * Write string[] into file
	 * @param str
	 * String[] waiting for writing
	 */
	public void writeFileArray(String[] str){
		String strCon=Connect(str);
		write(path, strCon);
	}
	
	/**
	 * Write string into file
	 * @param str
	 * String waiting for writing
	 */
	public void writeFileArray2(String str){
		write(path, str);
	}
	
	/**
	 * Write string into file and plus an ";"
	 * @param str
	 * String waiting for writing
	 */
	public void writeFileString(String str){
		str=str+";";
		write(path, str);
	}
	
	/**
	 * Write method
	 * @param path
	 * File path
	 * @param data
	 * Data need to be written
	 */
	public void write(String path, String data){
		try{
			File file =new File(path);
			if(!file.exists())
				file.createNewFile();
			FileWriter fileWritter = new FileWriter(file.getName(),true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write(data);
			//System.out.println("Write: "+ data);
			bufferWritter.flush();
			bufferWritter.close();
		}
		catch(IOException e){
		      e.printStackTrace();
		}
	}
	
	/**
	 * Read file
	 * @param path
	 * File path
	 * @return
	 * Return all contents in the file
	 */
	public String getRead(String path){
		String contents = "";
		try {
				FileReader fileReader = new FileReader(path);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String oneLine = bufferedReader.readLine();
				while (oneLine != null) {
				contents = contents + oneLine;
				oneLine = bufferedReader.readLine();
			}
			bufferedReader.close();
			fileReader.close();
		}
		catch (IOException e) {
			System.out.println("Err");
		}
		return contents;
	}
	
	/**
	 * Get movie name from file
	 * @param str
	 * File contents
	 * @return
	 * Return a string[] including all movie names
	 */
	public String[] Movie(String str){	
		String[] splitStr = str.split(";");
		String[] name=new String[5];
		for(int i=0;i<5;i++)
			name[i]=splitStr[i*16];
		return name;
	}
	
	/**
	 * Get movie time from file
	 * @param str
	 * File contents
	 * @return
	 * Return a string[] including all movie times
	 */
	public String[][] Time(String str){
		String[] splitStr = str.split(";");
		String[][] time=new String[5][5];
		for(int i=0; i < 5; i++)
			for(int j=0;j<5;j++)			
				time[i][j]="";
		for(int i=0; i < 5; i++)
			for(int j=0;j<5;j++)
				time[i][j]=splitStr[i*16+j*3+1];
		return time;
	}
		
	/**
	 * Get movie screen from file
	 * @param str
	 * File contents
	 * @return
	 * Return a string[] including all movie screen
	 */
	public String[][] Screen(String str){
		String[] splitStr = str.split(";");
		String[][] screen =new String[5][5];
		for(int i=0; i < 5; i++)
			for(int j=0;j<5;j++)
				screen[i][j]="";
		for(int i=0; i < 5; i++)
			for(int j=0;j<5;j++)
				screen[i][j]=splitStr[i*16+j*3+2];
		return screen;
	}
		
	/**
	 * Get movie orders from file
	 * @param str
	 * File contents
	 * @return
	 * Return a string[] including all movie orders
	 */
	public String[][] Order(String str){
		String[] splitStr = str.split(";");
		String[][] order = new String[5][5];
		for(int i=0; i < 5; i++)
			for(int j=0;j<5;j++)	
				order[i][j]="";
		for(int i=0; i < 5; i++)
			for(int j=0;j<5;j++)
				order[i][j]=splitStr[i*16+j*3+3];
		return order;
	}
		
	/**
	 * Get ticketsID from file
	 * @param str
	 * File contents
	 * @return
	 * Return a string[] including all tickets sold ID
	 */
	public String[] Ticket(String str){
		String[] contents=str.split(";");
		String[] rt=new String[contents.length/2];
		for(int i=0;i<contents.length/2;i++)
			rt[i]="";
		for(int i=0;i<contents.length/2;i++)
			rt[i]=contents[2*i];
		return rt;
	}
	
	/**
	 * Get student tickets' student ID
	 * @param str
	 * File contents
	 * @return
	 * Return a string[] including all student IDs
	 */
	public String[] Student(String str){
		String[] contents=str.split(";");
		String[] rt=new String[contents.length/2];
		for(int i=0;i<contents.length/2;i++)
			rt[i]="";
		for(int i=0;i<contents.length/2;i++)
			rt[i]=contents[2*i+1];
		return rt;
	}

	/**
	 * Connect separated string
	 * @param strarr
	 * File contents
	 * @return
	 * Return String of new connected string
	 */
	public String Connect(String[] strarr){
		String str="";
		for(int i=0;i<strarr.length;i++)
			str=str+strarr[i]+";";
		return str;
	}
}
