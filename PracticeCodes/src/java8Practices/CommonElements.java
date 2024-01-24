package java8Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,12,30,40,15);
		
		List<Integer> list2 = Arrays.asList(1000,12,10,40,15);
		
		var common = list.stream()
						 .filter(list2::contains)
						 .collect(Collectors.toList());		
	}
}
