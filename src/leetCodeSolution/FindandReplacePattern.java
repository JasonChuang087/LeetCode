package leetCodeSolution;

import java.util.ArrayList;
import java.util.List;

public class FindandReplacePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
		String pattern = "abb";
		findAndReplacePattern(words,pattern);
	}
	
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
    	List<String> result = new ArrayList<String>();
    	int num = 0;
    	for(int i=0;i<pattern.length();i++) {
    		pattern = pattern.replace(pattern.charAt(i),(char)(num+'0'));
    		num++;
    	}
    	
    	for(String word:words) {
    		if(match(word,pattern)) {
    			result.add(word);
    		}
    	}
    	System.out.println(result);
        return result;
    }
    
    public static boolean match(String word,String pattern) {
    	int num = 0;
    	for(int i=0;i<word.length();i++) {
    		word = word.replace(word.charAt(i),(char)(num+'0'));
    		num++;
    	}
    	if(pattern.equals(word)) {
    		return true;
    	}
        return false;
    }

}
