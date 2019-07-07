package Thread;

public class Printer extends Thread {
           
	
	public void run() {
		
		for(int i=0;i<100;i++) {
			
			System.out.println("Child " +currentThread().getName()+"  "+ i);
			
		}
	}
}
