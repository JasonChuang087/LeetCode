package leetCodeSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountofSmallerNumbersAfterSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,2,6,1};
		// countSmaller(nums);
		smallerNumbersThanCurrent(nums);
	}
	
    public static int[] smallerNumbersThanCurrent(int[] nums) {
    	int[] result = new int[nums.length];
    	for(int i=0;i<nums.length;i++) {
    		int number = nums[i];
    		long counter = IntStream.of(nums)
    	            .filter(j -> j<number)
    	            .count();
    		result[i] = (int)counter;
    	}
        return result;
    }
	
    public static List<Integer> countSmaller(int[] nums) {
    	List<Integer> bigger = new ArrayList<Integer>();
    	if(nums.length==1) {
    		bigger.add(0);
    		return bigger;
    	}
    	for(int i=0;i<nums.length;i++) {
    		int number = nums[i];
    		long counter = IntStream.of(nums)
    	            .filter(j -> j<number)
    	            .count();
    		System.out.println(counter);
    		bigger.add((int) counter);
    		nums[i] = Integer.MAX_VALUE;
    	}
        return bigger;
    }

}
