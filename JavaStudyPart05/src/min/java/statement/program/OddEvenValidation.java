package min.java.statement.program;

import java.util.Scanner;

public class OddEvenValidation {
	public static void main(String[] args) {
		int num;
		// 키보드에 입력된 입력 스트림으로 새로운 텍스트 스캔을 생성하고 인스턴스를 선언하고 사용자로부터 입력받을 준비를 한다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		// 사용자로부터 정수를 입력받아 num 변수에 저장한다.
		num = scanner.nextInt();
		// 입력받은 숫자가 홀수인지 판단한다.
		if (num % 2 == 1) {
			System.out.println("홀수를 선택하셨습니다.");
			// 입력받은 숫자가 짝수인지 판단한다.
		} else {
			System.out.println("짝수를 선택하셨습니다.");
		}
		// 리소스를 해제하며 리소스 해제는 메모리 해제 또는 메모리 삭제로 이해하면 된다.
		scanner.close();
	}
}