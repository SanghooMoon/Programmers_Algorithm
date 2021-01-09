package leetCode.easy;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class _013_Roman_to_Integer {

	public static void main(String[] args) {
		romanToInt2("IV");
	}
	
	
	public static int romanToInt2(String s) {
		int value = 0;
		for(int i = 0; i < s.length() ; i++) {
			int j = i + 1;
			switch(s.charAt(i)) {
	            case 'I':
	                if(j < s.length() && s.charAt(j) == 'X'){
	                    value += 9;
	                    i++;
	                    break;
	                }
	                else if(j < s.length() && s.charAt(j) == 'V'){
	                    value += 4;
	                    i++;
	                    break;
	                }
	                else{
	                    value++;
	                    break;
	                }
	            case 'X':
	                if(j < s.length() && s.charAt(j) == 'L'){
	                    value += 40;
	                    i++;
	                    break;
	                }
	                else if(j < s.length() && s.charAt(j) == 'C'){
	                    value += 90;
	                    i++;
	                    break;
	                }
	                else{
	                    value += 10;
	                    break;
	                }
	            case 'C':
	                if(j < s.length() && s.charAt(j) == 'D'){
	                    value += 400;
	                    i++;
	                    break;
	                }
	                else if(j < s.length() && s.charAt(j) == 'M'){
	                    value += 900;
	                    i++;
	                    break;
	                }
	                else {
	                    value += 100;
	                    break;
	                }
	            case 'V':
	                value += 5;
	                break;
	            case 'L':
	                value += 50;
	                break;
	            case 'D':
	                value += 500;
	                break;
	            case 'M':
	                value += 1000;
	                break;
        	}
	    }
	    return value;
	}
	
	public static int romanToInt(String s) {
		LinkedHashMap<String, Integer> lhs = new LinkedHashMap<String, Integer>();
		lhs.put("CM", 900);
		lhs.put("CD", 400); lhs.put("XC", 90);
		lhs.put("XL", 40); lhs.put("IX", 9);
		lhs.put("IV", 4); 
		
		LinkedHashMap<String, Integer> lhs2 = new LinkedHashMap<String, Integer>();
		lhs.put("M", 1000);
		lhs.put("D", 500); lhs.put("C", 100);
		lhs.put("L", 50); lhs.put("X", 10);
		lhs.put("V", 5); lhs.put("I", 1); 
		
		int result = 0;
		for(String a : lhs.keySet()) {
			while(s.contains(a)) {
				s = s.replaceFirst(a+"{1}", "");
				System.out.println(s);
				result += lhs.get(a);
			}
		}
		
		for(String a : lhs2.keySet()) {
			while(s.contains(a)) {
				s = s.replaceFirst(a+"{1}", "");
				result += lhs.get(a);
			}
		}
        
        return result;
    }

}
