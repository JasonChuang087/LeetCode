package leetCodeSolution;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LongestPalindromeConcatenatingTwoLetterWords {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                String[] words = {"ab","ty","yt","lc","cl","ab","cc","cc"};
                longestPalindrome(words);
        }
        public static int longestPalindrome(String[] words) {
                Map<String,Integer> map = new HashMap<String,Integer>();
                Map<String,Integer> pmap = new HashMap<String,Integer>();
                for(int i=0;i<words.length;i++) {
                        // 儲存重複單字 ex:"aa"
                        if(words[i].charAt(0)==words[i].charAt(1)) {
                                pmap.put(words[i], pmap.getOrDefault(words[i], 0)+1);
                        }
                        // 儲存不重複單字 ex:"ab"
                        else map.put(words[i], map.getOrDefault(words[i], 0)+1);
                }
                System.out.println(map);
                System.out.println(pmap);
                int count = 0;
                for(Entry<String, Integer> i:map.entrySet()) {
                        String pal = ""+i.getKey().charAt(1)+i.getKey().charAt(0);
                        System.out.println(pal);
                        //不重複單字 若能在dict找到palindrome 則取出兩者較小值 ex:"ab":2 "ba":3 -->取2
                        if(map.get(pal)!=null&&!i.getKey().equals(pal)) {
                                count+=4*Math.min(i.getValue(), map.get(pal));
                                map.put(pal, null);
                                map.put(i.getKey(), null);
                        }
                        else {
                                map.put(i.getKey(), null);
                        }
                }
                int same = 0;
                //重複單字 若次數為偶數次則可以回文 
                for(Entry<String, Integer> i:pmap.entrySet()) {
                      int c = i.getValue()/2;
                      same += c;
                      pmap.put(i.getKey(), i.getValue()-2*c);                         
                }
                count += same*4;
                //重複單字 若次數為單數次則只能放在中心才可回文 ex:bbcca|accbb
                if(pmap.containsValue(1)) {
                        count += 2;
                }
                
                System.out.println(count);
                return count;
        }
}
