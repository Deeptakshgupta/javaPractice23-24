package java8Qustions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// checking for digits using character class
// character.isDigit()
public class StringsThatStartsWithNumber {

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("1Hi","2how","are","u");
		
		List<String> ans = list.stream().filter(str-> Character.isDigit(str.charAt(0))).collect(Collectors.toList());
		
		System.out.println(ans);
		
	}
}
