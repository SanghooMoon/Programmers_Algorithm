import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> board = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            board.put(name[i], yearning[i]);
        }

        int i = 0;
        for (String[] photoNames : photo) {
            for (String inName : photoNames) {
                answer[i] += board.getOrDefault(inName, 0);
            }
            i++;
        }
        
        return answer;
    }
}