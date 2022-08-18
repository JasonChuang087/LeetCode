package leetCodeSolution;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int nums[] = { 1,3,6,7,9,4,10,5,6 };
		// 10,9,2,5,3,7,101,18
		// 1,3,6,7,9,4,10,5,6
		lengthOfLIS(nums);

	}

	public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;

        for(int x : nums) {
            int i = Arrays.binarySearch(dp, 0, len, x);
            System.out.println(i++);
            if(i < 0) i = -(i + 1);
            
            dp[i] = x;
            if(i == len) len++;
        }

        return len;
	}

}
