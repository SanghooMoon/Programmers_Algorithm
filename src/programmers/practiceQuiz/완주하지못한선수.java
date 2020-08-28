package programmers.practiceQuiz;

import java.util.Arrays;

/**
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 
 * 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 * 
 */
public class 완주하지못한선수 {
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 참가자들
        for(int i=0; i<participant.length; i++) {
        	int count = 0;
        	// 완주자들
        	for (int j=0; j<completion.length; j++) {
        		// 참가자중에 완주자명단에 이름이 있다면
				if(participant[i].equals(completion[j])) {
					completion[j] = "";	// 동명이인 2명이상이 있을 수 있으므로, 해당 완주자명 삭제
					count++;
				}
			}
        	if(count==0) answer=participant[i];
        }
    	System.out.println(answer);
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"kiki", "eden"};
//		String[] participant = {"mislav", "stanko", "mislav", "ana"};
//		String[] completion = {"stanko", "ana", "mislav"};
		solution(participant, completion);
	}

}
