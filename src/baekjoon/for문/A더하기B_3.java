package baekjoon.for문;

import java.io.*;
import java.util.StringTokenizer;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
public class A더하기B_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		for(int i=0; i<input; i++) {
			String s = br.readLine();
			int a = s.charAt(0)-'0';
			int b = s.charAt(2)-'0';
			bw.write((a+b) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

	private static void method_1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		
		for(int i=0; i<input; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a+b + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
