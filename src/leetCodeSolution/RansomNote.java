package leetCodeSolution;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String[] args) {
		String ransomNote = "aaabb";
		String magazine = "aaabc";
		canConstruct(ransomNote, magazine);

	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : magazine.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);
		for (Character c : ransomNote.toCharArray()) {
			if (map.get(c) != null && map.get(c) > 0) {
				map.put(c, map.getOrDefault(c, 0) - 1);
			} else {
				return false;
			}

		}
		System.out.println(map);
		return true;
	}

}
