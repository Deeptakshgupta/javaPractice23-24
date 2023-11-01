package StreamCodes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapPrint {
	  public static void main(String[] args) {
	     Map<String,Integer> map= new HashMap<>();

	     map.put("A", 1);

	     map.put("B", 2);

	     map.put("C", 3);

	     map.put("D",4);

	     map.put("D", 5);

	 
	     Set<Integer> set= new HashSet<>();

     map.entrySet().stream().filter(e -> set.add(e.getValue())).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue));

     System.out.println(map +"Avoid duplicate keys");
	    
	 map.entrySet().forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));

	   

	    }
}
