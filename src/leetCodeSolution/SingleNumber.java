package leetCodeSolution;

import java.util.Arrays;

public class SingleNumber {

        public static void main(String[] args) {
                int[] nums = {1,2,1};
                System.out.println(singleNumber(nums));
                
        }
        
        public static int singleNumber(int[] nums) {
                if(nums.length==1) {
                        return nums[0];
                }
                Arrays.sort(nums);
                for(int i=1;i<nums.length-1;i+=2) {
                        if(nums[0]!=nums[1]) {
                                return nums[0];
                        }
                        if(nums[i]!=nums[i-1]) {
                                return nums[i-1];
                        }
                }
                return nums[nums.length-1];
        }

}
