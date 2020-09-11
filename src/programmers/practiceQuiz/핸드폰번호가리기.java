package programmers.practiceQuiz;

/**
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, 
 * solution을 완성해주세요.
 *
 */
public class 핸드폰번호가리기 {

	public static String solution(String phone_number) {
        String answer = "";
        
        String first = phone_number.substring(0, phone_number.length()-4);
        String second = phone_number.substring(phone_number.length()-4, phone_number.length());
        answer = first.replaceAll("[0-9]", "*").concat(second) ;
        
//		StringBuffer answer = new StringBuffer(phone_number);
//        StringBuffer first = new StringBuffer(phone_number.substring(0, phone_number.length()-4));
//        StringBuffer second = new StringBuffer(phone_number.substring(phone_number.length()-4, phone_number.length()));
//        
//        answer = answer.replace(0, phone_number.length()-4, "*");
        
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
//		String phone_number = "01033334444";
		String phone_number = "027778888";
		solution(phone_number);
	}

}
