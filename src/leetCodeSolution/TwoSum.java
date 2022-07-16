package leetCodeSolution;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 4, 0, 3, 0 };
		int target = 0;
		int[] results = twoSum(nums, target);
		System.out.println("result0 "+results[0]);
		System.out.println("result1 "+results[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		int index = 0;
		int i = 0;
		int[] result = new int[2];



		while (i < nums.length) {
			int diff = target - nums[i];
			index = IntStream.range(i+1, nums.length)
	        		.filter(j->nums[j]==diff)
	        		.findFirst().orElse(-1);		
			if (index >= 0) {
				result[0] = i;
				result[1] = index;
				return result;
			}
			i++;
		}

		return result;
	}

}
