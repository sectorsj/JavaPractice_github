package dmdev.level2.pack25multithreading.countertask;

/**
 * 2. Создать класс CounterThread с одним полем и конструктором для инициализации:
 * private Counter counter
 *
 * В методе run этого класса в цикле 100 раз вызвать counter.increment()
 */

public class CounterThread extends Thread {
	private final Counter counter;
	
	public CounterThread(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			counter.increment();
		}
	}
}
