package programmers.practiceQuiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다. 
 * 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
 */
public class 직사각형별찍기 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(); // 별 수
//		int b = sc.nextInt(); // 행 수
		
//		for(int i=0; i<b; i++) {
//			for(int j=0; j<a; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush();
		
		bw.close();
		br.close();
	}

}
