package leetCodeSolution;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumUnits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]boxTypes = {{1,3},{5,5},{2,5},{4,2},{4,1},{3,1},{2,2},{1,3},{2,5},{3,2}};
		int truckSize = 35;
		System.out.println(maximumUnits(boxTypes,truckSize));
	}
    public static int maximumUnits(int[][] boxTypes, int truckSize) { 	
    	Arrays.sort(boxTypes, Comparator.comparingInt(o -> o[1]));
    	int i = boxTypes.length -1;
    	int maxSize = 0;
    	while(truckSize>0) {
    		// no box left , return answer
    		if(boxTypes[0][0]==0) {
    			return maxSize;
    		}
    		if(boxTypes[i][0]==0) {
    			i--;
    		}  	
    		boxTypes[i][0] -= 1;
    		truckSize -= 1;
    		maxSize += boxTypes[i][1];		
    	}   	
        return maxSize;
    }

}
