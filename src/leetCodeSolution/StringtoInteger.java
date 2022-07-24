package leetCodeSolution;

public class StringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "88kords and 987";
		System.out.println(myAtoi(s));
	}
	
    public static int myAtoi(String str) {
//    	s= s.trim();
    	/*
    	int index = 0;
    	while(index<s.length()) {
    		index++;
    	}
    	s = s.replaceFirst("^0+(?!$)", "");
    	s = s.replaceAll("[^\\d.-]", "");
    	
    	if(s.length()==0) {
    		return 0;
    	}
        if(Long.parseLong(s)>=Integer.MAX_VALUE) {
        	return Integer.MAX_VALUE;
        }
        else if (Long.parseLong(s)<=Integer.MIN_VALUE) {
        	return Integer.MIN_VALUE;
        }
    	return Integer.parseInt(s);
    	*/
    	int index = 0;
        int total = 0;
        int sign = 1;
        
        // Check if empty string
        if(str.length() == 0)
            return 0;
        
        // remove white spaces from the string
        while(index < str.length() && str.charAt(index) == ' ')
            index++;
        
        if (index == str.length()) return 0;
        
        // get the sign
        if(str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        
        // convert to the actual number and make sure it's not overflow
        while(index < str.length()) {
            int digit = str.charAt(index) - '0';
            System.out.println(digit);
            //convert to ASCII code
            if(digit < 0 || digit > 9) break;
            
            // check for overflow
            if(Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            total = total*10 + digit;
            index++; // don't forget to increment the counter
        }
        return total*sign; 
    }

}
