package programmers.practiceQuiz;

import java.util.Arrays;

/**
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *
 */
public class 정수내림차순으로배치하기 {

	public static long solution(long n) {
		long answer = 0;
		
		int len = Long.toString(n).length();
		long [] arr = new long[len];
		
		for(int i=len-1; i>=0; i--) {
			arr[i] = (int)(n%10);
			n = n/10;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					long temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				arr[i] *= 10;
			}
			answer += arr[i];
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		solution(118372L);
	}

}
