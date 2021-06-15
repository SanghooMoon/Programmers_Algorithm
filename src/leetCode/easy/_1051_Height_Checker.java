package leetCode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/height-checker/submissions/
 */
public class _1051_Height_Checker {
	
	// 정렬 후 체크
	public static int heightChecker(int[] heights) {
        int result = 0;
        
        int[] copyHeights = heights.clone();	// 인규 : copyOfRange(), 승현 : 직접 대입
        Arrays.sort(heights);
        
        for(int i=0; i<copyHeights.length; i++) {
        	if(copyHeights[i] != heights[i]) {
        		result++;
        	}
        }
        
        return result;
    }
	
	// 리트코드 답안
	public static int heightChecker_2(int[] heights) {
        int[] heightToFreq = new int[101];
        
        for (int height : heights) {
            heightToFreq[height]++;
        }
        
        int result = 0;
        int curHeight = 0;
        
        for (int i = 0; i < heights.length; i++) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }
            
            if (curHeight != heights[i]) {
                result++;
            }
            heightToFreq[curHeight]--;
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		int[] heights = {1,1,4,2,1,3};
		System.out.println(heightChecker(heights));
	}

}
