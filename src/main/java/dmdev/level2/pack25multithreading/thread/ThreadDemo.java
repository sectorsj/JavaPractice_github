package dmdev.level2.pack25multithreading.thread;

public class ThreadDemo {
	
	public static void main(String[] args) {
//		SimpleThread simpleThread = new SimpleThread();
//		SimpleRunnable simpleRunnable = new SimpleRunnable();
//		Thread runnableThread = new Thread(new SimpleRunnable());
//		Thread lambdaThread = new Thread(() -> System.out.println(" Hello from lambda: " + Thread.currentThread().getName()));

//		--->
		
		var simpleThread = new SimpleThread();
		System.out.println(simpleThread.getName() + ": " +simpleThread.getState());
		var runnableThread = new Thread(new SimpleRunnable(), "My Name");
		var lambdaThread = new Thread(() -> System.out.println("Hello from lambda: " + Thread.currentThread().getName()));
//04:13

//		чтобы запустить поток нужно использовать функцию - start(), а не run()
		simpleThread.start();
		System.out.println(simpleThread.getName() + ": " +simpleThread.getState());
		runnableThread.start();
		lambdaThread.start();
		try {
			simpleThread.join(100L);
			System.out.println(simpleThread.getName() + ": " +simpleThread.getState());
			runnableThread.join();
			lambdaThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		simpleThread.interrupt();
		
		System.out.println(Thread.currentThread().getName());
	}
}
