package baekjoon.LEV_06_함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
public class 한수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=1; i<=input; i++) 
			if(oneNum(i)) count++;
		
		System.out.println(count);
	}
	public static boolean oneNum(int num) {
		if(num < 100) {
			return true;
		} else if(num >= 111 && num < 1000) {
//			int _1 = num % 10; num = num/10;
//			int _10 = num % 10; num = num/10;
//			int _100 = num % 10;
//			if(_100-_10 == _10-_1) 
//				return true;
			int _1 = num % 10;
			int _10 = (num/10) % 10;
			int _100 = num / 100;
			if(_100-_10 == _10-_1) return true;
		}
		return false;
	}

}
