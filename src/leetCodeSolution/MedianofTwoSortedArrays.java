package leetCodeSolution;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int len1 = nums1.length;
    	int len2 = nums2.length;
    	int[] merge = new int[len1+len2];
    	System.arraycopy(nums1, 0, merge, 0, len1);
    	System.arraycopy(nums2, 0, merge, len1, len2);
    	Arrays.sort(merge);
    	if(merge.length%2==0) {
    		return (merge[merge.length/2] + merge[merge.length/2 - 1] )/ 2.0;
    	}
    	
        return merge[(merge.length-1)/2];
    }

}
