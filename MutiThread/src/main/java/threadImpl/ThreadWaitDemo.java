package threadImpl;

public class ThreadWaitDemo {
	Thread t1  = new Thread(new Runnable() {
		@Override
		public void run() {
			System.out.println("t1");
			try {
				System.out.println("等待");
				wait();
				System.out.println("醒來繼續做");
			} catch (InterruptedException e) {
				System.out.println("醒來了");
				e.printStackTrace();
			}
		}
	});
	
	Thread t2  = new Thread(new Runnable() {
		@Override
		public void run() {
			throw new IllegalArgumentException("qq");
			
		}
	});
}
