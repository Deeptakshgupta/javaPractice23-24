package java8Qustions;

import java.util.stream.IntStream;

// palindrome check for the  
public class PalindromePgm {

	public static void main(String[] args) {
		
		String str = "abababa";
		boolean ans = IntStream.range(0,str.length()/2).noneMatch(i-> str.charAt(i)!=str.charAt(str.length()-i-1));
		
		System.out.println(ans);
	}
}
 