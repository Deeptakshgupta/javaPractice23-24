package IntstreamPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayMergeWithNoDuplicates {

	public static void main(String[] args) {
	
		int a[] = {12,3,4,5,6};
		int b []= {2,3,7,8,9,1,12};
		
		int c[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
				            .sorted()
				            .distinct().toArray();
		System.out.println(c);
		
	}
}
