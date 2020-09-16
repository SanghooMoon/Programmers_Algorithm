package programmers.codingTest;

import java.util.Arrays;

/**
 * 정수 n이 매개변수로 주어집니다. 다음 그림과 같이 밑변의 길이와 높이가 n인 삼각형에서 맨 위 꼭짓점부터 반시계 방향으로 달팽이 채우기를
 * 진행한 후, 첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열을 return 하도록 solution 함수를 완성해주세요.
 */
public class 월간코딩테스트_2번 {

	public static int[] solution(int n) {
		
		int len = 0;
	    for(int i=0; i<=n; i++) {
	    	len = len + i;
	    }
	    int[] answer = new int[len];
		
		int arr[][] = new int[n][n]; // 입력받은 크기의 배열 생성
		int x = -1, y = -1; // arr[0][0]에 넣기 위해 '-1'로 초기화
		int num = 1; // 출력할 수

		for (int i = 0; i < n; ++i) {
			for (int j = i; j < n; ++j) {
				if (i % 3 == 0) { // 대각선, 밑변, 높이 순서대로 이동하는 규칙을 활용
					x++; // x,y의 각각 증가를 통한 대각선 이동
					y++;
				} else if (i % 3 == 1) { // y 감소를 통한 밑변에서의 이동
					y--;
				} else if (i % 3 == 2) { // x 감소를 통한 높이에서의 이동
					x--;
				}
				arr[x][y] = num++;
			} // end of in_for

		} // end of out_for

		// 출력
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j>=0; j--) { // 대각선 기준 좌하단만 출력
				if(arr[i][j] != 0) {
					answer[index++] = arr[i][j];
				}
			}
		}
		System.out.println(arr[0][0]);
		System.out.println(arr[0][4]);
		System.out.println(Arrays.toString(answer));
		
		// 출력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; ++j) { // 대각선 기준 좌하단만 출력
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}



		
		return answer;
	}

	public static void main(String[] args) {
		solution(5);
	}

}
