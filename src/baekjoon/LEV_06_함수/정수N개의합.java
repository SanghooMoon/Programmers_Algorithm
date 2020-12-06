package baekjoon.LEV_06_함수;

// 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
public class 정수N개의합 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		sum(arr);
	}
	
	public static long sum(int[] a) {
		long sum = 0;
		for(int i : a) {
			sum += i;
		}
		return sum;
	}

}
