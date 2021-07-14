package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack21lambdaandstreams.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample2 {
	public static void main(String[] args) {
		List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");
		IntSummaryStatistics intSummaryStatistics = strings.stream()
				.map(string -> string + string)
				.map(Integer::valueOf)
				.filter(value -> value % 2 == 0)
				.sorted()
//				.skip(1)
				.limit(2)

//				.mapToInt(value -> value.intValue())   ---> *replace lambda with method reference
				.mapToInt(Integer::intValue)
				
//				также есть возможность перевести данные в:
//				.mapToDouble(...)
//				.mapToLong(...)

//              появляются доп. методы для примитивных типов:
//				.max()/ .min()/.sum()/ .average()
				.summaryStatistics();
		
//		        Если переводить в объект то, методы:
//		        .max()
//		        .min()
//		        .sum()
//		        .average()
//		        и др.
//		        уже не доступны

//              .mapToObj(...) - пример перевода данных в объекты

//				.mapToObj(intValue -> Integer.valueOf(intValue))  ---> *replace lambda with method reference
//				.mapToObj(Integer::valueOf)
		
		System.out.println(intSummaryStatistics);
		
		
		List<String> collect = Stream.of("88", "11", "22", "33", "44", "55", "66")
//				.peek(value -> System.out.println(value)) ---> *replace lambda with method reference
				.peek(System.out::println)

				.collect(Collectors.toList());
		
		IntStream.range(0, 10)
//				.forEach(intValue -> System.out.println(intValue)); ---> *replace lambda with method reference
				.forEach(System.out::println);
		
		
		
		IntStream.iterate(0, operand -> operand + 3)
				.skip(10)
				.limit(20)
				.forEach(System.out::println);
	}
	
//	    Аналог кода строк 57-61
//	    IntStream.iterate(0, new IntUnaryOperator() {
//	    		@Override
//	    		public int applyAsInt(int operand) {
//	    			return operand + 3;
//	    		}
//	    	})
//	    			.skip(10)
//	    			.limit(20)
//	    			.forEach(System.out::println);
//	    }
}
