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
					System.out.println("��ı�A������");
					Thread.sleep(4*1000);
					System.out.println("���ӤF�A�~��");
					for(;;) {
						System.out.println("gogogoogogog");
					}
				} catch (InterruptedException e) {
					System.out.println("�Q�n���F�A�~��");
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		try {
			Thread.sleep(2*1000);
			t1.interrupt(); //�nsleep, interrupt�~����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
