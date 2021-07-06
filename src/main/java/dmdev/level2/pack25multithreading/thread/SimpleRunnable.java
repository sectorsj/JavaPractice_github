package dmdev.level2.pack25multithreading.thread;

public class SimpleRunnable implements Runnable {
	
	@Override
	public void run() {
//		System.out.println("Hello from Runnable" + getName());  - здесь нельзя обратиться к геттеру getName()!!!
		System.out.println("Hello from Runnable: " + Thread.currentThread().getName());
	}
}
