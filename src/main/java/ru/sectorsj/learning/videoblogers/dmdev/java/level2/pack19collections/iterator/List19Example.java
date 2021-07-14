package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack19collections.iterator;

import ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack19collections.List.List19;

public class List19Example {
	
	public static void main(String[] args) {
		List19<String> list19 = new List19<>(10);
		list19.add("String1");
		list19.add("String2");
		list19.add("String3");
		list19.add("String4");
		
		System.out.println('\n' + "1 вариант вывода");
		for (String value : list19) {
			System.out.println(value);
		}
		
		System.out.println('\n' + "2 вариант вывода");
		list19.iterator().forEachRemaining(System.out::println);
		
		System.out.println('\n' + "3 вариант вывода");
		list19.forEach(System.out::println);
	}
}
