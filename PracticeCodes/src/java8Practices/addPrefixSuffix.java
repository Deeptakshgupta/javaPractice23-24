package java8Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class addPrefixSuffix {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		String changedStr = str.chars()
							.mapToObj(s-> (char)s)
							.map(s-> Character.toUpperCase(s))
							.map(Object::toString)
							.collect(Collectors.joining(",","Prefix","Suffix"));
		
		System.out.println(changedStr);
	}
}
