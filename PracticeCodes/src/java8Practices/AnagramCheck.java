package java8Practices;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AnagramCheck {

	public static void main(String[] args) {
		// convert the String into upper case
		// string sorted in lexographic order
		
		String str1 = "str";
		String str2 = "str";
		
		var c = str1.chars();
		c.forEach(System.out::println);
		
		str1 = str1.chars()
				.mapToObj(s->(char)s)
				.map(Character::toUpperCase)
				.map(Object::toString)
				.sorted(Comparator.naturalOrder())
				.collect(Collectors.joining());
//		System.out.println(str1);
		
		str2 = str2.chars()
				.mapToObj(s->(char)s)
				.map(Character::toUpperCase)
				.map(Object::toString)
				.sorted(Comparator.naturalOrder())
				.collect(Collectors.joining());
//		System.out.println(str2);
		
		System.out.println(str1.equals(str2));
				
	}
}
