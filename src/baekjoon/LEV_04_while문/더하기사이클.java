package baekjoon.LEV_04_while문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
 * 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
 * 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
 * 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
 * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 *
 */
public class 더하기사이클 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int result = input;	// 최초의 값을 result에 저장
		int count = 0;
		
		while(true) {
			count++;										// 카운트 누적
			int sum = (input / 10) + (input % 10);			// 첫 번째 자리 + 두 번째 자리
			input = (input % 10) * 10 + (sum % 10);			// 주어진 수의 가장 오른쪽 자리 수(input)와 앞에서 구한 합(sum)의 가장 오른쪽 자리 수를 이어 붙임
			if(input == result) break;						// 그 값이 최초의 값(result)와 같으면 break;
		}
		br.close();
		bw.append(count+"");
		bw.flush();
		bw.close();
	}

	private static void method_1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int result = input;
		int count = 0;
		
		while(true) {
			if(result < 0) result *= 11;
			
			count++;
			int atZero = result / 10;
			int atOne = result % 10;
			int sum = atZero + atOne;
			result = (atOne*10) + (sum%10);
			
			if(input == result) break;
		}
		br.close();
		bw.append(count+"");
		bw.flush();
		bw.close();
	}

}
