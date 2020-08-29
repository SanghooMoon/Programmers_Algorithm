package programmers.practiceQuiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        
        
       
        List<String> list = new ArrayList<String>(Arrays.asList(completion));
        
        // 참가자들
        for(int i=0; i<participant.length; i++) {
        	// 완주자명단에 해당 사람이 있으면 해당 명단 삭제
        	if(list.contains(participant[i])) {
        		list.remove(participant[i]);
        	} else {	// 없으면 완주실패
        		answer = participant[i];
        	}
        }
       
        System.out.println(answer);
        
        return answer;
    }
	
	public static void main(String[] args) {
//		String[] participant = {"leo", "kiki", "eden"};
//		String[] completion = {"kiki","leo", "eden"};
		String[] participant = {"mislav", "stanko", "mislav", "ana", "ana"};
		String[] completion = {"stanko", "ana", "mislav","mislav"};
		solution(participant, completion);
	}

}
