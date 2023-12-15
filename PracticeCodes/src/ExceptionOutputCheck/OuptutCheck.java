package ExceptionOutputCheck;

import java.io.FileNotFoundException;

class Exception1 extends Exception{}

class Exception2 extends Exception{}

class Parent
{
	public void hello() throws Exception
	{
		System.out.println("Parent hello method");
	}
}

class Child extends Parent 
{
	public void hello() throws FileNotFoundException
	{
		System.out.println("Child hello method");
	}
}
public class OuptutCheck {

	public static void method1() throws Exception
	{
		try
		{
		System.out.println("5");
		throw new Exception1();
		}
		catch(Exception e)
		{
			System.out.println("6");
			throw new Exception2();
			
		}
		finally
		{
			System.out.println("7");
			throw new Exception();
		}
	}
	
	public static void main(String[] args) throws Exception{
		
		System.out.println("1");
		method1();
		System.out.println("2");
		
		
	}
}
