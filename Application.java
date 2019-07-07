package Thread;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Printer printer=new Printer();
		printer.setDaemon(true);
		printer.start();
		
		for(int h=0;h<10;h++) {
			
			System.out.println("main " +Thread.currentThread().getName()+"  "+h);
		}
          System.out.println("===========================================================");
	}

}
