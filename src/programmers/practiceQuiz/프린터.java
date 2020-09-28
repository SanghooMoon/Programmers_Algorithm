package programmers.practiceQuiz;

import java.util.LinkedList;

/**
 * 
일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다. 그렇기 때문에 중요한 문서가 나중에 인쇄될 수 있습니다. 
이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발했습니다. 이 새롭게 개발한 프린터는 아래와 같은 방식으로 인쇄 작업을 수행합니다.

1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
3. 그렇지 않으면 J를 인쇄합니다.

예를 들어, 4개의 문서(A, B, C, D)가 순서대로 인쇄 대기목록에 있고 중요도가 2 1 3 2 라면 C D A B 순으로 인쇄하게 됩니다.
내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 알고 싶습니다. 위의 예에서 C는 1번째로, A는 3번째로 인쇄됩니다.

현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와 
내가 인쇄를 요청한 문서가 현재 대기목록의 어떤 위치에 있는지를 알려주는 location이 매개변수로 주어질 때, 
내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 return 하도록 solution 함수를 작성해주세요.
 *
 */
public class 프린터 {

	public static int solution(int[] priorities, int location) {
        
        LinkedList<Integer> que = new LinkedList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0; i<priorities.length; i++) {
        	que.add(priorities[i]);	// 우선순위
        	list.add(i);			// 작업이름
        }
        System.out.println("que : " + que);
    	System.out.println("list : " + list);
        System.out.println("=====================");
        
        
        int printCount = 0;
        while(printCount < que.size()) {
        	boolean isPrint = false;
        	int head = que.get(printCount);				// 첫번째 요소를 반환
        	int listHead = list.get(printCount);				// 첫번째 요소를 반환
        	for(int j=printCount+1; j<que.size(); j++) {
        		int num = que.get(j);
        		if(head < num) {		// 자신보다 높은 우선순위가 있다면
        			isPrint = que.offer(que.get(printCount));	// 첫번째 요소를 맨 끝에 추가
        			list.offer(list.get(printCount));	// 첫번째 요소를 맨 끝에 추가
        			que.remove(printCount);						// 첫번째 요소 삭제
        			list.remove(printCount);						// 첫번째 요소 삭제
                	System.out.println("que : " + que);
                	System.out.println("list : " + list);
                	break;
        		}
        	}
        	if(!isPrint) {
        		printCount++;
        		System.out.println("인쇄");
        		System.out.println();
        	}
        } 
        int index = list.indexOf(location);
        System.out.println(index);
        return index + 1;
    }
	
	public static void main(String[] args) {
//		int[] priorities = {1, 1, 9, 1, 1, 1};
//		int location = 0;
		int[] priorities = {2,2,2,1,3,4};
		int location = 3;
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2;
		solution(priorities, location);
	}
	
	

}
