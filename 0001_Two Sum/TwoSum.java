// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]






import java.util.*;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] ret = new int[2];
		ret[0] = -1;
		ret[1] = -1;
		if(nums == null || nums.length <= 1) return ret;
		
        Map<Integer,Integer> cache = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	if(cache.containsKey(target - nums[i])){
        		ret[0] = cache.get(target - nums[i]);
        		ret[1] = i;
        		break;
        	}else{
        		if(!cache.containsKey(nums[i]))
        			cache.put(nums[i], i);
        	}
        }
        
        return ret;
    }
}
