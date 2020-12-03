package baekjoon._1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
 * O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 */
public class OX퀴즈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		String[] arr = new String[input];
		
		// ox 입력
		for(int i=0; i<input; i++) {
			arr[i] = br.readLine();
		}
		br.close();
		
		for(int i=0; i<input; i++) {
			int score = 0;
			int sum = 0;
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					sum++;
					score += sum;
				} else {
					sum = 0;
				}
			}
			bw.append(score+"\n");
		}
		bw.flush();
		bw.close();
	}

	private static void method_2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=input; i++) {
			int score = 0;
			int sum = 0;
			char[] oxArr = br.readLine().toCharArray();
			for(int j=0; j<oxArr.length; j++) {
				if(oxArr[j] == 'O') {
					sum++;
					score += sum;
				} else {
					sum = 0;
				}
			}
			bw.append(score+"\n");
		}
		br.close();
		bw.flush();
        bw.close();
	}

	private static void method_1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=input; i++) {
			int score = 0;
			int sum = 0;
			String ox = br.readLine();
			for(int j=0; j<ox.length(); j++) {
				if(ox.charAt(j) == 'O') {
					sum++;
					score += sum;
				} else {
					sum = 0;
				}
			}
			bw.append(score+"\n");
		}
		br.close();
		bw.flush();
        bw.close();
		bw.flush();
	}
}
