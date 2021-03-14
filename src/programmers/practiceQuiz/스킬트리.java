package programmers.practiceQuiz;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/49993
 */
public class 스킬트리 {

	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        char[] skills = skill.toCharArray();
        int[] array = new int[skill.length()];
        
        for(String st : skill_trees) {
        	boolean isFlag = true;
        	
        	// array배열에 각 skill 순서 표시, 없으면 0
        	for(int i=0; i<skills.length; i++) {
        		array[i] = st.indexOf(skills[i])+1;
        	}

        	// 마지막 스킬을 배웠는데, 이전 스킬들이 없거나, 스킬 순서를 지키지 않으면 false
        	validate : for(int j=array.length-1; j>=0; j--) {
        		if(array[j] > 0) {
        			for(int k=j-1; k>=0; k--) {
        				if(array[k] == 0 || array[k] > array[j]) {
        					isFlag = false;
        					break validate;
        				}
        			}
        		}
        	}
        	if(isFlag) answer++;
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		solution(skill, skill_trees);
	}

}
