package leetCodeSolution;

import java.util.Arrays;
import java.util.Collections;

public class MatchstickstoSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Test Case
		 * input output
		 * [5,5,5,5,4,4,4,4,3,3,3,3] true
		 * [10,6,5,5,5,3,3,3,2,2,2,2] true
		 * */
		int[] matchsticks = {10,6,5,5,5,3,3,3,2,2,2,2};
		System.out.println(makesquare(matchsticks));
	}

    public static boolean makesquare(int[] nums) {
    	if (nums == null || nums.length < 4) return false;
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 4 != 0) return false;
        Integer[] reverse = Arrays.stream(nums).boxed().toArray( Integer[]::new );
        Arrays.sort(reverse, Collections.reverseOrder());      
    	return dfs(reverse, new int[4], 0, sum / 4);
    }
    
    private static boolean dfs(Integer[] nums, int[] side, int index, int target) {
    	System.out.println("side0 "+side[0]);
    	System.out.println("side1 "+side[1]);
    	System.out.println("side2 "+side[2]);
    	System.out.println("side3 "+side[3]);
    	if (index == nums.length) {
    	    if (side[0] == target && side[1] == target && side[2] == target) {
    		return true;
    	    }
    	    return false;
    	}
    	
    	for (int i = 0; i < 4; i++) {
    		//System.out.println("i "+i);
    	    if (side[i] + nums[index] > target) {
    	    	//System.out.println("side+nums "+(side[i] + nums[index]));
    	    	continue;
    	    }
    	    side[i] += nums[index];
    	    System.out.println("side+ "+side[i]);
            if (dfs(nums, side, index + 1, target)) {
            	return true;
            }
            side[i] -= nums[index];
            //System.out.println("side- "+side[i]);
    	}
    	
    	return false;
    }



}
