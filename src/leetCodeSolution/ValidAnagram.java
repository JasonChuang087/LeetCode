package leetCodeSolution;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagramt";
		String t = "nagaramr";
		isAnagram(s,t);
		isAnagram2(s,t);
	}
	
    public static boolean isAnagram(String s, String t) {
    	if(s.length()!=t.length()) return false;
    	for(int i=0;i<t.length();i++) {
    		String ch = String.valueOf(t.charAt(i)); 
    		s = s.replaceFirst(ch, "");
    	}
    	if(s.length()==0) {
    		return true;
    	}
        return false;
    }
    
    public static boolean isAnagram2(String s, String t) {
    	if(s.length()!=t.length()) return false;
    	char[] sc = s.toCharArray();
    	char[] tc = t.toCharArray();
    	Arrays.sort(sc);
    	Arrays.sort(tc);
    	int i = 0;
    	while(i<sc.length) {
    		if(sc[i]!=tc[i]) {
    			return false;
    		}
    		i++;
    	}
        return true;
    }

}
