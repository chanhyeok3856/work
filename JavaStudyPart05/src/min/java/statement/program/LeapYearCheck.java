package min.java.statement.program;

import java.util.Scanner;

public class LeapYearCheck {
	// scanner 스테틱 멤버 변수를 선언하며 private 접근 제한자는 LeapYearCheck 클래스에서만 사용할 수 있도록 제한한다.
	private static Scanner scanner;

	public static void main(String[ ] args) {
		int year;
		// 키보드에 입력된 입력 스트림으로 새로운 텍스트 스캔을 생성하고 scanner 멤버 변수에 할당한다.
		scanner = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		year = scanner.nextInt( );
		// 윤년 구하는 공식을 조건으로 설정하고 연산자 우선순위로 윤년을 계산하여 확인한다.
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
	}
}