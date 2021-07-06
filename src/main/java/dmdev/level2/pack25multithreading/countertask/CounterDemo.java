package dmdev.level2.pack25multithreading.countertask;

/**
 * 3. В методе main создать 4 потока типа CounterThread,
 * передав один и тот же объект Counter и запустить их, дождаться выполнения
 * и вывести на консоль в текущее значение нашего счетчика:
 * counter.getCount()
 */

public class CounterDemo {
	public static void main(String[] args) {
		Counter counter = new Counter();
		CounterThread counterThread1 = new CounterThread(counter);
		CounterThread counterThread2 = new CounterThread(counter);
		CounterThread counterThread3 = new CounterThread(counter);
		CounterThread counterThread4 = new CounterThread(counter);
		
//		counterThread1.join();
	}
}
