package leetCodeSolution;

import java.util.Arrays;

public class Candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1,2,87,87,87,2,1 answer:13
		// 1,3,2,2,1 answer:7
		// 29,51,87,87,72,12 answer:12
		// 1,3,4,5,2	answer:11
		// 1,6,10,8,7,3,2 answer:18
		int[] ratings = { 1,3,2,2,1 };
		System.out.println(candy(ratings));
	}

	public static int candy(int[] ratings) {
		int len = ratings.length;
		int[] left = new int[len];
		Arrays.fill(left,1);
		int[] right = new int[len];
		Arrays.fill(right,1);
		for(int i=1;i<len;i++) {
			if(ratings[i]>ratings[i-1]) {
				left[i] = left[i-1] + 1;
			}
		}
		for(int j=len-2;j>=0;j--) {
			if(ratings[j]>ratings[j+1]) {
				right[j] = right[j+1] + 1;
			}
		}
		int sum = 0;
		for(int k=0;k<left.length;k++) {
			System.out.println("right "+right[k]);
			System.out.println("left "+left[k]);
			sum += Math.max(right[k], left[k]);
		}
		
		return sum;
	}

}
