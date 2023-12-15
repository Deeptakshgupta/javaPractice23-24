package java8Qustions;

import java.util.PrimitiveIterator.OfDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckAnagram {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "oelllh";
		
		// covert to char array -> change every char to upper Case-> sort -> store in a string
		String s1 = Stream.of(str1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		String s2 = Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		
		//char frequency 
//		var freq = Stream.of(str1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		if(s1.equals(s2))
			System.out.println("IsAnagram");
		else
			System.out.println("Not Anagram");
	}
	
}
