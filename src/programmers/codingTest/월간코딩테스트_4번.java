package programmers.codingTest;


/**
 * 모든 수가 0 또는 1로 이루어진 2차원 배열 a가 주어집니다. 
 * 다음 조건을 모두 만족하는 2차원 배열 b의 경우의 수를 (107 + 19)로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
 * b의 모든 원소는 0 아니면 1입니다.
 * a의 행/열의 개수와 b의 행/열의 개수가 같습니다. (= a와 b의 크기가 같습니다.)
 * i = 1, 2, ..., (a의 열의 개수)에 대해서 a의 i번째 열과 b의 i번째 열에 들어 있는 1의 개수가 같습니다.
 * b의 각 행에 들어 있는 1의 개수가 짝수입니다. (0도 짝수입니다.)
 *
 */
public class 월간코딩테스트_4번 {

	public static int solution(int[][] a) {
        int answer = -1;
        
        int[][] b = new int[a.length][a[0].length];
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[][] a = {
				{0,1,0},{1,1,1},{1,1,0},{0,1,1}
		};
		solution(a);
	}

}
