package ArrayProblems;

import java.util.Stack;

// using 2 stacks

 class MyQueue
{
	Stack<Integer> input =  new Stack<>();
	Stack<Integer> output =  new Stack<>();
	

	
	// push elements to the back of the queue
	void push(int x)
	{
		while(!input.empty())
			output.push(input.pop());
		System.out.println("Inserting element:"+ x);
		
		input.push(x);
		
		// Pop out elements from the stack output and push them into the stack input
        while (output.empty() == false) {
            input.push(output.peek());
            output.pop();
        }
		
	}
        int pop()
        {
        	return input.pop();
        }
        /** Get the front element. */
        public int peek() {
            // shift input to output 
            if (input.empty()) {
                System.out.println("Stack is empty");

            }
            return input.peek();
        }


        int size() {
            return input.size();
        }
       
}
public class QueueUsingStack {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
	        q.push(3);
	        q.push(4);
	        System.out.println("The element poped is " + q.pop());
	        q.push(5);
	        System.out.println("The top element is " + q.peek());
	        System.out.println("The size of the queue is " + q.size());
	}
}
