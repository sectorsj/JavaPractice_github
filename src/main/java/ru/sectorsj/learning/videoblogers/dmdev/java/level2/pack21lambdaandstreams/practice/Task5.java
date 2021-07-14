package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack21lambdaandstreams.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

/**
 * 5. Дан класс Person с полями firstName, lastName, age.
 * Вывести полное имя самого старшего человека, у
 * которого длинна этого имени не превышает 15 символов.
 *
 * План:
 * 1. найти самого старшего человека - это значит
 * создать фильтр для getFullName(), что бы оно не было не больше 15
 *
 * 2. Далее, найти самого старшего человека из оставшихся и вывести его
 * в консоль.
 */

public class Task5 {
	
	public static void main(String[] args) {
		List<PersonForTask5> persons = List.of(
				new PersonForTask5("Ivan", "Ivanov", 20),
				new PersonForTask5("Petr", "Petrov", 25),
				new PersonForTask5("Sveta", "Svetikova", 33),
				new PersonForTask5("Kate", "Ivanova", 25),
				new PersonForTask5("Slava", "Slavikov", 18),
				new PersonForTask5("Arny", "Kutuzov", 56)
		);
		persons.stream()
				.filter(person -> person.getFullName().length() < 15)
				.max(Comparator.comparing(PersonForTask5::getAge))
				.map(PersonForTask5::getFullName)
				.ifPresent(System.out::println);
		
		Map<Integer, List<PersonForTask5>> map = persons.stream()
				.collect(groupingBy(PersonForTask5::getAge));
//		System.out.println(map);


//	оптимизируем код: Collectors - "add static import for java.util.stream" --->
//		Map<Integer, List<String>> map2 = persons.stream()
//				.collect(Collectors.groupingBy(PersonForTask5::getAge,
//						Collectors.mapping(PersonForTask5::getFullName, Collectors.toList())));
//		System.out.println(map2);


//	получаем это:
		Map<Integer, List<String>> map2 = persons.stream()
				.collect(groupingBy(PersonForTask5::getAge,
						mapping(PersonForTask5::getFullName, toList())));
		System.out.println(map2);
		
		
//  будет равботать если ключи уникальные
//		Map<Integer, PersonForTask5> personMap = persons.stream()
//				.collect(toMap(PersonForTask5::getAge, Function.identity()));
//
//		System.out.println(personMap);
	}
}
