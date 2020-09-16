package kakao.codingTest;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/67256
 */
public class 카카오인턴_키패드누르기 {
	
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        
        int[] position = {4, 4};
        for(int i=0; i<numbers.length; i++) {
        	
        	if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
        		answer += "L";
        		if(numbers[i] == 1) position[0] = 1;
        		if(numbers[i] == 4) position[0] = 2;
        		if(numbers[i] == 7) position[0] = 3;
        	} else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
        		answer += "R";
        		if(numbers[i] == 3) position[0] = 1;
        		if(numbers[i] == 6) position[0] = 2;
        		if(numbers[i] == 9) position[0] = 3;
        	} else {
        	}
        	
        }
        System.out.println(Arrays.toString(position));
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//		int[] numbers = {4,9,1,3};
		String hand = "right";
		solution(numbers, hand);
	}

}
