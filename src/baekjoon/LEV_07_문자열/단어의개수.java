package baekjoon.LEV_07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
public class 단어의개수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().trim();
		br.close();
		
		if(str.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(str.split(" ").length);
		}
	}

	private static void method_3() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().trim();	// 입력받은 문자열 앞뒤 공백제거
		int result = 0;
		br.close();
		
		if(!str.isEmpty()) 
			result = str.split(" ").length;
		
		System.out.println(result);
	}

	private static void method_1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int wordCount = 0;
		
		String str = br.readLine().trim();	// 입력받은 문자열 앞뒤 공백제거
		br.close();
		
		if(str.isEmpty()) {
			System.out.println(wordCount); return;
		}
		
		String[] arr = str.split(" ");		// 공백으로 구분하여 단어를 배열에 담음
		wordCount = arr.length;				// 담은 배열의 길이 = 문자의 개수
		System.out.println(wordCount);
	}

}
