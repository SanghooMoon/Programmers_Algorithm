package leetCode.easy;

import java.util.*;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
public class _001_Two_Sum {

	public static void main(String[] args) {
//		int[] nums = {2,7,11,15};
		int[] nums = {2,5,5,11};
		System.out.println(Arrays.toString(twoSum2(nums, 10)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
		for(int i=0; i<nums.length-1; i++) {
            int first = nums[i];
            for(int j=i+1; j<nums.length; j++) {
                int two = nums[j];
                if(first+two == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
	
	public static int[] twoSum2(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);											// key는 배열의 값, value는 인덱스
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];								// complement가 목적값
	        if (map.containsKey(complement) && map.get(complement) != i) {	// 목적값이 맵에 존재하고, 해당 인덱스가 자기자신이 아니라면
	            return new int[] { i, map.get(complement) };				// return
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	public int[] twoSum3(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    // 반복 하면서 추가된 hashmap의 데이터와 비교하면서 찾음
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];	// 목적값을 구한다.
	        if (map.containsKey(complement)) {	// 목적값이 hash 값에 존재한다면 return
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);				// 존재하지 않다면 map에 key는 배열의 값, i는 인덱스을 추가
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
