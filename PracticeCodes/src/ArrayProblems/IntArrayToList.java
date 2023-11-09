package ArrayProblems;

import java.util.*;
/**Important things to be noted **/

public class IntArrayToList {

	/** Size restricted conversion **/
	// directly use Arrays.asList();
	List<String> convertSameSize(String arr[])
	{
		List<String> a = Arrays.asList(arr);
		
		/** creates an array with same size as sizeof the array passed in argument **/
		
		
//		ArrayList<String> a = Arrays.asList(arr); -> returns List
		// explicit type casting required as ArrayLsit was to be returned
		return a;
	}
	
	/** Dynamic array Conversion **/
//	new  ArrayList(Arrays.asList( arr) ;
	List<String> convertDynamicSize(String arr[])
	{
		List<String > a = new ArrayList<String>(Arrays.asList(arr));
		return a;
	}
	
	
	
//	int array conversion
}
