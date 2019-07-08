package ThreadDeamon;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 DeamonThread dThread=new DeamonThread();
		 dThread.setDaemon(true);
		 dThread.start();
		 
		 for(int i=0;i<10;i++) {
			 
			 System.out.println(Thread.currentThread().getName().toUpperCase().charAt(0)+ "ain   Thread "+ i);
		 }
	}

}
