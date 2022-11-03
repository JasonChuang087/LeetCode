package leetCodeSolution;

public class ReverseWordsInAStringIII {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                String s = "Let's take LeetCode contest";
                reverseWords(s);

        }
        
        public static String reverseWords(String s) {
                StringBuilder sb = new StringBuilder(s);
                s = sb.reverse().toString();               
                String[] arr = s.split("\\s");
                String result  = "";
                for(int i=0;i<arr.length;i++) {
                        result = arr[i]+" "+result;
                        System.out.println(result);
                }
                result = result.trim();                
                return result;
        }

}
