package romanToInt;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-106900));
	}
	
    public static int reverse(int x) {
        if (x >= 2147483647 || x <= -2147483648) {
        	return 0;
        }
        String temp = Integer.toString(x);
        ArrayList<Character> reverseNums = new ArrayList<Character>();
        for (int i=0;i<temp.length();i++) {
        	reverseNums.add(temp.charAt(i));
        }
        Collections.reverse(reverseNums);
        String reverse = "";
        for (int j=0;j<reverseNums.size();j++) {
        	if(reverseNums.get(j)=='-') {
        		reverse = "-" + reverse;
        	}
        	else if (reverseNums.get(j)=='0' && (reverseNums.get(j)!='0' && j<reverseNums.size()-1)){
        	}
        	else {
        		reverse+=reverseNums.get(j);  	
        	}
        }
        try {
        	return Integer.parseInt(reverse);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
