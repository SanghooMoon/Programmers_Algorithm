package programmers.practiceQuiz;

import java.util.Arrays;
import java.util.LinkedList;

/**
무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.
예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 
구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만 
1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.

구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.
사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때, 
모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.

제한사항
무인도에 갇힌 사람은 1명 이상 50,000명 이하입니다.
각 사람의 몸무게는 40kg 이상 240kg 이하입니다.
구명보트의 무게 제한은 40kg 이상 240kg 이하입니다.
구명보트의 무게 제한은 항상 사람들의 몸무게 중 최댓값보다 크게 주어지므로 사람들을 구출할 수 없는 경우는 없습니다.
 *
 */
public class 구명보트 {

	public static int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int p : people) {
        	linkedList.add(p);
        }
//        Collections.sort(linkedList);
        System.out.println("선 제외 후 정렬: " + linkedList);
        
        // 최소 + 최대값이 무게제한에 통과되면 출발, 효율성에서 Fail, 리스트의 크기만큼 무조건 반복해야해서 그런듯
//    	for(int j=linkedList.size()-1; j>0; j--) {
//    		if(linkedList.get(0) + linkedList.get(j) <= limit) {
//    			answer++;
//    			linkedList.remove(j);
//    			linkedList.remove(0);
//    			j=linkedList.size()-1;
//    		}
//    	}
        
        // 모두 빠져나올때 까지 반복
        while(linkedList.size() > 0) {
        	// 혼자 있을 때 예외처리
        	if(linkedList.size() == 1) {
        		answer++; 
        		linkedList.removeFirst();
        		break;
        	}
        	// 최소값과 최대값을 더했을때 limit을 넘는다면 최대값은 홀로 출발
        	if(linkedList.getFirst() + linkedList.getLast() > limit) {
        		answer++;
    			linkedList.removeLast();
        	} else { // 그렇지 않다면, 즉 limit 이하라면
        		answer++;
    			linkedList.removeLast();
    			linkedList.removeFirst();
        	}
        }
        
        System.out.println(answer);
        return answer;
    }	
	
	public static void main(String[] args) {
		int[] people = {70, 80, 50};
		int limit = 100;
		solution(people, limit);
	}

}
