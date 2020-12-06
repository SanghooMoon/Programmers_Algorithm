package baekjoon.LEV_05_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 * 예를 들어, 서로 다른 9개의 자연수
 * 3, 29, 38, 12, 57, 74, 40, 85, 61 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 *
 */
public class 최대값 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		int index = 0;
		int count = 0;

		for(int i=1; i<=9; i++) {
			int num = Integer.parseInt(br.readLine());
			count++;
			if(max < num) {
				max = num;
				index = count;
			}
		}
		br.close();
		bw.append(max + " " + index);
		bw.flush();
		bw.close();
		System.out.println(max + " " + index);
		
	}

}
