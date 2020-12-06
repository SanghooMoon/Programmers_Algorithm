package baekjoon.LEV_07_문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
public class 알파벳찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[26];
		
		for(int i=0; i<arr.length; i++)
			arr[i] = -1;
		
		String str = br.readLine();
		br.close();
		
		for(int i=0; i<str.length(); i++) {
			// 문자를 앞에서부터 가져오고 그 문자의 위치는 i
			char ch = str.charAt(i);	
			if(arr[ch - 'a'] == -1)
				arr[ch - 'a'] = i;
		}
		for(int i=0; i<arr.length; i++)
			bw.append(arr[i]+" ");
		
		bw.flush();
		bw.close();
	}

	private static void method_1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		br.close();
		
		for(int i=97; i<=122; i++) {	// 97~122 : a~z
			bw.append(str.indexOf(i) + " ");
		}
		bw.flush();
		bw.close();
	}

}
