package leetCodeSolution;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(109,3));

	}
	
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
    		return Integer.MAX_VALUE;
    	}
        if(dividend == 0){
            return 0;
        }
        boolean same = dividend < 0 ^ divisor < 0 ;
        long quotient = 0;
        long absDividend = Math.abs((long)dividend);
        long absDivisor = Math.abs((long)divisor);       
        while(absDividend >= 0) {
        	long temp=0;
        	int mul=0;
        	while(absDividend-temp>0) {
        		temp = absDivisor*(long)Math.pow(2, mul);
        		mul += 1;
        	}
        	absDividend -= temp;
        	quotient += mul;
        }       
        if (same) return (int)-quotient; 
        return (int)quotient;      
    }

}
