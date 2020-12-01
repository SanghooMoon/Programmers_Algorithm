package baekjoon.while문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
public class A더하기B_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		while(!"0 0".equals(str)) {
			int a = str.charAt(0) - '0';
			int b = str.charAt(2) - '0';
			bw.append((a+b)+"\n");
			
			str = br.readLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
