package programmers.practiceQuiz;

import java.util.HashMap;

/**
 * 
 * 스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.
예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 
다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.

종류	이름
얼굴	동그란 안경, 검정 선글라스
상의	파란색 티셔츠
하의	청바지
겉옷	긴 코트
스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.
 *
 */
public class 위장 {
	
	public static int solution(String[][] clothes) {
        int answer = 1;	
        
        // 의상 종류와 수량을 담는 해시맵 (키 : 종류, 값: 수량)
        HashMap<String, Integer> hs = new HashMap<String, Integer>();
        
        // 각각의 해시맵에 값을 넣으면서 개수 누적(기본값을 1로한 이유는, 아무것도 선택안하는 것 까지 경우의 수라고 설정)
        for(int i=0; i<clothes.length; i++)  {
        	hs.put(clothes[i][1], hs.getOrDefault(clothes[i][1], 1)+1);
        }
        System.out.println(hs);
        
        // 경우의 수 * 경우의 수 = 모든 경우의 수
        for(String key : hs.keySet()) {
        	answer *= hs.get(key);
        }
        answer--;		// 아무것도 안입는 경우는 없으므로 -1
        return answer;
    }
	
	public static void main(String[] args) {
		String[][] clothes = {
   								 {"green_turban", "headgear"},
								 {"yellow_hat", "headgear"},
								 {"blue_sunglasses", "dd"}
							 };
		solution(clothes);
	}

}
