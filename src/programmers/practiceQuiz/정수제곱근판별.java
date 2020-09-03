package programmers.practiceQuiz;

/**
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 */
public class 정수제곱근판별 {
	
	public static long solution(long n) {
		long answer = 0;
		
		
		if(Math.sqrt(n)%1.0 > 0.0) {
			answer = -1;
		} else {
			long x = (long) Math.sqrt(n);
			x++;
			answer = (long) Math.pow(x, 2);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		solution(3L);
	}

}
