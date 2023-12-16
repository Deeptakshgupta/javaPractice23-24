package java8Qustions;

import java.util.stream.IntStream;

public class SumOfGivenRange {

	public static void main(String[] args) {
		
		int sum = IntStream.range(1,10).sum();
		
		double avg = IntStream.range(1,11).average().getAsDouble();
		
		System.out.println(sum);
	}
}
