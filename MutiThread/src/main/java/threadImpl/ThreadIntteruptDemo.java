package threadImpl;

public class ThreadIntteruptDemo {
	public static void main(String[] args){
		System.out.println("main start");
		Thread t1  = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("t1 start");
				
				try {
					//
					System.out.println("睡覺，等等醒");
					Thread.sleep(4*1000);
					System.out.println("醒來了，繼續做");
					for(;;) {
						System.out.println("gogogoogogog");
					}
				} catch (InterruptedException e) {
					System.out.println("被吵醒了，繼續做");
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		try {
			Thread.sleep(2*1000);
			t1.interrupt(); //要sleep, interrupt才有用
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
