package min.java.classbased.member;

import java.util.Scanner;

public class MemberInputView {
	private static Scanner scanner;

	public static void main(String[] args) {
		MemberSearchCheck memberSearchCheck = new MemberSearchCheck();
		scanner = new Scanner(System.in);
		// 사용자로부터 입력받은 이름으로 회원 정보를 검색하는 작업을 반복한다.
		do {
			System.out.print("검색할 이름: ");
			String name = scanner.next();
			// 사용자가 입력한 이름으로 회원 정보가 있는지 확인한다.
			boolean searchResult = memberSearchCheck.check(name);
			// 검색한 회원의 이름을 확인한다.
			if (searchResult) {
				// 기존의 회원이면 회원 정보를 호출하고 반복문을 빠져나온다.
				break;
			}
			System.out.println("해당 회원이 없습니다.");
		} while (true);
	}
}
