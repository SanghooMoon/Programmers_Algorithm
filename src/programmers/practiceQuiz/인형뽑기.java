package programmers.practiceQuiz;

import java.util.ArrayList;
import java.util.Stack;

public class 인형뽑기 {

	public static int solution(int[][] board, int[] moves) {

		int answer = 0;
		ArrayList<Stack<Integer>> list = new ArrayList<Stack<Integer>>();
		Stack<Integer> result = new Stack<Integer>();

		// 인형뽑기 보드판 생성
		for (int i = 0; i < board.length; i++) { // 0,1,2,3,4
			Stack<Integer> stack = new Stack<Integer>();
			for (int j = board.length - 1; j >= 0; j--) { // 4 3 2 1 0
				if (board[j][i] != 0) {
					stack.push(board[j][i]);
				}
			}
			list.add(stack);
		}

		System.out.println("======================보드판 생성=====================");
		System.out.println(list);
		System.out.println("===================================================");

		// 동작
		for (int i = 0; i < moves.length; i++) {
			// 해당 스택을 가져옵니다.
			Stack<Integer> thisStack = list.get(moves[i] - 1);
			if (thisStack.size() == 0)
				continue; // 꺼내려고 하는데 아무것도 없다면 건너뜀
			// 결과 스택에 꺼내온 인형 저장
			int popResult = thisStack.pop();
			// 결과 스택에 아무것도 없다면 저장
			if (result.size() == 0) {
				result.push(popResult);
				continue;
			}
			// 만약 꺼내온 인형과, 결과스택의 마지막인형이 일치한다면, 저장하지않고 결과 스택 pop
			if (popResult == result.lastElement()) {
				// Boom
				result.pop();
				answer += 2;
			} else {
				// 그렇지 않다면 결과스택에 저장
				result.push(popResult);
			}
		}

		System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {
		int[][] board = {
				{ 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 3 },
				{ 0, 2, 5, 0, 1 },
				{ 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 }
		};
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		solution(board, moves);

	}

}
