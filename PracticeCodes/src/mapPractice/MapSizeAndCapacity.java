package mapPractice;


import java.lang.reflect.Field;
import java.util.*;

public class MapSizeAndCapacity {
	
	private static int getHashMapCapacity(Map<?, ?> map) throws NoSuchFieldException, IllegalAccessException {
	        Field tableField = HashMap.class.getDeclaredField("table");
	        tableField.setAccessible(true);
	        Object[] table = (Object[]) tableField.get(map);
	        return table == null ? 0 : table.length;
	    }
	
	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Hello", "1");
		
		  int capacity = getHashMapCapacity(map);
		
		System.out.println("Map Size : "+ map.size());
		
		System.out.println("map capacity :  "+capacity); 
				
	}
}
