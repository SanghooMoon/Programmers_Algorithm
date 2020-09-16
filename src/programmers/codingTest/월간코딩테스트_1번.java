package programmers.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 정수 배열 numbers가 주어집니다. 
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 
 * solution 함수를 완성해주세요.
 */
public class 월간코딩테스트_1번 {

	public static int[] solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length-1; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		int sum = numbers[i]+numbers[j];
        		if(!list.contains(sum)) {
        			list.add(sum);
        		}
        	}
        }
        Collections.sort(list);
        
        for(int i=0; i<list.size();i++) {
        	System.out.println(list.get(i));
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
	
	
	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		solution(numbers);
	}

}
