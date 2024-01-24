package Learnings;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Printer{
	public Printer(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public static void print(String msg)
	{
		System.out.println(msg);
	}
	
	public void print1(String msg)
	{
		System.out.println(msg);
	}
}

public class FunctionalInterfaces {

	public static void main(String[] args) {
		
		Function<Integer, Double> half = (number)->number/2.0;
//		half.apply(10);
		
/**		Function<Integer,Printer> p = Printer::new;
//		The type Printer does not define Printer(Integer) that is applicable here
**/
		BiFunction<Integer,Integer,Printer> p = Printer::new;
		
		
		
		Predicate<Integer> check = c -> c > 10;
//		check.test(12);
		
		Predicate<Integer> pred = new Predicate<>(){
			@Override
				public boolean test(Integer i) {
					return i>10;
				}
		};
		
//		pred.test(12);
		
		Consumer<String> consume = s-> System.out.println(s);
		consume.accept("Only accepts");
		
		Consumer<String> printer = Printer::print;
		Consumer<String> printer2 = new Printer(1,2)::print1;
		
		printer.accept("msg to be written");
		printer2.accept("msg to be written");
		
		
		
		Supplier<String> supply = ()-> "supplies values only";
		
//		supply.get();
	}
}
