package programmers.practiceQuiz;

import java.util.ArrayList;

/**
 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
 * (1은 소수가 아닙니다.)
 *
 */
public class 소수찾기 {
	
	public static int solution(int n) {
        int answer = 0;
		
        /*
		int answer = n - 1;
		for (int i = 3; i <= n; i++) {
			for (int j = i - 1; j > 1; j--) {
				if (i % j == 0) {
					answer--;
					break;
				}
			}
		}
		*/
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        
        for(int i=2; i<=n; i++) {
        	for(int j=0; j<list.size(); j++) {
        		if(i%list.get(j) == 0 ) break;
        		if(j+1 == list.size()) {
        			list.add(i);
        		}
        	}
        }
        answer = list.size();
        
        
//        for(int i=2; i<=n; i++) {
//        	int cnt = 0;
//        	 for(int j=2; j<i; j++) {
//        		 if(i%j==0) {
//        			 cnt++;
//        			 break;
//        		 }
//        	 }
//        	 if(cnt==0) {
//        		 answer++;
//        	 }
//        }
        
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		solution(16);		
	}

}
