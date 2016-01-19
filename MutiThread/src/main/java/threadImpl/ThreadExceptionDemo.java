package threadImpl;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadExceptionDemo {
	public static void main(String[] args){
		Thread t1  = new Thread(new Runnable() {
			@Override
			public void run() {
				throw new IllegalArgumentException("qq");
				
			}
		});
		
		t1.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				e.printStackTrace();
			}
		});
		t1.start();
		
	}
}
