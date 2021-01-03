package leetCode.easy;

public class _009_Palindrome_Number {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome2(12121));
	}
	
	// leetCode solution
	public boolean solution(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.	음수 일때는 회문이 아님.
        // Also if the last digit of the number is 0, in order to be a palindrome,	맨 끝자리가 0이라면 그것 또한 회문이 아님.
        // the first digit of the number also needs to be 0.	첫 번째 자리도 0이어야하는데 이는 0밖에 없음
        // Only 0 satisfy this property.
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {	// 1221, 0 > 122, 1 > 12, 21 이렇게 revertedNumber가 더 커지는 순간까지 반복, 굳이 전체를 뒤집어놓고 비교 X
        	// reverse 로직, 7번 Reverse Integer와 동일, overflow 예외처리는 빠짐
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;	
        
        // x와 revertedNumber가 같다면 당연히 회전문인데, 12321 과 같은 경우 x는12 num은 123이므로  /10을하여 중간숫자인 3을 제거하여 비교
    }
	
	// 1번 방법 개선, 속도는 해결, 메모리는 66% 정도
	public static boolean isPalindrome2(int x) {
		
		if(x<0) return false;
		
		int originalNum = x;
		int reverseNum = 0;
		
		while(x>0) {
			int pop = x%10;
			x /= 10;
			reverseNum = reverseNum * 10 + pop;
		}
		
		if(reverseNum == originalNum) return true;
		
		return false;
        
    }
	
	// 첫번쨰 방법, 간결하지만 메모리 및 속도문제
	public static boolean isPalindrome(int x) {
		
		String originalNum = String.valueOf(x);
		String reverseNum = new StringBuilder().append(x).reverse().toString();
		
		if(originalNum.equals(reverseNum)) {
			return true;
		}
        return false;
        
    }
}
