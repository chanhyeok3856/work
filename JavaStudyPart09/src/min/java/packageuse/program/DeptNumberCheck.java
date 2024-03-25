package min.java.packageuse.program;

import java.util.Scanner;

public class DeptNumberCheck {
	public static void main(String[] args) {
		String deptNumber;
		// 유효한 부서 번호가 입력됐는지 확인하는 변수를 초기화한다.
		boolean isValid = false;
		// Scanner 객체를 생성하여 사용자의 키보드 입력을 처리한다.
		Scanner scanner = new Scanner(System.in);
		// 부서 번호를 잘못 입력하면 다시 입력할 수 있도록 수행한다.
		do {
			System.out.print("부서 번호 입력 : ");
			deptNumber = scanner.next();
			// deptNumber 변숫값이 0부터 99 사이의 숫자로 이루어진 문자열인지를 확인한다.
			if (deptNumber.matches("^[0-9]{1,2}$")) {
				// deptNumber 변숫값인 문자열을 정수로 변환한 값을 저장한다.
				int deptno = Integer.parseInt(deptNumber);
				System.out.println(deptno + "번의 부서 번호를 입력했습니다.");
				isValid = true;
			} else {

				// deptNumber 변수의 조건을 만족하지 않을 때 출력한다.
				System.out.println(deptNumber + " 번호는 올바른 부서 번호가 아닙니다. 번호는 0부터 99까지의 정수입니다.");
			}
		} while (!isValid);
		// Scanner 객체를 닫아 리소스를 해제한다.
		scanner.close();
	}

}