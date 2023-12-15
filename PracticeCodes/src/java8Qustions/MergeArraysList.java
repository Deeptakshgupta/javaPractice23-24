package java8Qustions;

// IntStream 
// concat
//sorting using IntStream
// converting back to array using toArray();


import java.util.Arrays;
import java.util.stream.IntStream;

//  IntStream works only with int[] not with list

// merge the two unsorted array List into a single sorted list using streams 

public class MergeArraysList {

	public static void main(String[] args) {
		
		int a[] = {2,4,5,67,3,1};
		int b[] = {2,4,5,67,3,1};
		
//		List<Integer> a= Arrays.asList(
//				2,4,5,67,3,1);
//		List<Integer> b= Arrays.asList(2,4,5,67,3,1);
		
		int c[]= IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		
		Arrays.stream(c).forEach(System.out::println);
		
	}
}
