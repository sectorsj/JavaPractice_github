package dmdev.level2.pack19collections.map;

import dmdev.level2.pack19collections.iterator.lesson19person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Person ivan = new Person(1, "Ivan", "Ivanov");
		Person petr = new Person(2, "Petr", "Petrov");
		Person sveta = new Person(1, "Sveta", "Svetikova");
		
		Map<Integer, Person> map = new HashMap<>();
		map.put(ivan.getId(), ivan);
		map.put(petr.getId(), petr);
		map.putIfAbsent(sveta.getId(), sveta);
		
//		System.out.println(map.get(2));
		
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		System.out.println(map.entrySet());
		
		
//		for (Person person : map.values()) {
//			System.out.println(person.getFirstName());
//		}
		
		for (Map.Entry<Integer, Person> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}
		System.out.println(map.containsKey(4)); // нет такого индекса
		System.out.println(map.containsKey(2)); // есть индек там иван, вернет тру
		System.out.println(map.size()); // вернет размер коллекции
		System.out.println(map.isEmpty()); // вернет тру если коллекция пустая
		System.out.println(map.get(4)); // вернет значение ячейки коллекции по индексу
		System.out.println(map.getOrDefault(3, sveta)); // если не найдет нужный значение по индексу, то вернет указанное значение
		
	}
}
