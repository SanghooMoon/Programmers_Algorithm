package baekjoon.LEV_05_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 * 예를 들어 A = 150, B = 266, C = 427 이라면 
 * A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 *
 */
public class 숫자의개수 {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int result = 1;
//		for(int i=0; i<3; i++) {
//			result *= Integer.parseInt(br.readLine());
//		}
//		br.close();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[10];
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		br.close();
		
		String result = String.valueOf(a * b * c);
		
		for(int i=0; i < result.length(); i++) 
			arr[result.charAt(i) - '0']++;
		for(int i=0; i<10; i++)
			bw.append(arr[i]+"\n");
		
		bw.flush();
		bw.close();
	}

	private static void method_1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[10];
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		br.close();
		
		int result = a * b * c;
		
		while(result>0) {
			arr[result % 10]++;
			result /= 10;
		}
		for(int i=0; i<10; i++) {
			bw.append(arr[i]+"\n");
		}
		bw.flush();
		bw.close();
	}
}