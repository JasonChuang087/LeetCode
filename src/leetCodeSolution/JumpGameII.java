package leetCodeSolution;

public class JumpGameII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,1,1,4};
		System.out.println(jump(nums));

	}
	
    public static int jump(int[] nums) {
    	int jump = 0;
    	int diff = nums.length;
    	int init = nums[0];
    	// ¥Îgreedy search
    	while(diff>0) {
        	for(int i=0;i<init;i++) {
        		
        	}
    		jump++;
    		diff--;
    	}
        return jump;
    }

}
