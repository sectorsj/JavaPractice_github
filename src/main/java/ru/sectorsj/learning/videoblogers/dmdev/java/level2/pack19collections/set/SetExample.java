package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack19collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		//не учитывается порядок добавления элементов
		System.out.println(set.add("aaa"));
		System.out.println(set.add("bbb"));
		System.out.println(set.add("ccc"));
		System.out.println(set.add("ddd"));
		System.out.println(set.add("bbb"));
		System.out.println(set);
		System.out.println("");
		
		//учитывается порядок добавления элементов
		Set<String> set1 = new LinkedHashSet<>();
		System.out.println(set1.add("ddd"));
		System.out.println(set1.add("aaa"));
		System.out.println(set1.add("bbb"));
		System.out.println(set1.add("ccc"));
		System.out.println(set1.add("bbb"));
		System.out.println(set1);
		
		//элементы упорядочиваются в алфавитном порядке
		Set<String> set2 = new TreeSet<>();
		System.out.println(set2.add("ddd"));
		System.out.println(set2.add("aaa"));
		System.out.println(set2.add("bbb"));
		System.out.println(set2.add("ccc"));
		System.out.println(set2.add("bbb"));
		System.out.println(set2);
	}
}
