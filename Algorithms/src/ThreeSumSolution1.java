/*
 * Given an array nums of n integers, are there elements a, b, c in 
 * nums such that a + b + c = 0? Find all unique triplets in the array 
 * which gives the sum of zero.
 * Note:The solution set must not contain duplicate triplets.
 * 
 * Example:Given array nums = [-1, 0, 1, 2, -1, -4],
 * A solution set is:
 *  [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 *  ]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSumSolution1 {
	
	public List<List<Integer>> threeSum(int[] nums) {
		
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashSet<String> set= new HashSet<String>();
        
        for(int i = 0; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                for(int k = j+1; k < nums.length; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                       if(!set.contains(nums[i]+""+nums[j]+""+nums[k])) {
                            result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                            set.add(nums[i]+""+nums[j]+""+nums[k]);
                       }
                    }
                }
            }
        }
        return result;
        
    }
}
