import java.util.Map.Entry;

public class Timer extends Thread {
	public void run(){
		while(true){
			int t=((int)(System.currentTimeMillis()/1000))%10;
			if(t== 0){
				for(Entry<Integer,BankAccount> s:Main.status.accounts.entrySet()){
					s.getValue().clear();
					
					Main.status.saveAccount();
					Main.status.saveCustomers();
				}
			}
		}
	}
}
