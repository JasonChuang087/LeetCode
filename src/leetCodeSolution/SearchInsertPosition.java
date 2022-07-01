package leetCodeSolution;

import java.util.Arrays;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3,5, 7, 9 };
		int ans = searchInsert(nums,4);

		System.out.println(ans);
	}
	
	public static int searchInsert(int[] nums, int target) {
		int result = Arrays.binarySearch(nums,target);
		if(result<0) {
			result = -1-result;
		}
		System.out.println("ans "+result);
		return result;
	}

	/*
	public static int search(int[] nums, int first, int last, int target) {
		int len = nums.length;
		System.out.println("len "+len);
		if (len % 2 == 0) {
			len = len / 2;
			if (nums[len-1] > target && nums[len] < target) {
				System.out.println("answerA " + (len - 1));
				search(nums, first, last, target);
			}
			else if(nums[len]==target) {
				System.out.println("answerB " + len);
				search(nums, first, last, target);
			}
			else if (nums[len] > target) {
				last = len;
				System.out.println("last " + last);
                nums = Arrays.copyOfRange(nums,first,last);
				search(nums, first, last, target);
			} 
			else if (nums[len] < target) {
				first = len;
				System.out.println("first " + first);
                nums = Arrays.copyOfRange(nums,first,last);
				search(nums, first, last, target);

			} 
		} else {
			len = (len + 1) / 2;
			if (nums[len-1] > target && nums[len] < target) {
				System.out.println("answerC " + (len - 1));
				search(nums, first, last, target);
			}
			else if(nums[len]==target) {
				System.out.println("answerD " + len);
				search(nums, first, last, target);
			}
			else if (nums[len] > target) {
				last = len;
                System.out.println("last2 " + last);
                nums = Arrays.copyOfRange(nums,first,last);
				search(nums, first, last, target);
			} else if (nums[len] < target) {
				first = len;
                System.out.println("first2 " + first);
                nums = Arrays.copyOfRange(nums,first,last);
				search(nums, first, last, target);            
			} 
		}
		return first;
	}
	*/

}
