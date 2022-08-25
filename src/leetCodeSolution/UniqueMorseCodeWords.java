package leetCodeSolution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"gin","zen","gig","msg"};
		int num = uniqueMorseRepresentations(words);
		System.out.println(num);
	}

	static Map<Character,String> map = new HashMap<Character,String>();
	
    public static int uniqueMorseRepresentations(String[] words) {
    	initDict();
        Set<String> set = new HashSet<String>();
    	for(int i=0;i<words.length;i++) {
    		String morse = "";
    		for(Character c:words[i].toCharArray()) {
    			morse = morse + map.get(c);
    		}
    		set.add(morse);
    	}
        return set.size();
    }
    
    public static void initDict() {
    	map.put('a',".-");
    	map.put('b',"-...");
    	map.put('c',"-.-.");
    	map.put('d',"-..");
    	map.put('e',".");
    	map.put('f',"..-.");
    	map.put('g',"--.");
    	map.put('h',"....");
    	map.put('i',"..");
    	map.put('j',".---");
    	map.put('k',"-.-");
    	map.put('l',".-..");
    	map.put('m',"--");
    	map.put('n',"-.");
    	map.put('o',"---");
    	map.put('p',".--.");
    	map.put('q',"--.-");
    	map.put('r',".-.");
    	map.put('s',"...");
    	map.put('t',"-");
    	map.put('u',"..-");
    	map.put('v',"...-");
    	map.put('w',".--");
    	map.put('x',"-..-");
    	map.put('y',"-.--");
    	map.put('z',"--..");        
    }
}
