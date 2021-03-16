package programmers.practiceQuiz;

import java.util.Arrays;
import java.util.HashMap;

public class 실패율 {

	public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
		
		HashMap<Integer, Float> hs = new HashMap<>();
		// hash 기본 값 세팅
		for(int i=1; i<=N; i++) {
			hs.put(i, 0.0f);
		}
		
		// stage 인원당 +1
		for(int i : stages) {
			if(i == N+1) continue;
			hs.put(i, hs.get(i)+1);
		}
		
		// 스테이지인원/전체인원 계산, 0.0f / 0 = NaN 이므로 0.0 처리
		int cnt = stages.length;
		for(int i=1; i<=hs.size() ; i++) {
            if(hs.get(i) == 0.0) {
                hs.put(i, 0.0f);
                cnt -= hs.get(i);
                continue;
            }
			Float temp = hs.get(i);
			hs.put(i, hs.get(i)/cnt);
			cnt -= temp;
		}
		
		// 순차적으로 실패율 높은 stage, answer에 삽입
		for(int i=1; i<=hs.size(); i++) {
			float max = -0.1f;
			int stage = 0;
			for(int j=1; j<=hs.size(); j++) {
				if(max < hs.get(j)) {
					max = hs.get(j);
					stage = j;
				}
			}
			hs.put(stage, -99.99f);
			answer[i-1] = stage;
		}
		
		System.out.println(Arrays.toString(answer));
		return answer;
    }
	
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2,1,2,4,2,4,3,3};
		solution(N, stages);
	}

}
