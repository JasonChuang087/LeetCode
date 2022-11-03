package leetCodeSolution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MinimumGeneticMutation {

        public static void main(String[] args) {
                String start = "AACCGGTT";
                String end = "AAACGGTA";
                // String[] bank = { "AACCGGTA", "AACCGCTA", "AAACGGTA" };
                String[] bank = {"AACCGATT","AACCGATA","AAACGATA","AAACGGTA"};
                int c = minMutation(start, end, bank);
                System.out.println(c);
        }

        public static int minMutation(String start, String end, String[] bank) {
                int count = 0;
                String check = start;
                ArrayList<String> list = new ArrayList<String>();              
                while(!start.equals(end)) {                  
                        for(int i=0; i<bank.length; i++) {
                                int diff = 0;
                                for(int j=0;j<8;j++) {
                                        if(bank[i].charAt(j)!=start.charAt(j)) {
                                                diff++;
                                        }
                                }                              
                                if(diff==1) {
                                        list.add(bank[i]);
                                }
                        }
                        int index=0;
                        for(int k=0;k<list.size();k++) {
                                start = list.get(k);
                        }
                        System.out.println(list);

                        break;
                }             
                return count;
        }

}
