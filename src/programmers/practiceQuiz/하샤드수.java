package programmers.practiceQuiz;

/**
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 * x는 1 이상, 10000 이하인 정수입니다
 */
public class 하샤드수 {
	
	public static boolean solution(int x) {
        boolean answer = true;
        
        // 정수형 길이를 위해 문자열로 변환
//        String s = String.valueOf(x);
        int sum = 0;	// 자릿수 합계
        int n = x;		// 연산을 위한 변수
        
        // 문자열의 길이만큼 반복
//        for(int i=0; i<s.length(); i++) {
//        	sum += n % 10;
//        	n = n / 10;
//        	System.out.println("sum : " + sum);
//        	System.out.println("n : " + n);
//        }
        while(n>0) {
        	sum += n % 10;
        	n = n / 10;
        }
        
        // 나누어 떨어지지 않으면 false
        if(x%sum >= 0)
        	answer = false;
        
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		solution(13);
	}

}
