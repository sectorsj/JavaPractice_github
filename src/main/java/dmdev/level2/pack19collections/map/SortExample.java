package dmdev.level2.pack19collections.map;

import dmdev.level2.pack19collections.iterator.lesson19person.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {
		
//		List.of() - неизменяемая коллекция
//		List<String> strings = Arrays.asList("123", "345", "14", "678");
//
//		Collections.sort(strings);
//		System.out.println(strings);
		
		List<Person> personList = Arrays.asList(
				new Person(1, "Ivan", "Ivanov"),
				new Person(29, "Petr", "Petrov"),
				new Person(3, "Sveta", "Svetikova")
		);
		Collections.sort(personList);
		System.out.println(personList);
		
//		можно использовать более локаничную запись
//		personList.sort(new FirstNameComparator());
		
		personList.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
		
		
		System.out.println(personList);
	}
	
	public static class FirstNameComparator implements Comparator<Person> {
		
		@Override
		public int compare(Person o1, Person o2) {
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
	}
}
