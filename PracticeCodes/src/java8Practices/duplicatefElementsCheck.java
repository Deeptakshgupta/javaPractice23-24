package java8Practices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class duplicatefElementsCheck {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,12,30,40,15);
		
		// need to use Hashset to use 
		HashSet<Integer> set = new HashSet<>();
		
		List<Integer> ans = list.stream()
			.filter(s -> !set.add(s))
			.collect(Collectors.toList());
	}
}
