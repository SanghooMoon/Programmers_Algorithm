package programmers.practiceQuiz;

/**
 * 
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 AB는 1만큼 밀면
 * BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는
 * 함수, solution을 완성해 보세요.
 * 공백  32
 * A-Z 65~90
 * a-z 97~122
 */
public class 시저암호 {

	public static String solution(String s, int n) {
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);

			if(ch == ' ') {
				answer += ch;
				continue;
			}
			// 소문자
			if((ch+n >= 'a' && ch+n > 'z')) {
//				ch = (char) (ch+n-26);
				ch = (char) (((ch+n)-123)%26+97);
				answer += ch;
			// 대문자
			} else if ( ch >= 'A' && ch <= 'Z' && ch+n > 'Z') {
//				ch = (char) (ch+n-26);
				ch = (char) (((ch+n)-91)%26+65);
				answer += ch;
			} else {
				ch = (char) (ch+n);
				answer += ch;
			}

		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		solution("z Z c", 3);
	}

}
