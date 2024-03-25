package chan.db.main;

import java.util.Scanner;

import chan.member.control.MemberDelete;
import chan.member.control.MemberSelect;
import chan.member.control.MemberUpdate;

public class DbMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("===관리자 메뉴===");
			System.out.print("1.회원 조회");
			System.out.print("2.회원 수정");
			System.out.print("3.회원 삭제");
			System.out.println("4.종료");
			System.out.println("메뉴 번호 선택하세요.");
			System.out.println("메뉴 번호 입력:");
			String menu = scanner.next();
			switch(menu) {
				case"1":
					MemberSelect memberSelect = new MemberSelect();
					memberSelect.execute(scanner);
					break;
				case"2":
					MemberUpdate memberUpdate = new MemberUpdate();
					memberUpdate.execute(scanner);
					break;
				case"3":
					MemberDelete memberDelete = new MemberDelete();
					memberDelete.execute(scanner);
					break;
				case"4":
					System.exit(0);
					break;
			}
		}while(true);
	}
}
