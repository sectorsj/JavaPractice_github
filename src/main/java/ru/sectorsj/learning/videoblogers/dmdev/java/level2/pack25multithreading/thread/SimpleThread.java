package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack25multithreading.thread;

public class SimpleThread extends Thread{
	
	@Override
	public void run() {
//		System.out.println("Hello " + Thread.currentThread().getName());

//		так мы унаследовались от (extends от Thread) то запись - "Thread.currentThread().getName()"
//		можно сократить до такой --->
		System.out.println("Hello from SimpleThread: " + getName());
	}
}
