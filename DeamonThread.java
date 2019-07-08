package ThreadDeamon;

public class DeamonThread extends Thread{

	public void run() {
		
		for(int a=0;a<25;a++) {
			
			System.out.println("Deamon " +Thread.currentThread().getName() + a );
		}
	}
	
}
