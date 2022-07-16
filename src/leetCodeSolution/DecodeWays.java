package leetCodeSolution;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {

	public static void main(String[] args) {
		/*
		 * Test Case
		 * "123123" 9
		 * "27" 1
		 * */
		// TODO Auto-generated method stub
		String s = "123123";
		
		System.out.println(numDecodings(s));
	} 
	static Map<String, Integer> list = new HashMap<String, Integer>();

    public static int numDecodings(String s) {
        if (s.isEmpty() || s.charAt(0) - '0' == 0)
        {
            return 0;
        }
        
        int[] waysToDecode = new int[s.length() + 1];
        waysToDecode[0] = 1;
        waysToDecode[1] = 1;
        for (int i = 1; i < s.length(); i++)
        {
            int curr = s.charAt(i) - '0';
            int prev = s.charAt(i - 1) - '0';
            
            // can't make progress, return 0
            if (prev == 0 && curr == 0 || (curr == 0 && (prev * 10 + curr > 26)))
            {
                return 0;
            }
            // can't use the previous value, so can only get to this state from the previous
            else if (prev == 0 || (prev * 10 + curr) > 26)
            {
                waysToDecode[i + 1] = waysToDecode[i];
            }
            // can't use current state, can only get to this state from i - 1 state
            else if (curr == 0)
            {
                waysToDecode[i + 1] = waysToDecode[i - 1];
            }
            // can get to this state from the previous two states
            else
            {
                waysToDecode[i + 1] = waysToDecode[i] + waysToDecode[i - 1];
            }
        }
        
        return waysToDecode[s.length()];
    }
    
    public static void initDict() {
    	list.put("1", 1);
    	list.put("2", 1);
    	list.put("3", 1);
    	list.put("4", 1);
    	list.put("5", 1);
    	list.put("6", 1);
    	list.put("7", 1);
    	list.put("8", 1);
    	list.put("9", 1);
    	list.put("10", 1);
    	list.put("11", 2);
    	list.put("12", 2);
    	list.put("13", 2);
    	list.put("14", 2);
    	list.put("15", 2);
    	list.put("16", 2);
    	list.put("17", 2);
    	list.put("18", 2);
    	list.put("19", 2);
    	list.put("20", 1);
    	list.put("21", 2);
    	list.put("22", 2);
    	list.put("23", 2);
    	list.put("24", 2);  	
    	list.put("25", 2);
    	list.put("26", 2);
    	list.put("27", 1);
    	list.put("28", 1);
    	list.put("29", 1);
    	list.put("30", 1);
    	list.put("31", 1);
    	list.put("32", 1);
    	list.put("33", 1);
    	list.put("34", 1);
    	list.put("35", 1);
    	list.put("36", 1);
    	list.put("37", 1);
    	list.put("38", 1);
    	list.put("39", 1);
    	list.put("40", 1);
    	list.put("41", 1);  	
    	list.put("42", 1);
    	list.put("43", 1);
    	list.put("44", 1);  	
    	list.put("45", 1);
    	list.put("46", 1);
    	list.put("47", 1);  	
    	list.put("48", 1);
    	list.put("49", 1);
    	list.put("50", 1);
    	list.put("51", 1);  	
    	list.put("52", 1);
    	list.put("53", 1);
    	list.put("54", 1);  	
    	list.put("55", 1);
    	list.put("56", 1);
    	list.put("57", 1);  	
    	list.put("58", 1);
    	list.put("59", 1);
    	list.put("60", 1);
    	list.put("61", 1);  	
    	list.put("62", 1);
    	list.put("63", 1);
    	list.put("64", 1);  	
    	list.put("65", 1);
    	list.put("66", 1);
    	list.put("67", 1);  	
    	list.put("68", 1);
    	list.put("69", 1);
    	list.put("70", 1);
    	list.put("71", 1);  	
    	list.put("72", 1);
    	list.put("73", 1);
    	list.put("74", 1);  	
    	list.put("75", 1);
    	list.put("76", 1);
    	list.put("77", 1);  	
    	list.put("78", 1);
    	list.put("79", 1);
    	list.put("80", 1);
    	list.put("81", 1);  	
    	list.put("82", 1);
    	list.put("83", 1);
    	list.put("84", 1);  	
    	list.put("85", 1);
    	list.put("86", 1);
    	list.put("87", 1);  	
    	list.put("88", 1);
    	list.put("89", 1);
    	list.put("90", 1);
    	list.put("91", 1);  	
    	list.put("92", 1);
    	list.put("93", 1);
    	list.put("94", 1);  	
    	list.put("95", 1);
    	list.put("96", 1);
    	list.put("97", 1);  	
    	list.put("98", 1);
    	list.put("99", 1);
    }

}
