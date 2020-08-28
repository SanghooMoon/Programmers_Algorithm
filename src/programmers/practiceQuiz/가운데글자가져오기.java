package programmers.practiceQuiz;

/**
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 */
public class 가운데글자가져오기 {

	public static String solution(String s) {
		String answer = "";
		int len = s.length();
		int mid = len/2;
		
//		if (len % 2 == 0) {
//			answer = s.substring(mid-1,mid+1);
//		} else {
//			answer = s.substring(mid, mid+1);
//		}
		
		answer = len%2==0 ? s.substring(mid-1,mid+1) : s.substring(mid, mid+1);
		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		solution("abcde");
		solution("qwer");
		solution("qqwerr");
		solution("qwererrr");
	}

}
