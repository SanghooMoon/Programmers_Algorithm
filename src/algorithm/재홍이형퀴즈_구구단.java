package algorithm;

/**
 * 구구단을 출력하세요.
 * 1단     2단     3단
 * 4단     5단     6단
 * 7단     8단     9단
 *
 */
public class 재홍이형퀴즈_구구단 {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			for(int dan=1; dan<=3; dan++) {
				System.out.printf("%d X %d = %d\t", dan, i, dan*i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			for(int dan=4; dan<=6; dan++) {
				System.out.printf("%d X %d = %d\t", dan, i, dan*i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			for(int dan=7; dan<=9; dan++) {
				System.out.printf("%d X %d = %d\t", dan, i, dan*i);
			}
			System.out.println();
		}
	}

}
