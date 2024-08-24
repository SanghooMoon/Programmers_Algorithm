import java.util.*;

class Solution {
    public int[] solution(String s) {
        StringBuilder str = new StringBuilder();
        List<String> tupleSetList = new ArrayList<>();
        char[] chars = s.toCharArray();

        for (int i = 2; i < chars.length - 1; i++) {
            if (Character.isDigit(chars[i]) || (chars[i] == ',' && str.length() > 0)) {
                str.append(chars[i]);
            } else if (chars[i] == '}') {
                tupleSetList.add(str.toString());
                str = new StringBuilder();
            }
        }

        tupleSetList.sort(Comparator.comparingInt(String::length));
        int[] answer = new int[tupleSetList.size()];

        int idx = 0;
        for (String tupleSet : tupleSetList) {
            int[] numCount = new int[100001];
            for (int answerNumber : answer) {
                numCount[answerNumber]++;
            }

            for (String splitStr : tupleSet.split(",")) {
                int num = Integer.parseInt(splitStr);
                if (--numCount[num] < 0) {
                    answer[idx++] = num;
                    break;
                }
            }
        }
        
        return answer;
    }
}