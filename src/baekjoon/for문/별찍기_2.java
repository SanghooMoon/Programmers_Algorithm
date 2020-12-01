package baekjoon.for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 */
public class 별찍기_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=input; i++) {
			// 공백
			for(int j=i; j<input; j++) {
				bw.append(" ");
			}
			// 별
			for(int k=0; k<i; k++) {
				bw.append("*");
			}
			bw.append("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
