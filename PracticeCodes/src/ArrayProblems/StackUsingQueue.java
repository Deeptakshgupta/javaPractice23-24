package ArrayProblems;

import java.util.Deque;
import java.util.LinkedList;

class stackUsingQueue

{
   Deque<Integer> q = new LinkedList<Integer>();
	
	void push(int x)
	{
		q.add(x); // add element to the last 
		for( int i=0; i<q.size() ; i++)
			q.add(q.remove()); // remove and set the elements to get the LIFO 
	}
	
	int pop()
	{
		return q.remove();
	}
	
	int top() {
		return q.peek();
	}
	
	int size()
	{
		return q.size();
	}
}

public class StackUsingQueue {

	public static void main(String[] args) {
		
	}
}
