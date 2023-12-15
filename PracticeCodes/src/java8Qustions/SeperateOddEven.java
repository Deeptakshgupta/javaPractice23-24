package java8Qustions;

import java.util.*;
import java.util.stream.Collectors;

public class SeperateOddEven {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		List<Integer> evenList = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		List<Integer> oddList = list.stream().filter(i -> i%2!=0).collect(Collectors.toList());
				
				
		System.out.println(oddList);
		
	}
	
}
