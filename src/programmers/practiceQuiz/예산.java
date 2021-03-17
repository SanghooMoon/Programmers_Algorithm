package programmers.practiceQuiz;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 */
public class 예산 {
	
	public static int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        answer = findMaxCase(d, budget);
//        answer = findMaxCase2(d, budget);
        return answer;
    }
    
	
    public static int findMaxCase(int[] d, int budget) {
        for(int i=d.length-1; i>=0 ; i--) {
            int sum = 0;
            for(int j=0; j<=i; j++) {
                sum += d[j];
            }
            if(sum <= budget) return ++i;
        }
        return 0;   // 하나라도 못하면 0
    }
    
    public static int findMaxCase2(int[] d, int budget) {
        int sum = 0;
        int answer = 0;
        
        for(int i=0; i<d.length; i++) {
            sum += d[i];
            if(sum <= budget) {
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		solution(d, budget);
	}

}
