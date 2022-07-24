package leetCodeSolution;

import java.util.ArrayList;

public class CheckNumbersAreAscendingSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a puppy has 20 eyes and 14 legs";
		System.out.println(areNumbersAscending(s));
	}

	public static boolean areNumbersAscending(String s) {

		s = s.replaceAll("[^\\d.-]", " ");
		s = s + " ";
		int index = 0;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int temp = 0;
		while (index < s.length()) {
			int digit = s.charAt(index) - '0';
			if (digit < 0 || digit > 9) {
				if (temp != 0) {
					nums.add(temp);
				}
				temp = 0;
			} else {
				temp = temp * 10 + digit;
			}
			index++;
		}
		for (int i = 1; i < nums.size(); i++) {
			if (nums.get(i) <= nums.get(i - 1)) {
				return false;
			}
		}
		return true;
	}

}
