package programmers.practiceQuiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 
이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 
각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
 *
 */
public class 기능개발 {

	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        /*
        // 프로젝트 배열 > ArrayList 로 변환
        ArrayList<Integer> progressesList = new ArrayList<Integer>();
        for(int i=0; i<progresses.length; i++) {
        	progressesList.add(progresses[i]);
        }
        // 작업 속도 배열 > ArrayList 로 변환
        ArrayList<Integer> speedsList = new ArrayList<Integer>();
        for(int i=0; i<speeds.length; i++) {
        	speedsList.add(speeds[i]);
        }
        // 정답 ArrayList
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        System.out.println(progressesList);
        
        
        while(true) {
        	// 작업 실행 후 결과
        	for(int i=0; i<progressesList.size(); i++) {
        		progressesList.set(i, progressesList.get(i) + speedsList.get(i));
        	}
        	System.out.println("작업 완료 " + progressesList);
        	        	
        	// 만약 첫(head) 프로젝트가 완료되었으면
        	if(progressesList.get(0) >= 100) {
        		int count = 0;
        		// 그 이하 프로젝트들도 확인하여 완료된게 있다면 카운트, 앞에부터 차례로 확인하면서 완료되지않았다면 break;
        		for(int i=0; i<progressesList.size(); i++) {
        			if(progressesList.get(i) >= 100) {
        				++count;
        			} else {
        				break;
        			}
        		}
        		// 배출된 만큼 삭제(머리)
        		for(int i=0; i<count; i++) {
            		progressesList.remove(0);
            		speedsList.remove(0);	// 작업속도리스트도 삭제를 해줘야 작업연산 시 에러X            0
            		System.out.println("삭제 후 " + progressesList);
        		}
        		answerList.add(count);	// 결과에 누적
        	}
        	
        	if(progressesList.size() == 0) break;
        	System.out.println(answerList);
        	System.out.println();
        }
        
        // 정답 배열
        answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++) {
        	answer[i] = answerList.get(i);
        }
        System.out.println(Arrays.toString(answer));
        */
        Queue<Integer> progressQue = new LinkedList<Integer>();
        Queue<Integer> speedQue = new LinkedList<Integer>();
        for(int i=0; i<progresses.length; i++) {
        	progressQue.add(progresses[i]);
        	speedQue.add(speeds[i]);
        }
        
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1,1,1,1,1};
		solution(progresses, speeds);
	}

}
