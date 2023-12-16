package java8Qustions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestUseSKIP {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,4,5,45,32,3,6);
		
		int max1 = list.stream().sorted().skip(1).findFirst().get();
		int max2 = list.stream().sorted().skip(1).findAny().get();
		
		System.out.println(max1);
		System.out.println(max2);
		
	} 

}
