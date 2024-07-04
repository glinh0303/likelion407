package ex407;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class bai3 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 7, 18, 25, 77, 300, 101);

		Function<List<Integer>, String> function = new Function<>() {

			@Override
			public String apply(List<Integer> t) {
				String result = "The second largest: " + secondLargest(list) + "\n";
				result += "The smallest " + smallest(list);
				return result;
			}
		};

		System.out.println(function.apply(list));
	}

	public static Integer secondLargest(List<Integer> list) {
		Stream<Integer> secondLargest = list.stream().distinct().sorted((a, b) -> b - a);
		return (secondLargest.skip(1).findFirst().orElse(null));
	}

	public static Integer smallest(List<Integer> list) {
		Stream<Integer> smallest = list.stream().distinct().sorted((a, b) -> a - b);
		return (smallest.findFirst().orElse(null));
	}
}
