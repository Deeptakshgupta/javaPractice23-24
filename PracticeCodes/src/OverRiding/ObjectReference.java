package OverRiding;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class Parent {
	String x = "Parent";
}

class Child extends Parent {
	String x = "Child";

	Comparator<Map.Entry<Character, Integer>> valueComparator = new Comparator<>(){
			(entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()});

}

public class ObjectReference {

	public static void main(String[] args) {

        // Populate the map with data

        // Define the valueComparator
        Comparator<Map.Entry<Character, Integer>> valueComparator =
            Comparator.comparing((Map.Entry<Character, Integer> entry) -> entry.getValue())
                .thenComparing(entry -> entry.getKey());

        // Create a new TreeMap using the valueComparator
        TreeMap<Character, Integer> sortedByValueMap = new TreeMap<>(valueComparator);

		TreeMap<Character, Integer> map = new TreeMap<>((o1,o2)-> o1.getValue().compareTo(o2.getValue()));
		String s = "paper";
		String t = "title";
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i), i) != t.indexOf(t.charAt(i), i))
				System.out.println("false");
		}
		System.out.println("true");
	}

}
