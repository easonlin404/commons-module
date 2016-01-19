package waitAndNotify;

public class Clerk {
	private int product = -1; //只持有一個產品，-1 表示沒有產品
	
	public synchronized void setProduct(int product) throws InterruptedException {
		waitIfFull(); //看看店員有沒有空間收產品，沒有就稍後
		this.product = product;
		System.out.printf("生產者設定(%d)%n", this.product);
		notify();//通知等待集合中的執行緒(例如消費者)
		
	}
	
	private synchronized void waitIfFull() throws InterruptedException{
		while( this.product != -1) { 
			wait();
		}
	}
	
	public synchronized int getProduct() throws InterruptedException{
		waitIfEmpty(); //看看目前店員有沒有貨，沒有的話就稍後
		int p = this.product; //準備交貨
		this.product = -1;  //表是貨品被取走
		System.out.printf("消費者取走 (%d)%n",p);
		notify(); //通知等待集合中的執行緒(例如生產者)
		return p;
		
	}
	
	private synchronized void waitIfEmpty() throws InterruptedException{
		while(this.product == -1) {
			wait();
		}
	}
}
