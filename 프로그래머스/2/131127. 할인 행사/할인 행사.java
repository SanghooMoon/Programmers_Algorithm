import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> map = new HashMap<>(wantMap);

            for (int j = i; j < i + 10; j++) {
                if (map.getOrDefault(discount[j], -1) <= 0) {
                    break;
                }
                map.put(discount[j], map.get(discount[j]) - 1);
                
                if (j == i + 9) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}