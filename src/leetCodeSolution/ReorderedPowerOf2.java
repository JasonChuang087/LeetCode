package leetCodeSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReorderedPowerOf2 {

	public static void main(String[] args) {	
		System.out.println(reorderedPowerOf2(652));
	}
	
	static List<int[]> list = new ArrayList<int[]>();
	
    public static boolean reorderedPowerOf2(int n) {
    	init();
    	int[] nums = new int[10];
    	
    	// calculate number 0-9 of occurrences
        while (n != 0) {
        	nums[n % 10]++;
        	n /= 10;
        }
    	
        // compare Array
    	for(int i=0;i<31;i++) {
    		if(Arrays.equals(nums, list.get(i))) {
    			return true;
    		}
    	}  	
        return false;
    }
    
    public static void init()
    {
    	// calculate 2^0 - 2^30 number 0-9 of occurrences
    	for(int i=0;i<31;i++) {
    		int n = (int) Math.pow(2, Double.valueOf(i));
    		int[] nums = new int[10];
            while (n != 0) {
            	nums[n % 10]++;
            	n /= 10;
            }
    		list.add(nums);
    	}
    }
}
