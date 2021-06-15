package leetCode.easy;

/**
 * https://leetcode.com/problems/merge-strings-alternately/
 */
public class _1768_Merge_Strings_Alternately {
	
	// StringBuilder 메서드 활용(큐 처럼)
	public static String mergeAlternately(String word1, String word2) {
		StringBuilder result = new StringBuilder();
		StringBuilder word1_sb = new StringBuilder(word1);
		StringBuilder word2_sb = new StringBuilder(word2);
		
		int cnt = Math.min(word1_sb.length(), word2_sb.length());
		
		for(int i=0; i<cnt; i++) {
			result.append(word1_sb.charAt(0));
			result.append(word2_sb.charAt(0));
			word1_sb = word1_sb.deleteCharAt(0);
			word2_sb = word2_sb.deleteCharAt(0);
		}
		
		if(word1_sb.length() > 0) {
			result.append(word1_sb);
		} else if (word2_sb.length() > 0) {
			result.append(word2_sb);
		}
		
		return result.toString();
	}
	
	// 승현이 유사 코드
	public static String mergeAlternately_2(String w1, String w2) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < w1.length() || i < w2.length(); ++i) {
            if (i < w1.length())
                res.append(w1.charAt(i));
            if (i < w2.length())
                res.append(w2.charAt(i));
        }
        return res.toString();
    }
	
	// 인규 방법 : 길이 가지고 놀기
	public String mergeAlternately_3(String word1, String word2) {
        String longerStr = word1.length() > word2.length() ? word1 :word2;
        String shortStr = longerStr == word1 ? word2 : word1;
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < shortStr.length(); i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if (longerStr.length() == shortStr.length()) {
            return sb.toString();
        } else {
            sb.append(longerStr.substring(shortStr.length()));
        }

        return sb.toString();
    }
	
	public static void main(String[] args) {
		String word1 = "ab";
		String word2 = "pqrs";
		System.out.println(mergeAlternately(word1, word2));
	}

}
