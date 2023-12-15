package java8Qustions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArayElementFrequency {

	public static void main(String[] args) {
		List<Integer> list  = Arrays.asList(1,2,2,3,4,54,6,6,7,8);
		
		Map<Integer,Long> map = list.stream()
								.collect(
										Collectors.groupingBy(
												Function.identity(),
												Collectors.counting()));
		for(Map.Entry<Integer, Long> entry: map.entrySet())
			System.out.println(entry.getKey()+":"+ entry.getValue());
	}
}
