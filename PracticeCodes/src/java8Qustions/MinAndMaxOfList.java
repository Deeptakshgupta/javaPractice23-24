package java8Qustions;

//Comparator Requirement for max or min to work 
// this will not function until we specify them with the required comparison way we want

import java.util.*;

public class MinAndMaxOfList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,4,5,45,32,3,6);
		
		int max1 = list.stream().max(Comparator.naturalOrder()).get();
		int min2 = list.stream().max(Comparator.reverseOrder()).get();
		
		int min1 = list.stream().min(Comparator.naturalOrder()).get();
		int max2 = list.stream().min(Comparator.reverseOrder()).get();
		
		System.out.println(max1);
		System.out.println(min1);
		System.out.println();
		System.out.println(max2);
		System.out.println(min2);
		
		
				
	}
}
