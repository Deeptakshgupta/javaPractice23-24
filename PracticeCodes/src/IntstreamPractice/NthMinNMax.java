package IntstreamPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NthMinNMax {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,12,30,40,15);
		
		int thirdMax = list.stream()
						.max(Comparator.naturalOrder())
						.get();
			
		// 3  max's=>  use limit
		var ans = list.stream()
				.sorted(Comparator.reverseOrder())
				.limit(3)
				.collect(Collectors.toList());
//		var ans2 = list.stream()
//				.max(Comparator.naturalOrder())
//				.limit(3)
//				.collect(Collectors.toList());
		
		
	}
}
