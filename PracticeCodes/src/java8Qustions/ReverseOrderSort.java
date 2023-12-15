package java8Qustions;

// sorted(Comparator .reverseOrder())


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseOrderSort {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,2,1,5,9,8);
		
		 list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
	}
}
