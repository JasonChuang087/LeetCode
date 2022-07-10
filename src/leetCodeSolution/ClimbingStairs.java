package leetCodeSolution;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
	static Map<Integer, Integer> stairs = new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println(climbStairs(5));
	}
	
    public static int climbStairs(int n) {
    	if(n==1) return 1;
    	if(n==2) return 2;
    	if(stairs.containsKey(n)) {
    		return stairs.get(n);
    	}
    	else {
    		stairs.put(n,climbStairs(n-1)+climbStairs(n-2));
    	}
    	System.out.println(stairs);    	
        return climbStairs(n-1)+climbStairs(n-2);
    }

}
