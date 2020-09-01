package programmers.practiceQuiz;

/**
 * 길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
 * 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
 */
public class 수박수박수박수박수박수 {

	public static String solution(int n) {
        String answer = "";
        for(int i=0; i<n; i++) {
        	
//        	if(i%2==0) answer += "수";
//        	else answer += "박";
        	   
        	answer += (i%2==0) ? "수" : "박";
        }
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		solution(6);
	}

}
