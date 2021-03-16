package programmers.practiceQuiz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class 실패율_두번째 {

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
			Float numOfStage = hs.get(i);	// 해당 스테이지 인원
			
            if(hs.get(i) == 0.0) {
                hs.put(i, 0.0f);
            } else {
            	hs.put(i, hs.get(i)/cnt);
            }
			cnt -= numOfStage;
		}
		
		// 순차적으로 실패율 높은 stage, answer에 삽입
		int index = 0;
		while(hs.size() > 0) {
			answer[index] = findMaxStage(hs);
			index++;
		}
		
		System.out.println(Arrays.toString(answer));
		return answer;
    }
	
	public static int findMaxStage(HashMap<Integer, Float> map) {
		Iterator<Float> it = map.values().iterator();
		float max = 0;
		
		// 최대값 구하기
		while(it.hasNext()) {
			float currVal = it.next();
			if(max < currVal) {
				max = currVal;
			}
		}
		
		// 최대값을 가지고 stage 구하기
		for(int key : map.keySet()) {
			if(map.get(key) == max) {
				map.remove(key);
				return key;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2,1,2,4,2,4,3,3};
		solution(N, stages);
	}

}
