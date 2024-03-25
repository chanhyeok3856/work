package chan.dept.view;

import java.util.Scanner;

import chan.dept.control.DeptSelect;

public class DeptView {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		do {
			System.out.println("\n번호를 입력하세요."); 
			System.out.println("1.부서 전체 조회 "+"2.부서 등록 "+"3.부서 수정 "+"4.부서 삭제 "+"5.부서 상세 조회 "+"6.종료");
			System.out.print("번호 입력 : ");
			String choice = scanner.next();
			switch (choice) {
			case "1":
				DeptSelect deptSelect = new DeptSelect();
				deptSelect.execute(scanner);
				break;

			default:
				break;
			}
		} while (true);
	}

}
