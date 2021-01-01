package baekjoon.LEV_08_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 월드전자는 노트북을 제조하고 판매하는 회사이다. 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며, 
 * 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
 * 예를 들어 A=1,000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 열 대 생산하는 데는 총 1,700만원이 든다.
 * 노트북 가격이 C만원으로 책정되었다고 한다. 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다 많아지게 된다. 
 * 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.
 * A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
 */
public class 손익분기점 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		// C-B 는 순수익입니당. 고정비용/순수익을하면 손익분기점 직전의 판매대수를 얻을 수 있고, 한대를 더 팔아서 손익분기점을 맞이합니당.
		int A = Integer.parseInt(st.nextToken());			// 고정비용 - A
		int B = Integer.parseInt(st.nextToken());			// 가변비용 - B
		int C = Integer.parseInt(st.nextToken());			// 한대 당 판매가격 - C
		
		if(B>=C) System.out.println(-1);
		else System.out.println((A/(C-B))+1);
		
//		System.out.println((B>=C) ? -1 : (A/(C-B))+1);
	}

	private static void math_method_1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] arr = input.split(" ");
		
		final int A = Integer.parseInt(arr[0]);		// 고정비용 - A
		int B = Integer.parseInt(arr[1]);			// 가변비용 - B
		int C = Integer.parseInt(arr[2]);			// 한대 당 판매가격 - C
		int pureBenefit = C - B;
		
		System.out.println((B>=C) ? -1 : (A/pureBenefit)+1);
	}

	private static void method_1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] arr = input.split(" ");
		
		final int FIX_COST = Integer.parseInt(arr[0]);	// 고정비용 - A
		int variableCost = Integer.parseInt(arr[1]);	// 가변비용 - B
		int price = Integer.parseInt(arr[2]);			// 한대 당 판매가격 - C
		
		int totalPrice = 0;			// 총 수입
		int totalCost = FIX_COST;	// 총 비용 = 고정비용 + 가변비용
		int count = 0;				// 판매 개수
		
		// 수익이 절대 나지 않는 경우 예외처리
		if(variableCost >= price) {	
			System.out.println(-1); 
			return;
		} else {
			// 한대 판매 총 수입이 총 비용보다
			while(totalPrice<=totalCost) {
				totalCost += variableCost;	// 가변 비용 누적
				totalPrice += price;		// 판매 가격 누적
				count++;					// 판매 개수 누적
			}
		}
		System.out.println(count);
	}

}
