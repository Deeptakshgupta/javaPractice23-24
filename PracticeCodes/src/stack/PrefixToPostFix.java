package stack;

import java.util.Stack;

public class PrefixToPostFix {

	public static String prefixToPostfix(String str)
	{
		Stack<String> st = new Stack<String>();
		// traversing from right to left
		for( int i = str.length()-1 ; i>=0 ; i--)
		{
		char ch = str.charAt(i);
		if(ch >= 'A' && ch <= 'Z')
			st.push(ch+"");//String conversion
		else
		{
			String v1 = st.pop();
			String v2 = st.pop();
			System.out.println("("+ v1+":"+ v2 +":"+ch+")");
			st.push(v1+ v2 +ch);
			
		}
	}
		return st.pop();
		
	}
	public static void main(String[] args) {
		String str = "/A+BC";
		System.out.println(prefixToPostfix(str));
	}
}
