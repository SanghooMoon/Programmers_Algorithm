package leetCode.easy;

public class _007_Reverse_Integer {

	public static void main(String[] args) {
		System.out.println(userReverse(2147483647));
	}
	
	// 리팩토링(나의 답)
	public static int reverse(int x) {
		int result = 0;
		
		while(x != 0) {					// <, >로 비교하면 음수 또는 양수만 검증하므로 같지않다로 비교
			int pop = x%10;				// 맨 끝자리를 가져와 변수에 저장
			x /= 10;					// 꼬리 제거, 12345 -> 1234
			
			// 123 -> 3 -> 32(30+2) -> 321(320+1), 이렇게 더하기전에 10을 곱해서 자릿수 하나 시프트 후 pop 더하기
//			result = result * 10 + pop;	
			try {
				result = Math.multiplyExact(result, 10) + pop;	// 위 설명에 result*10 이 overflow가 날 수가 있으니 multiplyExact 메서드로 검증하여 예외처리
			} catch (ArithmeticException e) {
				return 0;
			}
		}
		
        return result;
    }
	
	// 다른 사람의 답
	public static int userReverse(int x) {
		// 매개변수x를 절대값으로 STringBuilder에 넣은 후 reverse 메서드를 통해 값을 반전시키고, String 타입을 변환
		String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();	
		try {
			// return, 음수라면 -1을 곱하여 음수로 치환
		    return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
		} catch (NumberFormatException e) {	// overflow 예외처리
		    return 0;
		}
	}
	
	// 리트코드 답, overflow 검증 로직이 다름
	public int leetCodeReverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            
            // MAX_VALUE = 2147483647, MIN_VALUE = -2147483648 
            // 누적되고 있는값(rev)가 214748364 보다 크면, 즉 10을 곱하면 overflow가 발생하기 때문에 return, 
            // 또는  rev가 214748364 인데 10을 곱한 후에 pop을 더하는게 8이상이면 overflow 발생
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            // 위와 같은 로직, 부호만 반전
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
	
	// 하드코딩
	public static int reverse2(int x) {
		int result = 0;
		int xLength = String.valueOf(Math.abs(x)).length();
		
		try {
			for(int i=xLength-1; i>=0; i--) {
				// 이건 각 자리의 곱이 overflow가 발생하면 예외 처리하는거라 의미X, result가 overflow가 났는지를 봐야함
//				result += Math.multiplyExact((x%10), (int)Math.pow(10, i));	
				result = Math.addExact(result, Math.multiplyExact((x%10), (int)Math.pow(10, i)));	// 위의 로직 + 누적했을때 overflow인지를 검사 후 exception 처리
				x = x/10;
			}
		} catch (ArithmeticException e) {
			return 0;
		}
		
        return result;
    }

}
