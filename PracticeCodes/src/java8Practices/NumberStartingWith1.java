package java8Practices;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWith1 {

	public static void main(String[] args) {
		// convert to String and check the first character
		
		List<Integer> list = Arrays.asList(10,12,30,40,15);
		
		list.stream()
			.map(s->String.valueOf(s))
			.filter(s-> s.startsWith("1"))
			.forEach(System.out::println);
	}
}
