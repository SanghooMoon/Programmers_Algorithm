package programmers.codingTest;

/**
 * 0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.
 *
 * x의 모든 0을 제거합니다.
 * x의 길이를 c라고 하면, x를 c를 2진법으로 표현한 문자열로 바꿉니다.
 * 예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.
 *
 * 0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 1이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.
 */
public class 월간코딩테스트_11월_2번 {
    public static int[] solution(String s) {
        int[] answer = new int[2];

        int num = 0;        // 반복문에 사용
        int zeroCnt = 0;    // 0의 개수를 세는 카운트
        int count = 0;  // 회차를 세는 카운트

        while(num != 1) {
            ++count;    // 회차 증가

            for(int i=0; i<s.length(); i++) {   // 0의 개수 증가
                if(s.charAt(i) == '0')
                    zeroCnt++;
            }

            s = s.replace("0", "");     // 0을 모두 삭제
            num = s.length();                           // 삭제 후 문자열의 길이를 저장
            s = Integer.toBinaryString(num);            // 문자열의 길이를 2진수로 변환

        }
        answer[0] = count;
        answer[1] = zeroCnt;

        return answer;
    }

    public static void main(String[] args) {
        String s = "110010101001";
//        String s = "01110";
//        String s = "1111111";
        solution(s);
    }
}
