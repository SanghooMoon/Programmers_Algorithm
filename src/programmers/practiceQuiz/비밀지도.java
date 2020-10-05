package programmers.practiceQuiz;

import java.util.Arrays;

public class 비밀지도 {

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for (int i = 0; i < arr1.length; i++) {
			// 각 배열의 원소를 2진수로 변환
			String arr1Str = Integer.toBinaryString(arr1[i]);
			String arr2Str = Integer.toBinaryString(arr2[i]);

			// 자리수가 안맞다면 앞에 0을 추가
			if (arr1Str.length() != n) {
				for (int j = arr1Str.length(); j < n; j++) {
					arr1Str = "0" + arr1Str;
				}
			}
			if (arr2Str.length() != n) {
				for (int j = arr2Str.length(); j < n; j++) {
					arr2Str = "0" + arr2Str;
				}
			}
			System.out.println(arr1Str);
			System.out.println(arr2Str);

			// 결과 배열에 담기위한 문자열
			String answerStr = "";

			// 지도 모두 0이라면 공백을, 아니면(1개라도 1이라면) #을 추가
			for (int j = 0; j < arr1.length; j++) {
				if (arr1Str.charAt(j) == '0' && arr2Str.charAt(j) == '0') {
					answerStr += " ";
				} else {
					answerStr += "#";
				}
			}

			System.out.println(answerStr);
			System.out.println();

			// 결과배열에 저장
			answer[i] = answerStr;
		}

		System.out.println(Arrays.toString(answer));

		return answer;

	}

	public static void main(String[] args) {
 		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		solution(n, arr1, arr2);

	}

}