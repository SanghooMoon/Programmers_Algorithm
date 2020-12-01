package baekjoon.for문;

import java.io.*;
import java.util.StringTokenizer;

// 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
public class 빠른A더하기B {

	public static void main(String[] args) throws IOException {
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        
		method_1();
		        
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	// 세번째 방법
	private static void method_3() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int input = Integer.parseInt(br.readLine());
		
		for(int i=0; i<input; i++) {
			st = new StringTokenizer(br.readLine());
			int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			sb.append(result+"\n");
		}
		System.out.println(sb);
	}
	
	// 두번째 방법
	private static void method_2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st;
		
		int input = Integer.parseInt(br.readLine());
		
		for(int i=0; i<input; i++) {
			st = new StringTokenizer(br.readLine());
			int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			sb.append(result+"\n");
		}
		System.out.println(sb);
	}
	
	// 첫번째 방법
	private static void method_1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int input = Integer.parseInt(br.readLine());
		
		for(int i=0; i<input; i++) {
			st = new StringTokenizer(br.readLine());
			int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			bw.write(result+"\n");
		}
		bw.flush();
	}

}
