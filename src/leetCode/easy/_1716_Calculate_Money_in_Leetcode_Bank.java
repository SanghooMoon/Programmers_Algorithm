package leetCode.easy;


/**
 * https://leetcode.com/problems/calculate-money-in-leetcode-bank/
 */
public class _1716_Calculate_Money_in_Leetcode_Bank {
	
	// 무난한 방식
	public static int totalMoney(int n) {
        int res = 0;
        int mondayMoney = 1;

        for(int i=0; i<n; i++) {
            if(i%7 == 0) mondayMoney = i/7 + 1;
            res += mondayMoney++;
        }

        return res;
    }
	
	// 주 단위 선 계산 후 나머지 계산
	public static int totalMoney_2(int n) {
        int res = 0;
        
        if(n<7) {
        	for(int i=0; i<n;) {
            	res += ++i;
            }
        	return res;
        }
        
        int quotient = n/7;
        int remainder = n%7;

        for(int i=0; i<quotient; i++) {
        	res += 28 + (7 * i);
        }
        
        for(int i=0; i<remainder; i++) {
        	res += ++quotient;
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		System.out.println(totalMoney_2(6));
	}

}
