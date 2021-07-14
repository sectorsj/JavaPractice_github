package ru.sectorsj.learning.books.java_beginers.using_static_members_demo_104;

public class UsingStaticMembersDemo {
	
	public static void main(String[] args) {
		MyClass.show();
		
		MyClass objA = new MyClass();
		MyClass objB = new MyClass();
		MyClass objC = new MyClass();
		
		MyClass.show();
		
		objC.show();
		objB.show();
	}
}
