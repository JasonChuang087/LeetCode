package leetCodeSolution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words1 = { "amazon", "apple", "facebook", "google", "leetcode" };
		String[] words2 = { "eec","oco","ceo"};
		wordSubsets(words1, words2);
	}

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result=new ArrayList<>();
         int[] target=new int[26];
         //  words2 = ["eec","oco","ceo"]
         //  search word :  eecoo
         for(String word:words2){
             int[] temp=new int[26];
             for(char ch:word.toCharArray()){
            	 //ASC II Code
                 temp[ch-'a']++;
                 target[ch-'a']=Math.max(target[ch-'a'],temp[ch-'a']);
             }
         }
         
         for(String word:words1){
             int[] source=new int[26];
             for(char ch:word.toCharArray()){
                 source[ch-'a']++;
             }
             
             if(subset(source,target)){
                 result.add(word);
             }
         }
         
         return result;
     }
     
     private static boolean subset(int[] parent,int[] child){
         for(int i=0;i<26;i++){
             if(parent[i]<child[i]) return false;
         }
         return true;
     }
    
	public static Map<String, Integer> shortAns(String[] words2) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<words2.length;i++) {
			for(int j=0;j<words2[i].length();j++) {
				String word = words2[i];
				char check = word.charAt(j);
				long count = word.chars().filter(ch -> ch == check).count();
				map.put(String.valueOf(check), Math.max(map.getOrDefault(String.valueOf(check), 0), (int)count));
			}		
		}
		return map;
	}
    
  
	public static boolean isSubsequence(String s, String t) {
		int i = 0;
		while (i < s.length()) {
            int index = t.indexOf(s.charAt(i));
			if (t.indexOf(s.charAt(i)) == -1) {
				return false;
			} else{
				t = t.substring(0, index) + t.substring(index+1);
				i++;
			}
		}
		return true;
	}

}
