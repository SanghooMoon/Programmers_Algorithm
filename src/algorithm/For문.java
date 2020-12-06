package algorithm;

public class For문 {

	public static void main(String[] args) {
		
		// 바깥 반복문
		for(int i=1; i<=2; i++) {
			System.out.println("바깥 반복문");
			// 안쪽반복문
			for(int j=1; j<=3; j++) {
				System.out.println("안쪽 반복문");
			}
		}
	}

}
