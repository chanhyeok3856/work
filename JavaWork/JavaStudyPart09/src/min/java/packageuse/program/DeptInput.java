package min.java.packageuse.program;

import java.util.Scanner;

public class DeptInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DeptDTO deptDTO = new DeptDTO();

		// 부서 번호를 입력하고 유효성을 검사한다.
		do {
			System.out.print("부서 번호 입력 (0부터 99 사이의 숫자) : ");
			String deptNumber = scanner.next();
			if (DeptValidation.isValidDeptno(deptNumber)) {
				deptDTO.setDeptno(Integer.parseInt(deptNumber));
				// 유효한 입력일 때 루프를 종료한다.
				break;
			} else {
				System.out.println("유효한 부서 번호가 아닙니다. 다시 입력하세요.");
			}
		} while (true);

		// 부서 이름을 입력하고 유효성을 검사한다.
		do {
			System.out.print("부서 이름 입력 (2~4글자, 한글 또는 영문) : ");
			String dname = scanner.next();
			if (DeptValidation.isValidDname(dname)) {
				deptDTO.setDname(dname);
				// 유효한 입력일 때 루프를 종료한다.
				break;
				
			} else {
				System.out.println("유효한 부서 이름이 아닙니다. 다시 입력하세요.");
			}
		} while (true);

		// 부서 지역을 입력하고 유효성을 검사한다.
		do {
			System.out.print("부서 지역 입력 (2~4글자, 한글 또는 영문) : ");
			String loc = scanner.next();
			if (DeptValidation.isValidLoc(loc)) {
				deptDTO.setLoc(loc);
				// 유효한 입력일 때 루프를 종료한다.
				break;

			} else {
				System.out.println("유효한 부서 지역이 아닙니다. 다시 입력하세요.");
			}
		} while (true);

		// 입력된 정보를 출력한다.
		System.out.println("부서 번호: " + deptDTO.getDeptno() + ", 부서 이름: " + deptDTO.getDname() + ", 부서 지역: " + deptDTO.getLoc());

		// Scanner 객체 닫고 리소스를 해제한다.
		scanner.close();
	}
}
