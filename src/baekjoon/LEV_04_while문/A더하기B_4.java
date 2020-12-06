package baekjoon.LEV_04_while문;

import java.io.*;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
public class A더하기B_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = "";
		while((input = br.readLine()) != null) {
			int a = input.charAt(0) - '0';
			int b = input.charAt(2) - '0';
			bw.append((a+b)+"\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
