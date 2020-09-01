package programmers.practiceQuiz;

import java.util.Arrays;

/*
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요
 * +-32
 */ 
public class 이상한문자만들기 {

	public static String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("-",-1);	 // -1 : 문자열 뒤에도 나누겠다
        System.out.println(Arrays.toString(arr));
        
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr[i].length(); j++) {
        		if(j%2==0) {
        			answer += Character.toUpperCase(arr[i].charAt(j));
        		} else {
        			answer += Character.toLowerCase(arr[i].charAt(j));
        		}
        	}
        	if(i==arr.length-1) break;
        	answer += "-";
        }
        System.out.println(answer);
        
//        for(int i=0; i<arr.length; i++) {
//        	
//        	char[] cArr = arr[i].toCharArray();
//        	System.out.println(cArr.length);
//        	for(int j=0; j<cArr.length; j++) {
//        		// 짝수 = 대문자
//        		if(j%2==0 && cArr[j] >= 'a' && cArr[j] <= 'z')
//        			cArr[j] = (char)(cArr[j] - 32);
//        		// 홀수 = 소문자
//        		else if (j%2!=0 && cArr[j] >= 'A' && cArr[j] <= 'Z')
//        			cArr[j] = (char)(cArr[j] + 32);
//        		
//        		answer += String.valueOf(cArr[j]);
//        	}
//        	if(i == arr.length-1) break;
//        	answer += " ";
//        }
        return answer;
    }
	
	public static void main(String[] args) {
		String s = "---try--hello-wor--ld--";	// TrY HeLlO WoRlD
		solution(s);
	}

}
