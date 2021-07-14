package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack21lambdaandstreams.mapreduce;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample {
	/**
	 * [1000_000] -> age -> max
	 *
	 * [1000_000] -> age -> max ->
	 *
	 * [1000_000] -> age -> max
	 *
	 */
	public static void main(String[] args) {
		Optional<Student> maybeStudent = Stream.of(
				new Student(18, "Ivan"),
				new Student(23, "Petr"),
				new Student(34, "Vasya"),
				new Student(45, "Sveta"),
				new Student(20, "Katya"),
				new Student(68, "Den"),
				new Student(101, "Kira")
		)
				.sequential()
//				.filter(student -> student.getAge() < 18)
//				.flatMap(student -> student.getMarks().stream())
//				.map(mark -> )
				.reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);
		
//		maybeStudent.ifPresent(System.out::println);
		
//		maybeStudent.map(student -> student.getAge()) --->
		maybeStudent.map(Student::getAge)
//				.filter(age -> age > 25)
//				.get()
//				.isEmpty()
//				.isPresent()
//				.or()
//				.orElseThrow()
//				.orElseGet()
//				.ifPresentOrElse()
//				.stream()
//				.flatMap(age -> Optional.of(age * 2))
				
				//
//				.flatMap(age -> Optional.ofNullable(null))
				
				//или так
				.map(age -> null)
				
				//нельзя использовать методы типа ".get()" будет исключение
				.ifPresent(System.out::println);
	}
}
