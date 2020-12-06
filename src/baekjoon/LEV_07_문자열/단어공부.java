package baekjoon.LEV_07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
public class 단어공부 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toUpperCase();	// 대문자로 저장
		br.close();
		
		int arr[] = new int[26];
		int maxCnt = 0;		// 문자를 최대 몇 번 사용했는지 저장하는 변수 
		char result = '?';
		
		for(int i=0; i<str.length(); i++) {
			int ch = str.charAt(i) - 'A';
			arr[ch]++;
			if(maxCnt < arr[ch]){				// 최대 사용 횟수보다 많다면 최대사용횟수를 업데이트하고, 결과를 해당 문자로 저장
				maxCnt = arr[ch];
				result = str.charAt(i);
			} else if ( maxCnt == arr[ch]) {	// 최대 사용회수와 같다면 즉 최대가 2개 이상이라면 결과를 '?'로 저장
				result = '?';
			}
		}
		System.out.println(result);
	}
	
	// 배열을 이용한 첫 번째 방법
	private static void method_1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];	// a~z
		
		String str = br.readLine().toUpperCase();	// 대문자로 저장
		br.close();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch - 'A']++;
		}
		
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int count = 0;
		char result = ' ';
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == max) {
				count++;
				result = (char)(i + 'A');
			}
		}
		if(count > 1) System.out.println("?");
		else System.out.println(result);
	}

}
