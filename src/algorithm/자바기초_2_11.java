package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class 자바기초_2_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		System.out.print("n 입력 : ");
		n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		int count = 1;
		// 행의 수
		for(int i=0; i<n; i++) {
			if(i>0) {
				arr[0][i] = 0;
			}
			// n만큼 숫자 출력
			for(int j=0; j<n-i; j++) {
				arr[j][i] = count;
				count++;
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}

}
