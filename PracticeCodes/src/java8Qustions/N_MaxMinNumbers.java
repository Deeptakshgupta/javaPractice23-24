package java8Qustions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class N_MaxMinNumbers {

	// n max and min numbers from the list
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,4,4,6,78,3,9);
		
		//using the limit() we can get the required number of the elements
		List<Integer> min3 = list.stream().sorted().limit(3).collect(Collectors.toList());
		
		List<Integer> max4 = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		
		System.out.println(min3);
		System.out.println(max4);
	}
}
