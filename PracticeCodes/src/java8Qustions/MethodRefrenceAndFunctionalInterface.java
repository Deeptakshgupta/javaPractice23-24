package java8Qustions;

import java.util.function.Consumer;

class Person
{
	public void sayHello(String name)
	{
		System.out.println("Hello "+ name);
	}
}
public class MethodRefrenceAndFunctionalInterface {


	public static void main(String[] args) {
		
		// non-static method -> have to create object to use the method.
		Person person = new Person();
		
		Consumer<String> say = person ::sayHello;
		 say.accept("Abhi");
	}
}
