package java8Qustions;

// chars() -> Returns a stream of int zero-extending the char values from this sequence.
// mapToObj()	->Returns an object-valued Stream consisting of the results ofapplying the given function to the elements of this stream. 
//Collectors.groupinBy()
// -> for counting the frequency , Function.identity(), Collectors.counting()



import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {

	public static void main(String[] args) {
		String str = "Hello how are you ";
		Map<Character, Long> ans = str.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		for(Map.Entry<Character, Long> e : ans.entrySet())
			System.out.println(e.getKey()+" :"+e.getValue());
	} 

}
