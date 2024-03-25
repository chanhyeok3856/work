package min.java.packageuse.program;

import java.util.Scanner;

public class NationalCapital {
	// 입력을 위한 스캐너 객체를 스테틱 멤버 변수로 선언한다.
	private static Scanner scanner;

	public static void main(String[] args) {
		// 키보드에 입력된 입력 스트림으로 새로운 텍스트 스캔을 생성하고 인스턴스를 선언하고 사용자로부터 입력받을 준비를 한다.
		scanner = new Scanner(System.in);
		String capital = "서울";
		String string = "";
		System.out.println("나라의 수도 이름을 입력하세요.");
		// 사용자가 정답을 맞출 때까지 반복해서 검색한다.
		do {
			System.out.print("대한민국 수도 이름: ");
			// 사용자로부터 정수를 입력받아 string 변수에 저장한다.
			string = scanner.next();
			// 문자열의 입력값으로 대한민국 수도 일치 여부를 확인하며 외부 입력이므로 더블 이퀄(==) 연산자를 사용할 수 없다.
			if (string.equals(capital)) {
				System.out.println("정답입니다.");
				System.out.println("대한민국의 수도는 " + capital + "입니다.");
				// 코드 블록을 문을 빠져나와서 프로그램을 실행하므로 프로그램이 종료하지 않고 재실행한다.
				continue;
			}
			System.out.println("정답이 아닙니다. 다시 입력해 주세요.");
		} while (true);
	}
}