package programmers.practiceQuiz;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12977
 */
public class 소수만들기 {

	public static int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        
        // 모든 경우의 수
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				for (int k = j + 1; k < len; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if(isPrimeNumber(sum)) ++answer;
				}
			}
		}
        return answer;
    }
	
	// 소수인지 판별하는 메서드
	private static boolean isPrimeNumber(int sum) {
		for(int i=2; i<sum-1; i++) {
			if(sum%i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		solution(nums);
	}

}
