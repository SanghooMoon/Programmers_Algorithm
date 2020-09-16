package kakao.codingTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
 *
 */
public class 카카오예선테스트_1번 {

	public static String solution(String new_id) {
        String answer = "";
        
    	// 1. new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        answer = new_id.toLowerCase();
        System.out.println("1 : " + answer);
        
        // 2. new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        answer = answer.replaceAll("[^a-z0-9\\-\\_\\.]", "");
        System.out.println("2 : " + answer);
        
        // 3. new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
//        while(answer.contains("..")) {
//        	answer = answer.replaceAll("\\.\\.", ".");
//        }
        answer = answer.replaceAll("\\.{2,}", ".");
        System.out.println("3 : " + answer);
        
        // 4. new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
//        if(answer.charAt(0) == '.') {
//        	answer = answer.substring(1,answer.length());
//        } else if (answer.charAt(answer.length()-1) == '.') {
//        	answer = answer.substring(0,answer.length()-1);
//        }
        answer = answer.replaceAll("^[\\.]", "");
        answer = answer.replaceAll("[\\.]$", "");
        System.out.println("4 : " + answer);
        
        // 5. new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if(answer.isEmpty()) {
        	answer = "a";
        }
        System.out.println("5 : " + answer);
        
        // 6.new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if(answer.length() >= 16) {
        	answer = answer.substring(0,15);
        	if(answer.charAt(14) == '.') {
        		answer = answer.substring(0,14);
        	}
        }
        System.out.println("6 : " + answer);
        
        // 7. new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(answer.length() <= 2) {
        	String last = answer.substring(answer.length()-1);
        	while(answer.length()<3) {
            	answer = answer + last;
        	}
        }
        System.out.println("7 : " + answer);
        
       
        return answer;
    }
	
	public static void main(String[] args) {
//		String new_id = "...!@BaT#*.y.abcdefghijklm";
//		String new_id = "z-+.^.";
//		String new_id = "=.=";
//		String new_id = "1aA";
		String new_id = "1aA1231";
		solution(new_id);
		
		
		Pattern p = Pattern.compile("^[a-z0-9\\-\\_\\.]{3,15}$");
		Matcher m = p.matcher("a.b");
		System.out.println(m.find());
	}

}
