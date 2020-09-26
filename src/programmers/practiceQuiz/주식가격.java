package programmers.practiceQuiz;

import java.util.Arrays;

/**
 * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 
 * 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
 */
public class 주식가격 {
	
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        // 모든 경우의수 탐색 2중 for문
        for(int i=0; i<prices.length-1; i++) {
        	for(int j=i+1; j<prices.length; j++) {	
        		if(prices[i] <= prices[j]) {
        			answer[i]++;	// 비교 주체 금액보다 같거나 인상되었을때만 ++
        		} else {
        			answer[i]++;	// 가격이 내려갔다면 1초동안 유지한것이니 ++ 후 안쪽 반복문 break;
        			break;
        		}
        	}
        }
        System.out.println(Arrays.toString(answer));
        return answer;
        
        /* 다른사람 풀이
        Stack<Integer> beginIdxs = new Stack<>();
        int i=0;
        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }
        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }

        return terms;
         */
    }
	
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		solution(prices);
	}

}
