package programmers.practiceQuiz;


/**
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 * A-Z 65~90
 * a-z 97~122
 */
public class 문자열내림차순으로배치하기 {

	public static String solution(String s) {
        String answer = "";
        
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++) {
        	if(c[i] >= 'a' && c[i] <= 'z') {
        		for(int j=0; j<c.length; j++) {
        			if(c[i] > c[j]) {
        				char temp = c[i];
        				c[i] = c[j];
        				c[j] = temp;
        			}
        		}
        	} else {
        		for(int j=0; j<c.length; j++) {
        			if(c[i] > c[j]) {
        				char temp = c[i];
        				c[i] = c[j];
        				c[j] = temp;
        			}
        		}
        	}
        }
        answer = String.valueOf(c);
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		solution("Zbcdefg");		// gfedcbZ
	}

}
