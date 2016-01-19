package threadImpl;

public class ThreadJoinDemo {
	
	//¦w´¡°õ¦æºü
	public static void main(String[] args){
		System.out.println("main start");
		Thread t1 = new Mythread();
		try {
			t1.start();
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
		
	}
}
