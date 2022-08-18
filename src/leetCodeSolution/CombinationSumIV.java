package leetCodeSolution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CombinationSumIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,1,2,4};
		int target = 4;
		combinationSum4(nums,target);

	}
	static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
    public static int combinationSum4(int[] nums, int target) {
    	Arrays.sort(nums);
    	int[] result = new int[target+1];

    	for(int i=0;i<nums.length;i++) {
    		int last = target - nums[i];
    		if(nums[i]>target) {
    			break;
    		}
    		result[last] = count(nums,last);		 
    	}
    	int total=0;
    	for(int add:result) {
    		total+=add;
    	}
    	System.out.println("total "+total);
    	System.out.println(map);
    	map.clear();
        return total;
    }
    
    public static int count(int[] nums,int target) {
    	System.out.println("target "+target);
    	if(target<0) {
    		return 0;
    	}
    	else if(nums[0]==target||target==0) {
    		return 1;
    	}
    	else if(map.get(target)!=null) {
    		return map.get(target);
    	}
    	else {
    		int result = 0;
    		for(int num:nums) {
    			result += count(nums,target-num);
    		}
			map.put(target, result);
			
			return result;
    	}
    }
}
