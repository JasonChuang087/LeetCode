package romanToInt;

import java.util.ArrayList;

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(romanToInt("MCMXCIV"));
		System.out.println(intToRoman(1994));
	}
	
    public static int romanToInt(String s) {
    	ArrayList<Character> chars = new ArrayList<Character>();
    	for (char c : s.toCharArray()) {
    	  chars.add(c);
    	}
    	int total = 0;
    	for (int i=0;i<chars.size();i++) {
    		switch (chars.get(i)) {
    		  case 'I':
    			// 磷index out of bound
    			if (i+1 < chars.size()) {
    				//耞琌IV IX
        			if (chars.get(i+1).equals('V') || chars.get(i+1).equals('X')) {
        				System.out.println("-1");
        				total -= 1;
        				break;
        			}
    			}
    		    System.out.println("+1");
    		    total += 1;
    		    break;
    		  case 'V':
    		    System.out.println("+5");
    		    total += 5;
    		    break;
    		  case 'X':
    			if (i+1 < chars.size()) {
    				//耞琌XL XC
	      			if (chars.get(i+1).equals('L') || chars.get(i+1).equals('C')) {
	    				System.out.println("-10");
	    				total -= 10;
	    				break;
	    			}
    			}
    		    System.out.println("+10");
    		    total += 10;
    		    break;
    		  case 'L':
    		    System.out.println("+50");
    		    total += 50;
    		    break;
    		  case 'C':
    			if (i+1 < chars.size()) {
    				//耞琌CD CM
	        		if (chars.get(i+1).equals('D') || chars.get(i+1).equals('M')) {
	        			System.out.println("-100");
	        			total -= 100;
	        			break;
	        		}
        		}
    		    System.out.println("+100");
    		    total += 100;
    		    break;
    		  case 'D':
    		    System.out.println("+500");
    		    total += 500;
    		    break;
    		  case 'M':
    		    System.out.println("+1000");
    		    total += 1000;
    		    break;
    		}
    	}
		return total;    
    }
    
    
    public static String intToRoman(int num) {
    	char[] list = new char[4];  	
    	String temp = Integer.toString(num);
    	switch(temp.length()) {
    		case 1:
    			list[3] = temp.charAt(0);
    			break;
    		case 2:
    			list[3] = temp.charAt(1);
    			list[2] = temp.charAt(0);
    			break;
    		case 3:
    			list[3] = temp.charAt(2);
    			list[2] = temp.charAt(1);
    			list[1] = temp.charAt(0);
    			break;
    		case 4:
    			list[3] = temp.charAt(3);
    			list[2] = temp.charAt(2);
    			list[1] = temp.charAt(1);
    			list[0] = temp.charAt(0);
    			break;
    	}
    	String result="";
    	// 计程3
    	switch(list[0]) {
		case '1':
			result+="M";
			break;
		case '2':
			result+="MM";
			break;
		case '3':
			result+="MMM";
			break;
    	}
    	// κ计程9
    	switch(list[1]) {
		case '1':
			result+="C";
			break;
		case '2':
			result+="CC";
			break;
		case '3':
			result+="CCC";
			break;
		case '4':
			result+="CD";
			break;
		case '5':
			result+="D";
			break;
		case '6':
			result+="DC";
			break;
		case '7':
			result+="DCC";
			break;
		case '8':
			result+="DCCC";
			break;
		case '9':
			result+="CM";
			break;
    	}
    	// 计程9
    	switch(list[2]) {
		case '1':
			result+="X";
			break;
		case '2':
			result+="XX";
			break;
		case '3':
			result+="XXX";
			break;
		case '4':
			result+="XL";
			break;
		case '5':
			result+="L";
			break;
		case '6':
			result+="LX";
			break;
		case '7':
			result+="LXX";
			break;
		case '8':
			result+="LXXX";
			break;
		case '9':
			result+="XC";
			break;
    	}
    	// 计程9
    	switch(list[3]) {
		case '1':
			result+="I";
			break;
		case '2':
			result+="II";
			break;
		case '3':
			result+="III";
			break;
		case '4':
			result+="IV";
			break;
		case '5':
			result+="V";
			break;
		case '6':
			result+="VI";
			break;
		case '7':
			result+="VII";
			break;
		case '8':
			result+="VIII";
			break;
		case '9':
			result+="IX";
			break;
    	}
        return result;
    }

}
