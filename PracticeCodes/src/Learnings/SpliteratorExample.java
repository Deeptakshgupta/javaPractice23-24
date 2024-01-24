package Learnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

	public class SpliteratorExample {

	    public static void main(String[] args) {
	        List<String> stringList = new ArrayList<>();
	        stringList.add("Java");
	        stringList.add("Python");
	        stringList.add("JavaScript");
	        stringList.add("C++");

	        // Creating a Spliterator from the ListS
	        Spliterator<String> spliterator = stringList.spliterator();

	        // Using forEachRemaining to iterate over the elements
	        spliterator.forEachRemaining(System.out::println);
	    
	        String[] languages = {"Java", "Python", "JavaScript", "C++"};

	        // Creating a parallel stream and obtaining a Spliterator
	        Arrays.stream(languages).parallel().spliterator()
	                .forEachRemaining(System.out::println);
	    
	    }

}
