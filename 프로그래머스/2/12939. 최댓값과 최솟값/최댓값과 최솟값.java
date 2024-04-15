class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        
        for (String num : s.split(" ")) {
            int value = Integer.valueOf(num);
            minValue = Math.min(minValue, value);
            maxValue = Math.max(maxValue, value);
        }
        answer.append(minValue).append(" ").append(maxValue);
        
        return answer.toString();
    }
}