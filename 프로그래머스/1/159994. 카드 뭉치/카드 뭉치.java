import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        List<String> cardList1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> cardList2 = new ArrayList<>(Arrays.asList(cards2));

        for (String word : goal) {
            if (!cardList1.isEmpty() && word.equals(cardList1.get(0))) {
                cardList1.remove(0);
            } else if (!cardList2.isEmpty() && word.equals(cardList2.get(0))) {
                cardList2.remove(0);
            } else {
                answer = "No";
                break;
            }
        }

        return answer;
    }
}