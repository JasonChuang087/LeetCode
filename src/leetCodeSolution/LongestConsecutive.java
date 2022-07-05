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
		// �Ŧr��longestConsecutive��0
		if (nums.length == 0) {
			return 0;
		}
		// �Ѥp��j�Ƨ�
		Arrays.sort(nums);
		// �̪��s��ǦC
		int longest = 1;
		// ��e�s��ǦC
		int temp = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] - nums[i - 1] == 1) {
				temp += 1;
			} else if (nums[i] - nums[i - 1] == 0) { // ���ƼƦr���v�T��e�s��ǦC
			} else {
				// ��s�̪��s��ǦC ���m��e�s��ǦC
				longest = Math.max(longest, temp);
				temp = 1;
			}
		}
		longest = Math.max(longest, temp);
		return longest;
	}

}
