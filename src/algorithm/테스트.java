package algorithm;

public class 테스트 {

	public static void main(String[] args) {
		
		// 승현이 질문
		// 결과 저장 변수
		StringBuffer sb = new StringBuffer();
		String str = "";
		
		// 랜덤값 추출
		int random = (int)(Math.random() * 100);
		System.out.println(random);
		
		// 랜덤 수만큼 반복
		for(int i=0; i<random; i++) {
			sb.append("#");
			str += "#";
		}
		System.out.println(sb);
		System.out.println(str);
		// 승현이 질문 끝
	}

}
