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

public class ThreeSumSolution2 {
	public List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < nums.length - 1; i++) {
			int index1 = i;
			int index2 = i + 1;
			int index3 = nums.length - 1;
			while (index1 < index2 && index2 < index3) {
				if (nums[index1] + nums[index2] + nums[index3] == 0) {
					if (!set.contains(nums[index1] + "" + nums[index2] + ""
							+ nums[index3])) {
						set.add(nums[index1] + "" + nums[index2] + ""
								+ nums[index3]);
						result.add(Arrays.asList(nums[index1], nums[index2],
								nums[index3]));
					}
					index2 += 1;
					index3 -= 1;
				} else if (nums[index1] + nums[index2] + nums[index3] > 0) {
					index3 -= 1;
				} else {
					index2 += 1;
				}

			}
		}

		return result;

	}
}
