package baekjoon.LEV_03_for문;

import java.io.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
public class 합 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i=1; i<=input; i++) {
			result += i;
		}
		bw.write(result+"");
		bw.flush();
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i=1; i<=input; i++) {
			result += i;
		}
		System.out.println(result);
		*/
	}

}
