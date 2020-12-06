package baekjoon.LEV_03_for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
public class 기찍N {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int input = Integer.parseInt(br.readLine());
			for(int i=input; i>=1 ; i--) {
				bw.append(i+"\n");
			}
			br.close();
			bw.flush();
			bw.close();
		} catch (IOException e) {}
	}
}
