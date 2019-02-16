import java.io.Serializable;
import java.util.GregorianCalendar;

public class SavingAccount extends BankAccount implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3859829867988684996L;
	
	protected GregorianCalendar noticeDate=new GregorianCalendar();
	protected boolean Noticed = false;

	public SavingAccount(int accNo,String accName,String PIN) {
	        super(accNo,accName,PIN);
	        accountType=0;
	}
	 
	public boolean isNoticed(){
		 return this.Noticed;
	}
	 
	public void setNotice(GregorianCalendar noticeDate){
		 this.Noticed = true;
		 this.noticeDate=noticeDate;
	}


	public GregorianCalendar getNoticeDate() {
	     return noticeDate;
	}
    
}
