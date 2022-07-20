package leetCodeSolution;

import java.util.HashMap;
import java.util.Map;

/*
 * solve no.392 Is Subsequence
 * solve no.792 Number of Matching Subsequences
 * */
public class IsSubsequence {
	/*
	 * Test Case input output "ab","baab" true
	 */
	public static void main(String[] args) {
		String s = "ab";
		String t = "baab";
		isSubsequence(s, t);
		String s1 = "dsahjpjauf";
		String[] words = { "ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax", "ja" };
		System.out.println(numMatchingSubseq(s1, words));
	}

	public static int numMatchingSubseq(String s, String[] words) {
		int count = 0;
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		boolean sub = false;
		for (int i = 0; i < words.length; i++) {
			if (map.get(words[i]) != null) {
				if (map.get(words[i]) == true) {
					count++;
				}
				continue;
			}
			sub = isSubsequence(words[i], s);
			if (sub) {
				count++;
			}
			map.put(words[i], sub);
		}

		return count;
	}

	public static boolean isSubsequence(String s, String t) {
		int index = -1;
		int i = 0;
		while (i < s.length()) {
			if (t.indexOf(s.charAt(i)) == -1) {
				return false;
			} else if (t.indexOf(s.charAt(i), index + 1) > index) {
				index = t.indexOf(s.charAt(i), index + 1);
				i++;
			} else {
				return false;
			}
		}
		return true;
	}
}
