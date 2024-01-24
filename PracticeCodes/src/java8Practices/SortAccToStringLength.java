package java8Practices;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortAccToStringLength {

	public static void main(String[] args) {
		
		String str[] = {"Hello", "World21"};
		
//		str.stream() => need to convert str[] to list / stream some how first
//		.sorted(Comparator.comparing(String::length))
//		.collect(Collectors.toList())
		
		var ans = Stream.of(str) 
				.sorted(Comparator.comparing(String::length).reversed())
				.collect(Collectors.toList());
		System.out.println(ans);
	}
}
