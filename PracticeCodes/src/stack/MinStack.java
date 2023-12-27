package stack;

import java.util.Stack;

// main logic is in pushing the elements
class MyStack{
	
	Stack<Integer> st;
	Integer minEle;
	
	MyStack()
	{
		st = new Stack<Integer>();
	}
	
	
	void push(int x)
	{
		if(st.isEmpty())
		{
			minEle = x;
			st.push(minEle);
			return;
		}
		// when new number is less than minEle
		if( minEle > x)
		{
			// updating the next smaller element to be retrieved,
			//after the smaller element has been poped out  
			st.push(2*x- minEle);
			minEle = x;
		}
		
		else
			st.push(x);
		System.out.println();
	}
	
	void pop()
	{
		if(st.isEmpty())
		{
			System.out.println("Stack is empty ");
		}
		 System.out.print("Top Most Element Removed: ");
	        Integer t = st.pop();
	 
	        // Minimum will change as the minimum element
	        // of the stack is being removed.
	        if (t < minEle) {
	            System.out.println(minEle);
	            minEle = 2 * minEle - t;
	        }
	 
	        else
	            System.out.println(t);
	}

    // Prints minimum element of MyStack
    void getMin()
    {
        // Get the minimum number in the entire stack
        if (st.isEmpty())
            System.out.println("Stack is empty");
 
        // variable minEle stores the minimum element
        // in the stack.
        else
            System.out.println("Minimum Element in the "
                               + " stack is: " + minEle);
    }
 
    // prints top element of MyStack
    void peek()
    {
        if (st.isEmpty()) {
            System.out.println("Stack is empty ");
            return;
        }
 
        Integer t = st.peek(); // Top element.
 
        System.out.print("Top Most Element is: ");
 
        // If t < minEle means minEle stores
        // value of t.
        if (t < minEle)
            System.out.println(minEle);
        else
            System.out.println(t);
    }
 
}

public class MinStack {

	
}
