package StreamCodes;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.stream.Collector;
	import java.util.stream.Collectors;
	 
	

	
	public class TeeingUsingStreams { 
	 
	public static void main(String[] args) {
	 
	// Collector Teeing feature
	// merge two stream in single unit
	 
	Student student1= new Student("Nitesh", 24, 1);
	Student student2= new Student("Priya", 28, 2);
	Student student3= new Student("Vishal", 26, 3);
	 
	List<Student> listOfStudent= Arrays.asList(student1,student2,student3);
	 
	Map<String,Student> oldestAndyoungest= new HashMap<>();
	Student youngestStuden=listOfStudent.stream().min(Comparator.comparingInt(Student :: getAge)).get();
	Student oldestStudent=listOfStudent.stream().max(Comparator.comparingInt(Student :: getAge)).get();
	oldestAndyoungest.put("A", oldestStudent);
	oldestAndyoungest.put("B", youngestStuden);
	System.out.println(oldestAndyoungest);
	 
	Map<String,Student> teeingExample=listOfStudent.stream().collect(Collectors.teeing(Collectors.minBy(Comparator.comparingInt(Student::getAge)),
	Collectors.maxBy(Comparator.comparingInt(Student::getAge)), (young,old) -> {
	 
	Map<String,Student> map= new HashMap<>();
	map.put("young", young.get() );
	map.put("oldest", old.get());
	 
	return map;
	 
	}));
	 
	 
	System.out.println(teeingExample);
	 
	/*Take a look at the new method 'Teeing' introduced to the Collectors class with Java 12.
	Teeing allows us to duplicate a stream, to collect the streams separately, and to merge them anyway we choose to in a single function.
	We will walk through a demonstration where we use teeing to extract the maximum and minimum values of a collection and to merge them into a map.
	Teeing is a useful method for specific use cases where we find ourselves streaming a collection multiple times and combining the resultant collection with each other. */
	 
	 
	}

}

class Student 
{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Student(String name, int age, int rollNo) {
		super();
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}
	String name;
	int age; 
	int rollNo;
	
}