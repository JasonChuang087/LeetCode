package leetCodeSolution;

import java.util.Arrays;

public class Searcha2DMatrixII {
	/*
	 * No.74 Search a 2D Matrix
	 * No.240 Search a 2D Matrix II
	 * */
	public static void main(String[] args) {
		int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int target = 5;
		System.out.println(searchMatrix(matrix, target));
	}
	
    public static boolean searchMatrix(int[][] matrix, int target) {
    	int i = 0;
    	while(i<matrix.length){
    		if(Arrays.binarySearch(matrix[i],target)>=0) {
    			return true;
    		}
    		i++;
    	}
        return false;
    }

}
