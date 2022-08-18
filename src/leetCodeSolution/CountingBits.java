package leetCodeSolution;

import java.util.HashMap;
import java.util.Map;

public class CountingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 17;
		int[] result = countBits(n);
		for(int i:result) {
			System.out.println(i);
		}
	}

    public static int[] countBits(int n) {
    	int result[]=new int[n+1];
    	if(n==0) {
    		result[0]=0;
    		return result;
    	}
    	else if(n==1) {
    		result[0]=0;
    		result[1]=1;
    		return result;
    	}

    	
    	for(int i=0;i<=n;i++) {
    		result[i] = Integer.bitCount(i);
    	}
        return result;
    }

}
