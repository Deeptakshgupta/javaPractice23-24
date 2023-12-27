package stack;

import java.util.Stack;

public class PrefixToInfix {

	 public static String prefixToInfixConversion(String exp) {
	        // Write your code here
	          Stack<String> st = new Stack<>();
	        for(int i =exp.length()-1 ; i >= 0 ; i--){
	            char ch = exp.charAt(i);
	            if(ch >= 'a' && ch <= 'z')st.push(ch+"");
	            else{
	                String v1 = st.pop();
	                String v2 = st.pop();
	                System.out.println(v1 +":"+ch+":"+v2);
	                st.push("("+v1+ch+v2+")");
	            }
	        }
	        return st.pop();
	    }
	 public static void main(String[] args) {
		
		 String str = "*-a/bc-/dkl";
		 System.out.println(prefixToInfixConversion(str));
	}
}
