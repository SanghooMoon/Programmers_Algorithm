package leetCode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
 */
public class _1005_Maximize_Sum_Of_Array_After_K_Negations {
	
	// 음수는 부호 반전을 시켜주고, 
	// k가 홀수번 남으면 최소값을 부호반전해주고, 
	// 짝수번남으면 작업 X 
	public static int largestSumAfterKNegations(int[] nums, int k) {
		Arrays.sort(nums);
		
		// 음수 선작업
		for(int i=0; i<nums.length; i++) {
			if(k==0) {
				return addArray(nums);
			}
			if(nums[i] < 0) {
				nums[i] *= -1; 			// result add
				k--;
			} else {
				break;
			}
		}
		
		// k가 홀수일때 최저값 부호 반전
		if(k%2 == 1) {
			Arrays.sort(nums);
			nums[0] *= -1;				// result minus X 2
		}
		
        return addArray(nums);
    }
	
	public static int largestSumAfterKNegations2(int[] nums, int k) {
		
		for(int i=0; i<k; i++) {
			Arrays.sort(nums);
			nums[0] *= -1;
		}
		
        return addArray(nums);
    }

	private static int addArray(int[] nums) {
		int result = 0;
		for(int n: nums) {
			result += n;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {-8,3,-5,-3,-5,-2};
//		int[] nums = {3,-1,0,2};
//		int[] nums = {2,-3,-1,5,-4};
		int k = 6;
//		int k = 2;
		System.out.println(largestSumAfterKNegations(nums, k));
	}

}
