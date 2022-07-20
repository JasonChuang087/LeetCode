package leetCodeSolution;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		/*
		 * Test Case
		 * input	output
		 * "aacabdkacaa" "aca"
		 * */
		String s = "azwdzwmwcqzgcobeeiphemqbjtxzwkhiqpbrprocbppbxrnsxnwgikiaqutwpftbiinlnpyqstkiqzbggcsdzzjbrkfmhgtnbujzszxsycmvipjtktpebaafycngqasbbhxaeawwmkjcziybxowkaibqnndcjbsoehtamhspnidjylyisiaewmypfyiqtwlmejkpzlieolfdjnxntonnzfgcqlcfpoxcwqctalwrgwhvqvtrpwemxhirpgizjffqgntsmvzldpjfijdncexbwtxnmbnoykxshkqbounzrewkpqjxocvaufnhunsmsazgibxedtopnccriwcfzeomsrrangufkjfzipkmwfbmkarnyyrgdsooosgqlkzvorrrsaveuoxjeajvbdpgxlcrtqomliphnlehgrzgwujogxteyulphhuhwyoyvcxqatfkboahfqhjgujcaapoyqtsdqfwnijlkknuralezqmcryvkankszmzpgqutojoyzsnyfwsyeqqzrlhzbc";
		System.out.println(longestPalindrome(s));
	}
	
    public static String longestPalindrome(String s) {       
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int left = i;
            int right = i;

            while (left >= 0 && s.charAt(left) == c) {
                left--;
            }

            while (right < s.length() && s.charAt(right) == c) {
                right++;
            }

            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) != s.charAt(right)) {
                    break;
                }
                left--;
                right++;
            }
            left = left + 1;
            if (end - start < right - left) {
                start = left;
                end = right;
            }
        }
        return s.substring(start, end);
    }
    
    public static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    
    public static int longestCommonString(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] LCS = new int[len1][len2];
    	int max = 0;
        for(int i=0;i<len1;i++) {
        	for(int j=0;j<len2;j++) {
        		if(text1.charAt(i)==text2.charAt(j)) {
        			if(i==0||j==0) {
        				LCS[i][j] = 1;
        			}
        			else {
        				LCS[i][j] = LCS[i-1][j-1] + 1;
        			}
        			
        			if(LCS[i][j]>max) {
        				max = LCS[i][j];
        			}
        			
        		}
        	}
        }
        return max;
    }

}
