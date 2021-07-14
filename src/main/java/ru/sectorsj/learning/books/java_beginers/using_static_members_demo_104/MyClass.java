package ru.sectorsj.learning.books.java_beginers.using_static_members_demo_104;

public class MyClass {
	static int count = 0;
	
	MyClass() {
		count++;
		System.out.println("Создан объект номер " + count);
	}
	
	static void show() {
		System.out.println("Количество объектов: " + count);
	}
}
