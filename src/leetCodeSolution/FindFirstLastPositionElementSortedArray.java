package leetCodeSolution;

import java.util.Arrays;

public class FindFirstLastPositionElementSortedArray {

	public static void main(String[] args) {
		int[] nums = {3,3,3};
		int target = 3;
		searchRange(nums,target);

	}
	
    public static int[] searchRange(int[] nums, int target) {
    	int[] ans = {-1,-1};
    	if(nums.length==0) {
    		return ans;
    	}
    	int result = Arrays.binarySearch(nums, target);
    	int i = result;
    	System.out.println(result);
    	if(result>=0) {
    		if((result+1<nums.length&&nums[result+1]==target)&&(result-1>=0&&nums[result-1]==target)) {
    			int up = i;
    			int down = i;
        		while(up<nums.length&&nums[up]==target) {
        			up++;
        		}
        		while(down>=0&&nums[down]==target) {
        			down--;
        		}
        		ans[0] = down+1;
        		ans[1] = up-1;
        		System.out.println("up: "+(up-1)+" down: "+(down+1));
        		
    		}
    		else if(i+1<nums.length&&nums[i+1]==target) {
        		while(i<nums.length&&nums[i]==target) {
        			i++;
        		}	

        		ans[0] = result;
        		ans[1] = i-1;
        		System.out.println("0: "+result+" 1: "+(i-1));
    		}
    		else if(i-1>=0&&nums[i-1]==target) {
        		while(i>=0&&nums[i]==target) {
        			i--;
        		}
        		
        		ans[0] = i+1;
        		ans[1] = result;
        		System.out.println("0: "+(i+1)+" 1: "+result);
    		}
    		else {
        		ans[0] = result;
        		ans[1] = result;
        		System.out.println("0: "+result+" 1: "+result);
    		}

    	}
    	else {
    		return ans;
    	}
        return ans;
    }
    
    public static int binarySearch(int[] nums,int target) {
    	int low = 0;
    	int high = nums.length;
    	
    	while(low!=high) {
    		int mid = (low + high) /2;
    		if(target==nums[mid]) {
    			return mid;
    		}
    		else if (target>nums[mid]) {
    			low = mid+1;
    		}
    		else if (target<nums[mid]) {
    			high = mid-1;
    		}
    	}
    	return low;
    }

}
