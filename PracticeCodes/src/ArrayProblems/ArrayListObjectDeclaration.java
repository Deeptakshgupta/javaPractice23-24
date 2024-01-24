package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Difference between 
  .) ArrayList<> arr= new ArrayList<>();
  		AND
  .) List<> arr = new ArrayLsit<>();
  
  
  
  Creating a List instance (interface) instead of an ArrayList (or another specific implementation) object has advantages and disadvantages. The choice depends on your specific requirements and design considerations. Here are some advantages and disadvantages of using List as a reference type:

Advantages:

Flexibility: By using the List interface, you decouple your code from a specific implementation (like ArrayList). This provides flexibility to change the underlying implementation to a different list type (e.g., LinkedList) without affecting the rest of your code.

Polymorphism: You can easily switch between different list implementations (e.g., ArrayList, LinkedList, etc.) by changing the object instantiation, allowing you to choose the most appropriate implementation for your use case.

Interoperability: When working with libraries or code from different sources, using List provides a common interface that can be used for compatibility with various data structures.

Disadvantages:

Limited Access to Implementation-Specific Features: By using a List reference, you lose direct access to implementation-specific features and optimizations offered by a particular list implementation like ArrayList. For example, ArrayList is optimized for random access, whereas LinkedList is better for frequent insertions and removals.

Performance Considerations: Depending on your specific use case, the performance of a particular List implementation might be crucial. If you're working with a large dataset and need specific performance characteristics, using a reference to the List interface might not be the most efficient choice.

Verbose Casting: In situations where you need to access implementation-specific methods or properties, you'll need to cast the List reference back to the specific implementation type. This can lead to less elegant and more verbose code.

Potential for Incompatibility: If you need to interoperate with existing code or libraries that expect a particular list implementation (e.g., ArrayList), using a reference to the List interface may lead to compatibility issues.

Reduced Self-Documentation: Code that uses a reference to the List interface can be less self-explanatory, as it doesn't make the specific implementation clear at a glance. Developers reading your code may need to inspect the object instantiation to determine the concrete type.  
 *  **/


public class ArrayListObjectDeclaration {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		
		int g = list.indexOf(0);
		System.out.println(g);
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
	
		int a = array.indexOf(0);
		System.out.println(a);
	}
}
