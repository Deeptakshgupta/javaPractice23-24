package java8Qustions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		
		String str = "Hello how are u ";
		String reverseStr = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		
		System.out.println(reverseStr);
	}
}
	