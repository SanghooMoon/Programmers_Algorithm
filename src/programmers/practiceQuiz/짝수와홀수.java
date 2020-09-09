package programmers.practiceQuiz;

/**
 * 정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
 */
public class 짝수와홀수 {

	public static String solution(int num) {
        String answer = "";
        
        answer = num%2==0 ? "Even" : "Odd";
        
        System.out.println(answer);
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution(9);
	}

}
