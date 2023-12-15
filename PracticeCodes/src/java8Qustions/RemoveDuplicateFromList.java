package java8Qustions;

//distinct()

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,72,4,5,2,4);
		
		List<Integer> l1 = list.stream().distinct().collect(Collectors.toList());
		
		List<String > strList = Arrays.asList("Hi","Hello","Hi","Hello","HI","HELLO","hi","HELLO");
		
		List<String> l2= strList.stream().distinct().collect(Collectors.toList());
		
		l2.stream().forEach(System.out::println);
	}
}
