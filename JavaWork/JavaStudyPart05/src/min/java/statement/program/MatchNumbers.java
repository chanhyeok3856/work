package min.java.statement.program;

import java.util.Scanner;

public class MatchNumbers {
	static Scanner scanner;

	public static void main(String[] args) {
		// 새로운 Scanner 객체를 생성하여 사용자로부터 키보드 입력을 받을 준비를 한다.
		scanner = new Scanner(System.in);
		// 1부터 100 사이의 난수를 발생시킨다.
		int i = (int) (Math.random() * 100) + 1;
		int num = 0;
		// do-while 문을 사용하여 사용자가 숫자를 맞출 때까지 반복한다.
		do {
			System.out.print("입력한 숫자: ");
			num = scanner.nextInt();
			if (num == i) {
				System.out.println("맞혔습니다.");
				// 맞춘 경우에 반복문을 종료한다.
				break;
			} else if (num < i) {
				System.out.println("맞출 숫자보다 작습니다.");
			} else {
				System.out.println("맞출 숫자보다 큽니다.");
			}
			// 조건식이 항상 참이므로 사용자가 정답과 맞출 때까지 계속해서 입력받을 수 있다.
		} while (true);
	}
}