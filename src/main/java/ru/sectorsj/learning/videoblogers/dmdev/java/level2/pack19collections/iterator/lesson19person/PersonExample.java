package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack19collections.iterator.lesson19person;

public class PersonExample {
	
	public static void main(String[] args) {
		Person ivan = new Person(1, "Ivan", "Ivanov");
		Person petr = new Person(1, "Ivan", "Ivanov");
//		Person petr = new Person(2, "Petr", "Petrov");
		
		
		System.out.println(ivan.hashCode());
		System.out.println(petr.hashCode());
		System.out.println(ivan.equals(petr));
	}
}
