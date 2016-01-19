package waitAndNotify;

public class Producer implements Runnable {
	private Clerk clerk;

	public Producer(Clerk clerk) {
		this.clerk = clerk;
	}

	@Override
	public void run() {
		System.out.println("生產者開始生產整數....");
		for (int product = 1; product <= 10; product++) {
			try {
				clerk.setProduct(product);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
