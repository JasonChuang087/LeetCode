package leetCodeSolution;

public class PowerOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		System.out.println(isPowerOfFour(n));

	}
	
    public static boolean isPowerOfFour(int n) {
    	double num = n;
    	while(num>4.0) {
    		num = num/4.0;
    		System.out.println(num);
    	}
    	if(num==4.0||num==1.0) {
    		return true;
    	} 	
        return false;
    }
}
