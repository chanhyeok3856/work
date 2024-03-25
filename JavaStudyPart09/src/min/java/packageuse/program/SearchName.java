package min.java.packageuse.program;

import java.util.Scanner;

public class SearchName {
	// 입력을 위한 스캐너 객체를 선언한다.
	private static Scanner scanner;

	public static void main(String[] args) {
		String name[] = { "홍길동", "전우치", "임꺽정" };
		// 키보드에 입력을 위한 스캐너 객체를 초기화한다.
		scanner = new Scanner(System.in);
		// 검색된 이름의 인덱스를 초기화하여 저장하며 -1은 인덱스의 범위가 아니라는 의미다.
		int num = -1;
		do {
			System.out.println("검색할 이름을 입력하세요.");
			System.out.print("이름: ");
			String obj = scanner.next();
			for (int i = 0; i < name.length; i++) {
				// 배열의 인덱스를 검색하여 확인하고 사용자가 입력한 이름과 배열에 저장된 이름을 비교한다.
				if (obj.equals(name[i])) {
					num = i;
				}
			}
			// 이름이 배열에 있으면 인덱스 출력하고 반복문을 종료한다.
			if (num != -1) {
				System.out.println(obj + " 배열의 " + "인덱스 번호는 " + num + "입니다.");
				break;
			}
			System.out.println("해당하는 이름이 존재하지 않습니다.");
		} while (true);
	}
}