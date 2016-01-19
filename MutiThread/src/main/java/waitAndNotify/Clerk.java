package waitAndNotify;

public class Clerk {
	private int product = -1; //�u�����@�Ӳ��~�A-1 ��ܨS�����~
	
	public synchronized void setProduct(int product) throws InterruptedException {
		waitIfFull(); //�ݬݩ������S���Ŷ������~�A�S���N�y��
		this.product = product;
		System.out.printf("�Ͳ��̳]�w(%d)%n", this.product);
		notify();//�q�����ݶ��X���������(�Ҧp���O��)
		
	}
	
	private synchronized void waitIfFull() throws InterruptedException{
		while( this.product != -1) { 
			wait();
		}
	}
	
	public synchronized int getProduct() throws InterruptedException{
		waitIfEmpty(); //�ݬݥثe�������S���f�A�S�����ܴN�y��
		int p = this.product; //�ǳƥ�f
		this.product = -1;  //��O�f�~�Q����
		System.out.printf("���O�̨��� (%d)%n",p);
		notify(); //�q�����ݶ��X���������(�Ҧp�Ͳ���)
		return p;
		
	}
	
	private synchronized void waitIfEmpty() throws InterruptedException{
		while(this.product == -1) {
			wait();
		}
	}
}
