package baekjoon.LEV_03_for문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
public class 구구단 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int dan = Integer.parseInt(br.readLine());
		for(int i=1;i<10;i++) {
		    System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
		/*
		for(int i=1; i<=9; i++) {
			bw.write(dan+" * "+i+" = "+dan*i+"\n");
			bw.flush();
		}
		*/
		
		/*
		for(int i=1;i<10;i++) {
		    System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		*/
		
	}
}
