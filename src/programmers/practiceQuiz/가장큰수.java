package programmers.practiceQuiz;

import java.math.BigDecimal;
import java.util.*;

/**
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 *
 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
 *
 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때,
 * 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한 사항
 * numbers의 길이는 1 이상 100,000 이하입니다.
 * numbers의 원소는 0 이상 1,000 이하입니다.
 * 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
 * 입출력 예
 * numbers	return
 * [6, 10, 2]	6210
 * [3, 30, 34, 5, 9]	9534330
 */
public class 가장큰수{



    public static String solution(int[] numbers) {
        String answer = "";

        // 첫번째 풀이, 메서드를 호출할때 int[] 배열이기에 프로그래머스에선 통과 안돼 -> 차라리 String배열에 담자
        /*
        Arrays.sort(numbers, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                char c1 = o1.toString().charAt(0);
                char c2 = o2.toString().charAt(0);

                if (c1 == c2) {
                    Integer a = Integer.parseInt(o1.toString() + o2.toString());
                    Integer b = Integer.parseInt(o2.toString() + o1.toString());
                    return a.compareTo(b) * -1;
                } else {
                    return c2 - c1;
                }
            }
        });

        for(int num :  numbers) {
            answer += String.valueOf(num);
        }
        System.out.println(answer);
         */

        // String 배열로 바꿔서 해보자
        String[] arr = new String[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, new Comparator<String>(){
            // 나의 방법, 맨 앞자리 내림차순으로 정렬한 후 같은 것은 각각 합쳐서 비교하여 정렬
            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(0);
                char c2 = o2.charAt(0);

                if (c1 == c2) {
                    Integer a = Integer.parseInt(o1 + o2);
                    Integer b = Integer.parseInt(o2 + o1);
                    return a.compareTo(b) * -1;
                } else {
                    return c2 - c1;
                }
            }
            // 다른 분의 풀이 : 애초에 각각 합쳐서 비교하여 정렬
//            @Override
//            public int compare(String o1, String o2) {
//                return ((o2 + o1).compareTo(o1 + o2));
//            }
        });
        System.out.println(Arrays.toString(arr));

        for(String str :  arr) {
            answer += str;
        }

        // 만약 문자열이 0으로만 구성되어있으면 처리
//        if(Long.parseLong(answer) == 0) {
//            answer = "0";
//        }

        // 배열의 첫 번째, 즉 첫 번째 자리가 0일때 예외처리
        if(arr[0].equals("0"))
            answer = "0";



        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {30, 34, 5, 9, 31,3,4};
//        int[] numbers = {6, 2, 10, 0};
//        int[] numbers = {0, 0, 0};
        solution(numbers);
    }
}
