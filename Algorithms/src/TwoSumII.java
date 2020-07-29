public class TwoSumII {

	public int[] twoSum(int[] numbers, int target) {

		int index1 = 0;
		int index2 = numbers.length - 1;

		while (index1 < index2) {
			int total = numbers[index1] + numbers[index2];
			if (total < target) {
				index1 += 1;
			} else if (total > target) {
				index2 -= 1;
			} else {
				return new int[] { index1 + 1, index2 + 1 };
			}
		}
		return null;
	}
}
