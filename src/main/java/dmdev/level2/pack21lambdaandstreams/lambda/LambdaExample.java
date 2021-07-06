package dmdev.level2.pack21lambdaandstreams.lambda;

import java.util.Comparator;

/**
 * Часто используемые функциональные интерфейсы:
 * 1. Function
 * 2. Predicate
 * 3. Supplier
 * 4. Consumer
 * 5. Comparator
 */

public class LambdaExample {
	
	public static void main(String[] args) {
	
//		Comparator<Integer> comparator = new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return 0;
//			}
//		};
		Comparator<Integer> comparator = Integer::compare;
		System.out.println(comparator.compare(25, 100));
	}
	
//	private static class IntegerComparator implements Comparator<Integer> {

//		@Override
//		[модиф.] возвр название([параметры])

//		(Integer o1, Integer o2) -> {
//			return Integer.compare(o1, o2);
//		}
//	}
}
