package ru.sectorsj.learning.books.java_beginers.using_constructor_demo_99;

public class UsingConstructorDemo {
	public static void main(String[] args) {
		MyClass objA = new MyClass();
		MyClass objB = new MyClass(200, 'B');
		System.out.println("Объект objA:");
		objA.show();
		System.out.println("Объект objB:");
		objB.show();
	}
}
