package baekjoon.LEV_07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2941
public class 크로아티아알파벳 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String str = br.readLine();
		br.close();
		
		for(int i=0; i<arr.length; i++) {
			str = str.replace(arr[i], "@");
		}
		System.out.println(str.length());
	}

}
