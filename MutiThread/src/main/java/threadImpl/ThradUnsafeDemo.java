package threadImpl;

import java.util.ArrayList;

public class ThradUnsafeDemo {
	
	public static void main(String[] args){
		String s ="qq";
		ArrayList<Object> list = new ArrayList<>();
		
		Thread thrad1 = new Thread( () -> {
			while(true) {
				synchronized (list) {
					System.out.println(1);
					list.add(1);
				}
				
			}
		});
		Thread thrad2 = new Thread( () -> {
			while(true) {
				synchronized (list) {
					System.out.println(2);
					list.add(2);
				}
			
			}
		});
		
		thrad1.start();
		thrad2.start();
	}
}
