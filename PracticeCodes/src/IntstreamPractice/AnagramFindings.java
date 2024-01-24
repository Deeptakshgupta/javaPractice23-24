package IntstreamPractice;

import java.util.stream.IntStream;

public class AnagramFindings {

	public static void main(String[] args) {
	
		String str1 = "str";
		String str2 = "str";
		
		var c = str1.chars();
		c.forEach(System.out::println);
		
		// .chars() returns an IntStream object
		IntStream c2 = str1.chars();
		
	}
}
