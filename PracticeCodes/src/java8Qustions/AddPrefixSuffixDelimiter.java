package java8Qustions;

//Collectors.joining("delimiter", "Prefix", "suffix")
// works on the whole array and returns a Single String. 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddPrefixSuffixDelimiter {

	// join list of Strings with  prefix, suffix,delimiter
	
	public static void main(String[] args) {
		
		List<String > strList = Arrays.asList("_Hi_","_Hello_","_Hi_","_Hello_","_HI_","_HELLO_","_hi_","_HELLO_");
		

		String str = strList.stream().collect(Collectors.joining("Delimiter","Prefix","Suffix"));
		
		System.out.println(str);
	}
}
