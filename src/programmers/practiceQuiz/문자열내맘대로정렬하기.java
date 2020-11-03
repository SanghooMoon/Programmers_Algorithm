package programmers.practiceQuiz;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
 * 예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를
 * 정렬합니다.
 */
public class 문자열내맘대로정렬하기 {

	public static String[] solution(String[] strings, int n) {
		/*
		String[] answer = new String[strings.length];

		// n번째 문자를 문자열 선두로 추가하여 재저장
		for(int i=0; i< strings.length; i++){
			strings[i] = strings[i].charAt(n) + strings[i];
		}
		// 정렬
		Arrays.sort(strings);

		// 결과 저장
		for(int i=0; i< answer.length; i++){
			answer[i] = strings[i].substring(1);
		}

		return answer;
		*/

		// 두번째 풀이
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				char c1 = o1.charAt(n);        // 비교할 문자를 기준점으로 잡음.
				char c2 = o2.charAt(n);        // 비교할 문자를 기준점으로 잡음.
				if (c1 == c2) {        		   // 같다면 사전순으로 정렬
					return o1.compareTo(o2);
				} else {
					return c1 - c2;
				}
			}
		});

		System.out.println(Arrays.toString(strings));
		return strings;
	}

	public static void main(String[] args) {
		String[] strings = {"aaa", "ddd", "eee", "bbb", "ccz", "ccc"};
//		String[] strings = { "abcez", "abcea", "cdx" };
		solution(strings, 1);
	}

}
