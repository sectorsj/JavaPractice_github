package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack19collections.practice;

import java.util.HashSet;
import java.util.Map;

/**
 * 3.Написать метод isUnique, который принимает Map<String, String>
 * и возвращает true,
 * если каждому ключу соответствует уникальное значение.
 * Например, в данном случае вернется true:
 * {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp,
 * Hal=Perkins}
 * А в данном случае false:
 * {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges,
 *  * Hal=Perkins}
 */

public class Task3 {
	public static void main(String[] args) {
	
//		Map<String, String> map = new HashMap<>();
//		map.put("Marty", "Stepp");
//		map.put("Stuart", "Reges");
//		map.put("Jessica", "Miller");
//		map.put("Amanda", "Camp");
//		map.put("Hal", "Perkins");

//	можно использовать нововведения java 1.8 - Map.of()
		Map<String, String> map = Map.of(
				"Marty", "Stepp",
				"Stuart", "Reges",
				"Jessica", "Miller",
				"Amanda", "Camp",
				"Hal", "Perkins"
				
		);
		System.out.println(isUnique(map));
	}
	
	public static boolean isUnique(Map<String, String> map) {
		return map.size() == new HashSet<>(map.values()).size();
	}
}
