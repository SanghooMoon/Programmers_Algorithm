package programmers.practiceQuiz;

import java.util.HashSet;

public class 폰켓몬 {

	public static int solution(int[] nums) {
        int cnt = nums.length/2;
        HashSet<Integer> hs = new HashSet<>();
        
        for(int n : nums) {
            hs.add(n);
        }
        
        // if(cnt < hs.size()) return cnt;
        // else return hs.size();
        
        return cnt < hs.size() ? cnt : hs.size();
    }
	
	
	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		solution(nums);
	}

}
