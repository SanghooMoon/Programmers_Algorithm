class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");

        for (String word : arr) {
            if (word.length() == 0) {
                answer += " ";
            } else {
                answer += word.substring(0, 1).toUpperCase();
                answer += word.substring(1).toLowerCase();
                answer += " ";
            }
        }

        if (s.charAt(s.length() - 1) == ' ') {
            for (int i = answer.length(); i < s.length(); i++) {
                answer += " ";
            }
            return answer;
        }
        return answer.substring(0, answer.length() - 1);
    }
}