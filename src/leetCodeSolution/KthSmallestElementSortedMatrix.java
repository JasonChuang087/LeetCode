package leetCodeSolution;

import java.util.Arrays;

public class KthSmallestElementSortedMatrix {

	public static void main(String[] args) {
//		int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
		int[][] matrix = {{1,2},{1,3}};
		int k = 1;
		kthSmallest(matrix,k);
	}
		
    
    public static int kthSmallest(int[][] matrix, int k) {
    	int[] result = new int[matrix.length*matrix.length];
    	for(int i=0;i<matrix.length;i++) {
    		for(int j=0;j<matrix.length;j++) {
    			result[j+matrix.length*i]=matrix[i][j];
    			System.out.println(result[j+matrix.length*i]);
    		}
    	}
    	Arrays.sort(result);
        return result[k-1];
    }
    

}
