package programmers.practiceQuiz;

import java.util.Arrays;

/**
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 */
public class 나누어떨어지는숫자배열 {

	public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] % divisor == 0)
        		count++;
        }
        
        if(count==0) {
        	answer = new int[]{-1};
        } else {
        	answer = new int[count];
        	int index = 0;
            for(int i=0; i<arr.length; i++) {
            	if(arr[i] % divisor == 0) {
            		answer[index++] = arr[i];
            	}
            }
            Arrays.sort(answer);
        }
        
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
	
	public static void main(String[] args) {
//		int arr[] = {5, 9, 7, 10};
		int arr[] = {3, 2, 6};
		solution(arr, 10);
	}

}
