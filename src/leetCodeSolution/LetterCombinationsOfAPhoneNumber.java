package leetCodeSolution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letterCombinations("2378");
	}
	
	static Map<String, String> map= new HashMap<String, String>();
	
    public static List<String> letterCombinations(String digits) {
    	init();
    	List<String> result = new ArrayList<String>();
    	if(digits.length()==0) {
    		return result;
    	}
    	else if(digits.length()==1) {
    		String string = map.get(digits.charAt(0)+"");   		
    		for(char s:string.toCharArray()) {
    			result.add(s+"");
    		}
    		System.out.println(result);
    		return result;
    	}
    	else if(digits.length()==2) {
    		String string1 = map.get(digits.charAt(0)+"");
    		String string2 = map.get(digits.charAt(1)+"");
    		for(int i=0;i<string1.toCharArray().length;i++){
        		for(int j=0;j<string2.toCharArray().length;j++){
        			result.add(string1.charAt(i)+""+string2.charAt(j));
        		}
    		}
    		System.out.println(result);
    		return result;
    	}
    	else if(digits.length()==3) {
    		String string1 = map.get(digits.charAt(0)+"");
    		String string2 = map.get(digits.charAt(1)+"");
    		String string3 = map.get(digits.charAt(2)+"");
    		for(int i=0;i<string1.toCharArray().length;i++){
        		for(int j=0;j<string2.toCharArray().length;j++){
            		for(int k=0;k<string3.toCharArray().length;k++){
            			result.add(string1.charAt(i)+""+string2.charAt(j)+string3.charAt(k));
            		}
        		}
    		}
    		System.out.println(result.size());
    		return result;
    	}
    	else if(digits.length()==4) {
    		String string1 = map.get(digits.charAt(0)+"");
    		String string2 = map.get(digits.charAt(1)+"");
    		String string3 = map.get(digits.charAt(2)+"");
    		String string4 = map.get(digits.charAt(3)+"");
    		for(int i=0;i<string1.toCharArray().length;i++){
        		for(int j=0;j<string2.toCharArray().length;j++){
            		for(int k=0;k<string3.toCharArray().length;k++){
                		for(int l=0;l<string4.toCharArray().length;l++){
                			result.add(string1.charAt(i)+""+string2.charAt(j)+string3.charAt(k)+string4.charAt(l));
                		}
            		}
        		}
    		}
    		System.out.println(result.size());
    		return result;
    	}
    	else {
            return result;	
    	}
    }
    
    public static void init() {
    	map.put("2", "abc");
    	map.put("3", "def");
    	map.put("4", "ghi");
    	map.put("5", "jkl");
    	map.put("6", "mno");
    	map.put("7", "pqrs");
    	map.put("8", "tuv");
    	map.put("9", "wxyz");
    }

}
