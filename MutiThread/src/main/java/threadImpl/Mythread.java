package threadImpl;

public class Mythread extends Thread {

	public void run() {
			try {
				Thread.sleep(3*1000);
				for (int i=0; i<3 ;i++) { // infinite loop to print message
					System.out.println("Mythread");
				}
			} catch (InterruptedException e) {
				System.out.println("§Ú¿ô¤F");
				e.printStackTrace();
			}
		
	}
}
