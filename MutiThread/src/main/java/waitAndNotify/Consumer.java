package waitAndNotify;

public class Consumer implements Runnable {
	private Clerk clerk;

	public Consumer(Clerk clerk) {
		this.clerk = clerk;
	}

	@Override
	public void run() {
		System.out.println("���O�̶}�l���Ӿ��...");
		for (int i = 1; i <= 10; i++) {
			try {
				clerk.getProduct(); // �q�����������~
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
