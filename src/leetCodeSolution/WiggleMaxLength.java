package leetCodeSolution;

public class WiggleMaxLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };
		System.out.println(wiggleMaxLength(nums));
	}

	public static int wiggleMaxLength(int[] nums) {
		if (nums.length < 2) {
			return nums.length;
		}
		int front = 1;
		int back = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				front = Math.max(front, back + 1);
			} else if (nums[i] < nums[i - 1]) {
				back = Math.max(front + 1, back);
			}
		}
		return Math.max(front, back);
	}

}
