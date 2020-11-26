package algorithm;

/**
 * 구구단을 출력하세요.
 * 1단     2단     3단
 * 4단     5단     6단
 * 7단     8단     9단
 *
 */
public class 재홍이형퀴즈_구구단_V2 {

	public static void main(String[] args) {
		
		// 두 번째 방법
		for(int dan = 1; dan <= 9; dan+=3) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d X %d = %d\t%d X %d = %d\t%d X %d = %d\n", dan, i, dan*i, dan+1, i, (dan+1)*i, dan+2, i, (dan+2)*i);
			}
			System.out.println();
		}
		
		// 리팩토링(가독성)
		for(int dan = 1; dan <= 9; dan+=3) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d X %d = %d\t", dan, i, dan*i);
				System.out.printf("%d X %d = %d\t", dan+1, i, (dan+1)*i);
				System.out.printf("%d X %d = %d\n", dan+2, i, (dan+2)*i);
			}
			System.out.println();
		}
	}

}
