package programmers.practiceQuiz;

import java.util.Stack;

public class 다트게임 {

	public static int solution(String dartResult) {
        int answer = 0;
        Stack<String> st = new Stack<String>();
        
        // stack에 점수, 보너스, 옵션별로 담기
        for(int i=dartResult.length()-1; i>=0; i--) {
        	String s = String.valueOf(dartResult.charAt(i));
        	if(i > 0 && dartResult.charAt(i) == '0' && dartResult.charAt(i-1) == '1') {
        		i--;
        		st.add("10");
        	} else {
        		st.add(s);
        	}
        }
        
        // 3라운드 score를 담을 배열
        int[] arr = new int[3];
        
        // 라운드별 점수 계산
        for(int i=0; i<3; i++) {
        	int score = 0;
        	int a = Integer.parseInt(st.pop());
        	String b = st.pop();
        	
        	if("D".equals(b)) score = (int) Math.pow(a, 2);
        	else if("T".equals(b)) score = (int) Math.pow(a, 3);
        	else score = a;
        	
        	if(st.size() > 0) {
        		if("*".equals(st.peek())) {
    				st.pop();
    				if(i == 0) {
    					score *= 2;
    				} else {
    					arr[i-1] *= 2;
    					score *= 2;
    				}
    			} else if("#".equals(st.peek())) {
    				st.pop();
    				score *= -1;
    			}
        	}
        	
        	arr[i] = score;
        }
        
        // 최종 점수
        for(int score : arr) {
        	answer += score;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String dartResult = "1D2S#10S";
		solution(dartResult);
	}

}
