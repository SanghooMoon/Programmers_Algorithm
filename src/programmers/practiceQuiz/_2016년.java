package programmers.practiceQuiz;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 
 * 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨
 * 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각
 * SUN,MON,TUE,WED,THU,FRI,SAT입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를
 * 반환하세요.
 *
 */
public class _2016년 {

	public static String solution(int month, int day) {
		String answer = "";
		
//		DayOfWeek day = LocalDate.of(2016, a, b).getDayOfWeek();
//		answer = day.toString().substring(0,3);
		
		String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int allDay = 0;
		
		for(int i=0; i<month-1; i++) {
			allDay += months[i];
		}
		allDay += day-1;
		answer = days[allDay%7];
		System.out.println(days[allDay%7]);

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(1, 1);
	}

}
