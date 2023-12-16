package java8Qustions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortWithLength {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("hello","hi");
		
		List<String> ans = str.stream().sorted(Comparator.comparing(String :: length)).collect(Collectors.toList());
		
	}
}
