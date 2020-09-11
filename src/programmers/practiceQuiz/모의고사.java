package programmers.practiceQuiz;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 수포자는 수학을 포기한 사람의 준말입니다. 
 * 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
 * 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 */
public class 모의고사 {
	
	/*
	// 인규
	public static int[] solution(int[] answers) {
		int[] correctCount = new int[3];
		int max = correctCount[0];
		int maxCount = 0;				//많이 맞춘 회원 수
		int[] answer;
		int[] aAnswers = new int[answers.length];
		int[] bAnswers = new int[answers.length];
		int[] cAnswers = new int[answers.length];
		
		for(int i=0; i<answers.length; i++) {
			aAnswers[i] = i%5+1;
			if(aAnswers[i]==answers[i]) {
				correctCount[0]++;	
			}
		}
		
		for(int i=0; i<answers.length; i++) {
			if(i%2==0) {
				bAnswers[i] = 2;
			}else if(i%8==1) {
				bAnswers[i] = 1;
			}else if(i%8==3) {
				bAnswers[i] = 3;
			}else if(i%8==5) {
				bAnswers[i] = 4;
			}else if(i%8==7) {
				bAnswers[i] = 5;
			}
			
			if(bAnswers[i]==answers[i]) {
				correctCount[1]++;
			}
				
		}
		
		for(int i=0; i<answers.length; i++) {
			if(i%10<=1) {
				cAnswers[i] = 3;
			}else if(i%10<=3 && i%10>=2) {
				cAnswers[i] = 1;
			}else if(i%10>=4 && i%10<=5) {
				cAnswers[i] = 2;
			}else if(i%10>=6 && i%10<=7) {
				cAnswers[i] = 4;
			}else if(i%10>=8 && i%10<=9) {
				cAnswers[i] = 5;
			}
			
			if(cAnswers[i]==answers[i]) {
				correctCount[2]++;
			}
				
		}
		for(int i=0; i<correctCount.length; i++) {
			if(max<correctCount[i]) {
				max = correctCount[i];
			}
		}
		
		for(int i=0; i<correctCount.length; i++) {
			if(max==correctCount[i]) {
				maxCount++;
			}
		}
		System.out.println(maxCount);
		
		answer = new int[maxCount];
		
		int index = 0;
		for(int i=0; i<correctCount.length; i++) {
			if(max==correctCount[i]) {
				answer[index++] = i+1;
			}
		}
		
		System.out.println(Arrays.toString(correctCount));
		System.out.println(Arrays.toString(answer));
		return answer;
	}
	*/
	
	// 내가 푼 풀이
	public static int[] solution(int[] answers) {
		int[] answer = {};
        // 학생 배열
        int[] humans = new int[3];
        
        // 각 학생들이 찍는 패턴 배열
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 찍는 패턴배열의 인덱스
        int oneIdx = 0;
        int twoIdx = 0;
        int threeIdx = 0;
        
        for(int i=0; i<answers.length; i++) {
        	// 1번 학생(답안과 맞으면 ++ 후 패턴이 끝나면 다시 첫 패턴으로)
        	if(answers[i] == one[oneIdx]) {
        		humans[0]++;
        	}
        	oneIdx++;
        	if(oneIdx==one.length) oneIdx = 0;
        	
        	// 2번학생
        	if(answers[i] == two[twoIdx]) {
        		humans[1]++;
        	}
        	twoIdx++;
        	if(twoIdx==two.length) twoIdx = 0;
        	
        	// 3번학생
        	if(answers[i] == three[threeIdx]) {
        		humans[2]++;
        	}
    		threeIdx++;
    		if(threeIdx==three.length) threeIdx = 0;
        }
        
        // 맞춘 개수 최대값 가져오기
        int max = humans[0];
        for(int i=0;i<humans.length;i++) {
            if(max<humans[i]) {
            	max = humans[i]; //max의 값보다 array[i]이 크면 max = array[i]
            }
        }
        System.out.println(max);
        
        // 최고득점자들 리스트
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<humans.length; i++) {
        	if(max == humans[i]) {
        		list.add(i+1);
        	}
        }
        answer = new int[list.size()];
        
        // 가장 많은 문제 맞춘사람들
        for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        System.out.println(Arrays.toString(humans));
        System.out.println(Arrays.toString(answer));
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] answers = {1,2,3,4,5,3,3,3,3,3,3};
//		int[] answers = {1,3,2,4,2};
		solution(answers);
	}

}
