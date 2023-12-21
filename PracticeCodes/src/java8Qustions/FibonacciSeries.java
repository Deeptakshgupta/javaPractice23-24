package java8Qustions;

import java.util.stream.Stream;

public class FibonacciSeries {

	public static void main(String[] args) {
		Stream.iterate(new int[]  {0,1},		// is the initial seed to start the iteration
				f-> new int[] {f[1], f[0]+f[1]}) // f represents the function to generate the next element
		// this function works as the same logic for fibonacci -> a,b,c => a=b,b=c,c= a+b
		.limit(10)
		.map(f-> f[0])
		.forEach(i-> System.out.print(i+" "));
	}
}
