package programmers.practiceQuiz;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다.
 * 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 트럭은 1초에 1만큼 움직이며,
 * 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
 * ※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
 *
 * 예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이
 * 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
 *
 * 경과 시간	다리를 지난 트럭	다리를 건너는 트럭	    대기 트럭
 * 0	    []	            []	                [7,4,5,6]
 * 1~2	    []	            [7]	                [4,5,6]
 * 3	    [7]	            [4]	                [5,6]
 * 4	    [7]	            [4,5]	            [6]
 * 5	    [7,4]	        [5]	                [6]
 * 6~7	    [7,4,5]	        [6]	                []
 * 8	    [7,4,5,6]	    []	                []
 * 따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.
 *
 * solution 함수의 매개변수로 다리 길이 bridge_length, 다리가 견딜 수 있는 무게 weight,
 * 트럭별 무게 truck_weights가 주어집니다. 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.
 */
public class 다리를지나는트럭 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int max = 0;
        Queue<Integer> queue = new ArrayDeque<>();

        // 트럭 수 만큼
        for(int t : truck_weights){
            /*
            break 문은 트럭이 추가되었을때만 걸어줌
             */
            while(true) {
                if(queue.isEmpty()){    // 다리가 비어있을 때는 트럭 추가
                    queue.add(t);
                    max += t;
                    answer++;
                    break;
                } else if(queue.size() == bridge_length){   // 다리의 트럭수와 다리의 길이가 같다면 선두 제거
                    max -= queue.poll();
                } else {
                    if(max + t > weight){   // 무게가 초과되어 더 적재할수 없다면 0을 적재
                        queue.add(0);
                        answer++;
                    } else {                // 그렇지 않다면 트럭 추가
                        queue.add(t);
                        max += t;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer + bridge_length;      // 트럭을 queue에 추가만하고 break 하기때문에 추가한 트럭까지 건너기위해 다리의 길이를 더함
    }

    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

//        int bridge_length = 100;
//        int weight = 100;
//        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        solution(bridge_length, weight, truck_weights);
    }

}
