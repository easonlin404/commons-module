package threadImpl;

public class ThreadWaitDemo {
	Thread t1  = new Thread(new Runnable() {
		@Override
		public void run() {
			System.out.println("t1");
			try {
				System.out.println("����");
				wait();
				System.out.println("�����~��");
			} catch (InterruptedException e) {
				System.out.println("���ӤF");
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
