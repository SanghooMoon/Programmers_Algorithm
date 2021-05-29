package programmers.practiceQuiz;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/77484
 */
public class 로또의최고순위와최저순위 {
	
	public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        
        int count = 0;
        int zeroCnt = 0;
        
        for(int lotto : lottos) {
        	if(lotto == 0) {
        		count++; zeroCnt++;
        		continue;
        	}
        	for(int win_num : win_nums) {
        		if(lotto == win_num) {
        			count++;
        		}
        	}
        }
        
        answer[0] = rank[count];
        answer[1] = rank[count-zeroCnt];
        
        return answer;
    }
	
	public static void main(String[] args) {
//		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		
		System.out.println(Arrays.toString(solution(lottos, win_nums)));
	}

}
