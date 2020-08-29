package programmers.practiceQuiz;

import java.util.*;

public class 같은숫자는싫어 {

	public static int[] solution(int[] arr) {
		int[] answer = new int[arr.length];
		int index = 0;
		
		answer[0] = arr[0];
		// 0 ~ length-1
		for(int i=1; i<arr.length; i++) {
			if(answer[index]==arr[i]) {
				continue;
			} else {
				answer[++index] = arr[i]; 
			}
		}
		for(int a : answer) {
			System.out.println(a);
		}

		return answer;
	}

	public static void main(String[] args) {
//		int[] arr = {1,1,3,3,0,1,1};
		int[] arr = {4,4,4,3,3};
		solution(arr);
	}
}
