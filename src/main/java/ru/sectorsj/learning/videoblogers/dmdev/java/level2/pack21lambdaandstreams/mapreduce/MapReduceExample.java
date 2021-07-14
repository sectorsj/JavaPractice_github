package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack21lambdaandstreams.mapreduce;

import java.util.stream.Stream;

public class MapReduceExample {
	/**
	 * [1000_000] -> age -> max
	 *
	 * [1000_000] -> age -> max ->
	 *
	 * [1000_000] -> age -> max
	 *
	 */
	public static void main(String[] args) {
		Stream.of(
				new Student(18, "Ivan"),
				new Student(23, "Petr"),
				new Student(34, "Vasya"),
				new Student(45, "Sveta"),
				new Student(20, "Katya"),
				new Student(68, "Den"),
				new Student(101, "Kira")
		)
				.parallel()   // ---> распаралелить вычисления
//				.sequential()     ---> вычисления в одном потоке
				
//				.filter(student -> student.getAge() > 20)

//				.map(student -> student.getAge())  ---> *replace lambda with method reference
				.map(Student::getAge)
				
//				.reduce((age1, age2) -> Math.max(age1, age2))  ---> *replace lambda with method reference
				
//				.reduce(Math::min)
//				.reduce(Math::max)
//				.ifPresent(System.out::println);

//				.reduce(0, (age1, age2) -> Integer.sum(age1, age2))     ---> *replace lambda with method reference
//				.reduce(0, Integer::sum)
				/**
				 * 0 это начальная точка вычислений, если его оставить,
				 * то ifPresent выдаст ошибку.
				 */
				
				.reduce(Integer::sum)
				/**
				 * Так ifPresent ошибку не выдаст.
				 */
				.ifPresent(System.out::println);
	}
}
