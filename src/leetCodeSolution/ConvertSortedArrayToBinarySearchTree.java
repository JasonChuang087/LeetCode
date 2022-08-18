package leetCodeSolution;

import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-10,-3,0,5,9};
		TreeNode result = sortedArrayToBST(nums);
		System.out.println(result.val);

	}
	
    public static TreeNode sortedArrayToBST(int[] nums) {
    	if(nums.length==0) {
    		return null;
    	}
    	TreeNode root = helper(nums,0,nums.length-1);
        return root;
    }
    
    public static TreeNode helper(int[] nums,int low,int high) {
    	if(low>high) {
    		return null;
    	}
    	int mid = (low+high)/2;
    	TreeNode root = new TreeNode(nums[mid]);
    	root.left = helper(nums,low,mid-1);
    	root.right = helper(nums,mid+1,high);
        return root;
    }
    
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
				this.val = val;
				this.left = left;
				this.right = right;
		}
	}

}
