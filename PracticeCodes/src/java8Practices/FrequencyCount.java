package java8Practices;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,12,10,10,40,15);
		 
		Map<Integer, Long> frequency = list.stream()
												.collect(
														Collectors.groupingBy(
																	Function.identity()
																	,Collectors.counting()));
			
	
	}
}
