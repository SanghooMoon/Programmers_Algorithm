package baekjoon.LEV_01_입출력과사칙연산;

import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
public class A빼기B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A-B);
	}

}
