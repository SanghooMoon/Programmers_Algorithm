package programmers.practiceQuiz;

import java.util.Arrays;

/**
 * String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수,
 * solution을 완성하세요. seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
 *
 */
public class 서울에서김서방찾기 {

	public static String solution(String[] seoul) {
		String answer = "";
		
//		for(int i=0; i<seoul.length; i++) {
//			if(seoul[i].equals("Kim"))
//				answer = "김서방은 " + i + "에 있다";
//		}
		
//		Arrays.asList(seoul).indexOf("Kim");
		
		answer = "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] seoul = {"Jane","Kim"};
		solution(seoul);
	}

}
