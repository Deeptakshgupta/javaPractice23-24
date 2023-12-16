package java8Qustions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsinArrayLists {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(23,4,56,3,4);
		
		var ans = list1.stream().filter(e-> list2.contains(e)).collect(Collectors.toList());
		var ans2 = list1.stream().filter(list2::contains).collect(Collectors.toList());
		
		ans.stream().forEach(System.out::println);
		System.out.println("------------------------------------------------------------");
		ans2.stream().forEach(System.out::println);
		
	}
}
