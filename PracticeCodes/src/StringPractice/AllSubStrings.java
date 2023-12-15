package StringPractice;

public class AllSubStrings {
	
	    public static void main(String[] args) {
	        String input = "abc";
//	        generateSubstrings(input);
	        iterativeApproach(input, input.length());
	    }

	    private static void generateSubstrings(String str) {
	        generateSubstringsHelper(str, 0, "");
	    }

	    private static void generateSubstringsHelper(String str, int index, String currentSubstring) {
	        int length = str.length();

	        // Base case: If we have reached the end of the string
	        if (index == length) {
	            return;
	        }

	        // Print the current substring
	        
	        System.out.println(currentSubstring+str.charAt(index));

	        // Recur for the next character and include it in the current substring
	        generateSubstringsHelper(str, index + 1, currentSubstring + str.charAt(index));

	        // Recur without including the current character in the substring
	        generateSubstringsHelper(str, index + 1, currentSubstring);
	    };
	
	    public static void iterativeApproach(String str, int n)
	    {
	    	for( int i=0; i<n; i ++)
	    	{
	    		 String subStr="";
	    	       
	    	        // Second loop is generating sub-String
	    	        for (int j = i; j < str.length(); j++) {
	    	            subStr += str.charAt(j);
	    	            System.out.print(subStr +"\n");
	    	        }
	    	}
	    }
}
