package java8Qustions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int reverse[]= IntStream.rangeClosed(1,arr.length).map(i -> arr[arr.length - i ]).toArray();
		
		Arrays.stream(reverse).forEach(System.out::println);
	}
	
}
