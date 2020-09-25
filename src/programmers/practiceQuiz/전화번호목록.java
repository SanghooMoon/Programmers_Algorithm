package programmers.practiceQuiz;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 
어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 *
 */
public class 전화번호목록 {

	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        /*
        // 문자열
        for(int i=0; i<phone_book.length-1; i++) {
        	int icode = phone_book[i].hashCode();
        	int length = phone_book[i].length();
        	
        	for(int j=i+1; j<phone_book.length; j++) {
        		if(phone_book[j].length() >= length && icode == phone_book[j].substring(0,length).hashCode()) {
        			return false;
        		} else if (phone_book[j].length() < length &&
        				   phone_book[j].hashCode() == phone_book[i].substring(0, phone_book[j].length()).hashCode() ) {
        			return false;
        		}
        	}
        }
        */
        
        
        HashSet<String> hs = new HashSet<String>();
        for(int i=0; i<phone_book.length; i++) {
        	hs.add(phone_book[i]);
        }
        
        // 문제의 분류에 맞게 Hash도 사용할 수 있음, 기본 로직은 동일할듯? (속도가 느림, 효율성 ㅠ-ㅠ )
        // 모든 경우의 수 확인을 위한 2중 for문
        for(int i=0; i<phone_book.length-1; i++) {
        	String str_i = phone_book[i];
        	for(int j=i+1; j<phone_book.length; j++) {
        		String str_j = phone_book[j];
        		// 하지만 i(비교주체)가 무조건 클 수 없기때문에 한번 확인 시 양방향 확인을 해야함 
        		
        		// 비교주체(i)가 비교대상(j)와 길이가 같거나 작다면, (i는 j의 접두사일 수 있다)
        		if(str_i.length() <= str_j.length()) {
        			if(str_j.indexOf(str_i) == 0) 	// i가 j에 포함되는 index가 0 즉 접두사라면 return
        				return false;	
        		// 비교주체(i)의 길이가 더 크다면, i가 j의 접두사일순 없다,( 반대로 j는 i의 접두사 일 수 있다.)
        		} else if(str_i.length() > str_j.length()) {
        			if(str_i.indexOf(str_j) == 0) {	// j가 i에 포함되는 index가 0 즉 접두사라면  return
        				return false;	
        			}
        		}
        	}
        }
        
        
        
        
        
   
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		String[] phone_book = {"1","2","3","4","5","6","7"};
		solution(phone_book);
	}

}
