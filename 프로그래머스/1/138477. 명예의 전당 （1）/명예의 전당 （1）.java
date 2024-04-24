import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            int[] dayScores = Arrays.copyOfRange(score, 0, i + 1);
            int minScore = Integer.MAX_VALUE;

            if (i < k) {
                for (int s : dayScores) {
                    minScore = Math.min(minScore, s);
                }
                answer[i] = minScore;
                // answer[i] = Arrays.stream(dayScores).min().orElse(0);
            } else {
                Arrays.sort(dayScores);
                answer[i] = dayScores[dayScores.length - k];
            }
        }
        
        return answer;
    }
}