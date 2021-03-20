package programmers.practiceQuiz;

public class 신규아이디추천 {
	
	public static String solution(String new_id) {
		String answer = "";
        new_id = new_id.toLowerCase().replaceAll("[^0-9a-zA-Z-_.]", "")
                                     .replaceAll("[.]{2,}", ".")
                                     .replaceAll("^[.]|[.]$", "");
        
        StringBuilder sb = new StringBuilder(new_id);
        
        if("".equals(sb.toString())) {
            sb = new StringBuilder("a");
        }
        
        if(sb.length() >= 16) {
            sb = new StringBuilder(sb.substring(0, 15).replaceAll("[.]$", ""));
        }
        
        if(sb.length() <= 2) {
            String lastStr = sb.substring(sb.length()-1);
            
            while(sb.length() < 3) {
                sb.append(lastStr);
            }
        }
        answer = sb.toString();
        return answer;
    }
	
	public static void main(String[] args) {
		solution("...!@BaT#*..y.abcdefghijklm");
	}

}
