package leetCodeSolution;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabb";
		
		System.out.println(firstUniqChar(s));
	}
    public static int firstUniqChar(String s) {
    	Map<Character,Integer> map = new HashMap<Character,Integer>();
    	for(Character c:s.toCharArray()) {
    		if(map.containsKey(c)) {
    			map.put(c,map.get(c)+1);
    		}
    		else {
    			map.put(c,1);
    		}
    	}
    	for(int i=0;i<s.length();i++) {
    		if(map.get(s.charAt(i))==1) {
    			return i;
    		}
    	}
    	
        return -1;
    }

}
