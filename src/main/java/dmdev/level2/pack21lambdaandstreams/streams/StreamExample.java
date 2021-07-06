package dmdev.level2.pack21lambdaandstreams.streams;

import java.util.List;

public class StreamExample {
	
	public static void main(String[] args) {
		List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");
		strings.stream()
		
//				     ((возвр  знач) ->  знач   знач)
//				.map((String value) -> value + value)
				.map(string -> string + string)
				
//              .map(value -> Integer.valueOf())
				.map(Integer::valueOf)
				
//              .filter((Integer value) -> value % 2 == 0)
				.filter(value -> value % 2 == 0)
				
//				сортировка
				.sorted()
				
//				пропустить элемент
				.skip(1)
				
//				ограничение выходного количества
				.limit(2)
				
//              терминальная операция
//				.forEach(value -> System.out.println(value))
				.forEach(System.out::println);
		
		
//		выше приведен аналог этого кода:
//		for (String string : strings) {
//			String value = string + string;
//			Integer intValue = Integer.valueOf(value);
//			if (intValue % 2 == 0) {
//				System.out.println(intValue);
//			}
//		}
	}
}
