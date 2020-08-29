package programmers.practiceQuiz;

import java.util.Arrays;

/**
 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
 * 예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를
 * 정렬합니다.
 */
public class 문자열내맘대로정렬하기 {

	public static String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		/*
		char[] charArr = new char[strings.length];
		
		for(int i=0; i<strings.length; i++) {
			charArr[i] = strings[i].charAt(n);
		}
		
		for(int i=0; i<strings.length; i++) {
			for(int j=i+1; j<strings.length; j++) {
				if(charArr[i] > charArr[j]) {
					char temp = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = temp;
					
					String s = strings[i];
					strings[i] = strings[j];
					strings[j] = s;
					
				} else if (charArr[i] == charArr[j]) {
					if(strings[i].charAt(n-1) > strings[j].charAt(n-1)) {
						String s = strings[i];
						strings[i] = strings[j];
						strings[j] = s;
					} else if(strings[i].charAt(n+1) > strings[j].charAt(n+1)) {
						String s = strings[i];
						strings[i] = strings[j];
						strings[j] = s;
					}
				}
			}
		}
		*/
		
		for(int i=0; i<strings.length; i++) {
			strings[i] = strings[i].charAt(n) + strings[i];
		}
		System.out.println(Arrays.toString(strings));
			
//		System.out.println(Arrays.toString(strings));
		System.out.println(Arrays.toString(answer));
		
		return answer;
	}

	public static void main(String[] args) {
//		String[] strings = {"aaa", "ddd", "eee", "bbb", "ccz", "ccc"};
		String[] strings = { "abcez", "abcea", "cdx" };
		solution(strings, 1);
	}

}
