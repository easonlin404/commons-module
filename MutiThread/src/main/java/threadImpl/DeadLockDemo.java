package threadImpl;

public class DeadLockDemo {
	public static void main(String[] args){
		Resource re1 = new Resource("re1", 10);
		Resource re2 = new Resource("re2", 20);
		
		Thread thrad1 = new Thread( () -> {
			for(int i =0; i<10; i++){
				re1.copperatere(re2);
			}
		});
		Thread thrad2 = new Thread( () -> {
			for(int i =0; i<10; i++){
				re2.copperatere(re1);
			}
		});
		thrad1.start();
		thrad2.start();
	}
}
