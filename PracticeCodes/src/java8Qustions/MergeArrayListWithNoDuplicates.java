package java8Qustions;

import java.util.*;
import java.util.stream.IntStream;

public class MergeArrayListWithNoDuplicates {

	public static void main(String[] args) {
		
		int b[]= {1,2,3,4,5};
		int a[]= {6,7,8,9,0};
		
		int c[]= IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
		
		Arrays.stream(c).forEach(System.out::println);
		
	}
}
