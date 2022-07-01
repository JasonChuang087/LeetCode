package leetCodeSolution;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		String check = strs[0];
		String max_string = "";
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() < min) {
				min = strs[i].length();
			}
		}
		for (int i = 0; i <= min; i++) {
			int index = i;
			boolean contains = Arrays.stream(strs)
					.allMatch(str -> str.substring(0, index).equals(check.substring(0, index)));
			if (contains) {
				max_string = check.substring(0, index);
			}
		}
		return max_string;
	}

}
