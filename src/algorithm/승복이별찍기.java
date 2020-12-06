package algorithm;

public class 승복이별찍기 {

	public static void main(String[] args) {
		
		int line = 4;
		
		for(int i=1; i<=line; i++) {
			
			String str = "";
			
			// 공백(3 > 2 > 1 > 0)
			for(int empty=line; empty<line; empty++) {	
				str += " ";
			}
			
			// 별(1 > 3 > 5 > 7) -> line * 2 - 1
			for(int star=1; star<=line*2-1; star++) {
				str += "*";
			}
			
			// 출력
			System.out.println(str);
		}
		
	}

}
