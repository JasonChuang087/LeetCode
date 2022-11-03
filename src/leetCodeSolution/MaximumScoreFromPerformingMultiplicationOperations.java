package leetCodeSolution;

public class MaximumScoreFromPerformingMultiplicationOperations {

        public static void main(String[] args) {
                int[] nums = {1,2,3};
                int[] multipliers = {3,2,1};
                System.out.println(maximumScore(nums,multipliers));

        }
        
        public static int maximumScore(int[] nums, int[] multipliers) {
                int score = Integer.MIN_VALUE;
                int[][] list= new int[multipliers.length+1][multipliers.length+1];
                int n = nums.length;
                int m = multipliers.length;
                for(int k=1;k<=m;k++) {
                        for(int l=0;l<=k;l++) {
                                int pick_left = l==0? Integer.MIN_VALUE:list[l-1][k-l]+multipliers[k-1]*nums[l-1];
                                int pick_right = l==k?Integer.MIN_VALUE:list[l][k-l-1]+multipliers[k-1]*nums[n-k+l];
                                list[l][k-l] = Math.max(pick_left, pick_right);
                                
                                if(k==m) {
                                        score = Math.max(score,list[l][k-l]);
                                }
                        }                
                }
                return score;
        }

}
