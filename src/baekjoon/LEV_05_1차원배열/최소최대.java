package baekjoon.LEV_05_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
public class 최소최대 {

	public static void main(String[] args) throws IOException {
//		long start = System.currentTimeMillis();
//		method_2();
//		long end = System.currentTimeMillis();
//		System.out.println("method_2() : " + (end - start));
		
		long start = System.currentTimeMillis();
		method_1();
		long end = System.currentTimeMillis();
		System.out.println("method_1() : " + (end - start));
	}

	private static void method_2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		br.close();
        
		int min = Integer.parseInt(strArr[0]);
		int max = min;
		
		for(int i=1; i<input; i++) {
			int num = Integer.parseInt(strArr[i]);
			if(num < min) min = num;
			if(num > max) max = num;
		}
		System.out.println(min + " " + max);
	}

	private static void method_1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int[] arr = new int[input];
		String[] strArr = br.readLine().split(" ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		Arrays.sort(arr);
		
		br.close();
		bw.append(arr[0] +" "+ arr[input-1]);
		bw.flush();
//		bw.close();
	}

}
