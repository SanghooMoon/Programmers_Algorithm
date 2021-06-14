package leetCode.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
 */
public class _1897_Redistribute_Characters_to_Make_All_Strings_Equal {

	// 각 문자의 갯수와 배열의 수가 나누어 떨어져야함
	public static boolean makeEqual(String[] words) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(String word : words) {
			sb.append(word);
		}
		if(sb.length() % words.length != 0) return false;
		
		for(int i=0; i<sb.length(); i++) {
			map.put(sb.charAt(i), map.getOrDefault(sb.charAt(i), 0)+1);
		}
		
		for(int val : map.values()) {
			if(val % words.length != 0) return false;
		}
		
		return true;
    }
	
	// 리팩토링 해봤지만.. 성능상 크게 차이는 없음..ㅠ_ㅠ
	public static boolean makeEqual_2(String[] words) { 
		StringBuilder sb = new StringBuilder();

        for (String str : words) {
            sb.append(str);
        }

        if (sb.length() % words.length != 0) {
            return false;
        }

        String str = new String(sb);
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        for (int startIndex = 0; startIndex < charArray.length; startIndex += words.length) {
            if (charArray[startIndex] != charArray[startIndex + words.length-1]) {
                return false;
            }
        }

        return true;
	}
	
	// 원초적인 답이지만 가장 효율이 좋았다..
	public static boolean makeEqual_3(String[] words) {
        int[] c = new int[26];
        for (String word: words) {
            for (char ch: word.toCharArray()) {
                c[ch - 'a']++;
            }
        }
        for (int frequency: c) {
            if (frequency % words.length != 0)
                return false;
        }
        return true;
    }
		
	public static void main(String[] args) {
		String[] words  = {"abc","aabcc","bc"};
		System.out.println(makeEqual(words));
	}

}
