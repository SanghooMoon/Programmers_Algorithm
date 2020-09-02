package programmers.practiceQuiz;

import java.util.Arrays;

/**
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */
public class 자연수뒤집어배열로만들기 {

	public static int[] solution(long n) {
		int len = String.valueOf(n).length();
		int[] answer = new int[len];

		int i = 0;
		while (n > 0) {
			answer[i] = (int) (n % 10);
			n = n / 10;
			i++;
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {
		solution(12345L);
	}

}
