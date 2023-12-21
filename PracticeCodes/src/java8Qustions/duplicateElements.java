package java8Qustions;

import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class duplicateElements {

	public static void main(String[] args) {
		
		int arr[] = {1,2,2,4,5,3,56,6};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		int ans[] = IntStream.of(arr).filter(i -> !set.add(i)).toArray();
		Stream.of(ans).forEach(System.out::println);
	}
}
	