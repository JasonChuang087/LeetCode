package leetCodeSolution;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));

	}
    public static int maxArea(int[] height) {
    	int maxArea = 0;
    	int i = 0;
    	int j = height.length - 1;
    	while(i<j) {
    		if(height[i]<height[j]) {
    			maxArea = Math.max(maxArea, height[i]*(j-i));
    			i++;
    		}
    		else if (height[i]>=height[j]) {
    			maxArea = Math.max(maxArea, height[j]*(j-i));
    			j--;
    		}
    	}
        return maxArea;
    }

}
