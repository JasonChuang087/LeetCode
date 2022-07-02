package leetCodeSolution;

import java.util.Arrays;

public class MaximumArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h = 5;
		int w = 4;
		int[] horizontalCuts = {3,1};
		int[] verticalCuts = {1};
		// maxArea(5,4,horizontalCuts,verticalCuts);
		System.out.println(maxArea(h,w,horizontalCuts,verticalCuts));
	}
	
    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
    	Arrays.sort(horizontalCuts);
    	int max_h = horizontalCuts[0];
    	int i = 0;
    	int h_len = horizontalCuts.length-1;
		if(h - horizontalCuts[h_len] > max_h) {
			max_h = h - horizontalCuts[h_len];
		}
    	while(i<h_len) {
    		if(horizontalCuts[i+1]-horizontalCuts[i]>max_h) {
    			max_h = horizontalCuts[i+1]-horizontalCuts[i];
    		}
    		i++;
    	}
    	System.out.println(max_h);
    	Arrays.sort(verticalCuts);
    	int max_v = verticalCuts[0];
    	int v_len = verticalCuts.length-1;
		if(w - verticalCuts[v_len] > max_v) {
			max_v = w - verticalCuts[v_len];
		}
    	int j = 0;
    	while(j<v_len) {
    		if(verticalCuts[j+1]-verticalCuts[j]>max_v) {
    			max_v = verticalCuts[j+1]-verticalCuts[j];
    		}
    		j++;
    	}
    	System.out.println(max_v);
        return (int) ((long) max_h * (long)max_v % 1000000007L);
    }
}
