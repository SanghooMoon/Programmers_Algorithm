package programmers.codingTest;

/**
 * 자연수 n이 매개변수로 주어집니다. 
 * n을 3진법 상에서 앞뒤로 뒤집은 후, 
 * 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class 월간코딩테스트_10월_1번 {
	
	public static int solution(int n) {
        int answer = 0;
        
        String num = "";
        // 최종적으론 반전을 해야하니 첫 연산 나머지부터 누적
        // 3진법 반전
        
        
        while(n>0) {
        	if(n == 1 || n == 2) return n;
        	if(n/3 < 3) {
        		num += String.valueOf(n%3);
        		num += String.valueOf(n/3);
        		break;
        	} else {
        		if(n%3 == 0) num += String.valueOf(0);
            	else		 num += String.valueOf(n%3);
        	}
        	n = n/3;
        }
        System.out.println(num);
        
        // 10진수로 변환
        for(int i=0; i<num.length(); i++) {
        	
        	int pow = (int)Math.pow(3, i);	// 3의 제곱
        	int charAt = (num.charAt(num.length() - i - 1) - '0');	// 각 자리수의 정수
        	
        	answer += pow * charAt;
        	
        	System.out.println("answer = " + answer);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution(1);
	}

}
