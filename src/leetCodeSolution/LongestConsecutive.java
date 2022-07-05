package leetCodeSolution;

import java.util.Arrays;

public class LongestConsecutive {

	public static void main(String[] args) {
		/*
		 * Runtime: 18 ms faster than 93.33% of Java online submissions for Longest
		 * Consecutive Sequence. Memory Usage: 64 MB less than 77.15% of Java online
		 * submissions for Longest Consecutive Sequence.
		 */
		int[] nums = {};
		/*
		 * Test Case [9,1,4,7,3,-1,0,5,8,-1,6] answer:7 [] answer:0
		 */
		System.out.println(longestConsecutive(nums));

	}

	public static int longestConsecutive(int[] nums) {
		// 空字串longestConsecutive為0
		if (nums.length == 0) {
			return 0;
		}
		// 由小到大排序
		Arrays.sort(nums);
		// 最長連續序列
		int longest = 1;
		// 當前連續序列
		int temp = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] - nums[i - 1] == 1) {
				temp += 1;
			} else if (nums[i] - nums[i - 1] == 0) { // 重複數字不影響當前連續序列
			} else {
				// 更新最長連續序列 重置當前連續序列
				longest = Math.max(longest, temp);
				temp = 1;
			}
		}
		longest = Math.max(longest, temp);
		return longest;
	}

}
