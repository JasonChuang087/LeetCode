package leetCodeSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagrams {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                String[] strs = {"eat","tea","tan","ate","nat","bat"};
                groupAnagrams(strs);
        }
        
        public static List<List<String>> groupAnagrams(String[] strs) {          
                Map<String,List<String>> map = new HashMap<String,List<String>>();
                List<List<String>> result = new ArrayList<List<String>>();
                for(String str:strs) {
                        char[] c = str.toCharArray();
                        Arrays.sort(c);
                        String s = String.valueOf(c);

                        if(map.get(s)!=null) {
                                List<String> temp = map.get(s);
                                temp.add(str);
                                map.put(s, temp);
                        }
                        else {
                                List<String> temp = new ArrayList<String>();
                                temp.add(str);
                                map.put(s, temp);                            
                        }
                        
                        
                }
                
                for (Entry<String, List<String>> entry : map.entrySet()) {
                        result.add(entry.getValue());
                        System.out.println("Key = " + entry.getKey() +
                                        ", Value = " + entry.getValue());        
                }

                System.out.println(map.values());
                
                return result;         
        }

}
