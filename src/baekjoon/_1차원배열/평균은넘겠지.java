package baekjoon._1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
public class 평균은넘겠지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		String[] arr = new String[testCase];
		
		for(int i=0; i<testCase; i++) {
			arr[i] = br.readLine();
		}
		br.close();
		
		for(int i=0; i<arr.length; i++) {
			String[] info = arr[i].split(" ");
			
			double N = Integer.parseInt(info[0]);
			int sum = 0;
			double count = 0;
			
			for(int j=1; j<info.length; j++) {
				sum += Integer.parseInt(info[j]);
			}
			double avgSum = (double)sum/N;
			
			for(int j=1; j<info.length; j++) {
				if(avgSum < Integer.parseInt(info[j])) {
					count++;
				}
			}
			System.out.println(avgSum);
			System.out.println(count);
			System.out.printf("%.3f%%\n", count/N * 100.0);
		}
	}

}
