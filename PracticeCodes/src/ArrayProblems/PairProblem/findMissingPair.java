package ArrayProblems.PairProblem;

import java.util.HashSet;

public class findMissingPair {

	/** using XOR**/
	  public int singleNumber(int[] nums) {
	        int ans = nums[0];
	        for(int i=1;i<nums.length;i++){
	            ans = ans^nums[i];
	        }
	        return ans;
	    }
	  
	  /**  Using HashSet**/
	  public int singleNumberHash(int[] nums) {
	        // every element appears twice 
	        HashSet<Integer> set = new HashSet<>();

	        for( int i : nums)
	        {
	            if(!set.contains(i))
	                set.add(i);
	            else
	                set.remove(i);
	        }
	        int ans = -1;
	        for( int a : set)
	            {
	                ans = a;
	                break;
	            }
	        return ans;
	    }
	public static void main(String[] args) {
		
	}
}
