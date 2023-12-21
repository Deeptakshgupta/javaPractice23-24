package ArrayProblems;

class stack {

	int size =2;
	int arr[] = new int [size];
	int top=-1;
	
	 void push(int x) {
		top ++;
		if( top >= size)
		{
			System.out.println("Out of Memory, can't insert :"+ x);
			System.exit(1);
		}
		arr[top] =x;
	}
	int pop()
	{
		if(top ==0 )
		{
			System.out.println("No data present");
			System.exit(1);
		}
		int x = arr[top];
		top--;
		return x;
	}
	
	int top()
	{
		return arr[top];
	}
	
	int size()
	{
		return top+1;
	}
}

public class stackUsingArray {

	public static void main(String[] args) {
		stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());
   
	}
}
