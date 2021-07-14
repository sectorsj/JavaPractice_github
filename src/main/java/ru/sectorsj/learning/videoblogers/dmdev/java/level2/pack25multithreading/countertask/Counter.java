package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack25multithreading.countertask;
/**
 * 1. Создать класс Counter с одним полем:
 * private int count;
 *
 * Добавить методы:
 * - getCount() - для получения поля count
 * - increment() - для увеличения значения поля на единицу
 * - decrement() - для уменьшения значения поля на единицу
 */
public class Counter {
	private int count;
	
	public void increment(){
		count++;
	}
	
	public void decrement(){
		count--;
	}
	
	public int getCount() {
		return count;
	}
}
