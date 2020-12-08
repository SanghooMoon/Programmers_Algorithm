package baekjoon.LEV_07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1316

/**
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */
public class 그룹단어체커 {

	public static void main(String[] args) throws IOException {
		
	}
	
	// 다른사람의 풀이 참조한 방법
	private static void otherMethod_1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = N;	// 모두 그룹단어라고 가정

		// N번 만큼 입력받음
        for(int i=0; i<N; i++) {
            String word = br.readLine();
            boolean[] checks = new boolean[26];	// 각 소문자마다 나왔던 문자인지 체크하는 배열
            char prev = ' ';	// 이전의 문자를 담기 위한 변수
            
            for(int j=0; j<word.length(); j++) {
            	char ch = word.charAt(j);
            	// 만약 최초 or 이전의 문자와  다르다면,
            	if(ch != prev) {
            		prev = ch;	// 이전 문자를 현재 문자로 저장
            		// 만약 이미 나왔던 문자라면(true 라면) 그룹단어 X
            		if(checks[ch-'a']) {
            			count--;
            			break;
            		} else {	// 처음 나오는 문자라면 true로 변경
            			checks[ch-'a'] = true;
            		}
            	}
            }
        }
        System.out.println(count);
	}
	
	// 내가 푼 방법
	private static void myMethod() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] words = new String[N];	// 단어를 담는 배열
		int count = 0;	
		
		for(int i=0; i<N; i++) {
			words[i] = br.readLine();
		}
		br.close();
		
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			boolean flag = false;	// 그룹단어인지 판별, 기본값 : false
			
			Loop : for(int j=0; j<word.length()-1; j++) {	// 단어 수만큼 반복
				char ch = word.charAt(j);					// 비교할 문자
				int idx = word.indexOf(ch, j);				// 비교할 문자의 위치, j번째 이후 최초의 위치 
				for(int k=j+1; k<word.length(); k++) {		// 각 자리 검증
					char nextCh = word.charAt(k);			// 비교할 문자의 다음 문자
					if(ch==nextCh) {						// 문자가 같고 위치의 차이가 1이라면 옆에 붙어있는 문자이기 때문에 idx를 옮겨줌. 그렇지 않다면 떨어져 있는 문자는 그룹문자가 아님
						if(k-idx == 1) idx = k;
						else {
							flag = true;
							break Loop;
						}
					}
				}
			}
			if(!flag) count++;	// 그룹단어이면 카운트++
		}
		System.out.println(count);
	}


}
