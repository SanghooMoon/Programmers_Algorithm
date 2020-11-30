package baekjoon.입출력과사칙연산;

import java.util.Scanner;

public class 곱셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result = A*B;
		
		System.out.println(A*(B%10));
		B /= 10;
		System.out.println(A*(B%10));
		B /= 10;
		System.out.println(A*(B%10));
		System.out.println(result);
		

	}

}
