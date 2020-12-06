package baekjoon.LEV_03_for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
public class N찍기 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int input = Integer.parseInt(br.readLine());
			for(int i=1; i<=input; i++)
				bw.write(i+"\n");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
