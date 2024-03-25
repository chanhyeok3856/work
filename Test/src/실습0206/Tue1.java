package 실습0206;

import java.util.Iterator;
import java.util.Scanner;

public class Tue1 {
	//입력을 위한 스캐너 객체를 선언한다.
	private static Scanner scanner;
	public static void main(String[] args) {
		String name[] = {"홍길동","전우치","임꺽정"};
		//Scanner 객체를 사용하여 사용자의 키보드 입력을 처리.
		scanner = new Scanner(System.in);
		int num= -1;
		do {
			System.out.println("검색할 이름을 입력하세요.");
			System.out.print("이름 : ");
			String obj = scanner.next();
			for (int i = 0; i < name.length; i++) {
				if (obj.equals(name[i])) {
					num=i;
				}
			}
			if (num !=-1) {
				System.out.println(obj + "배열의 "+ "인덱스 번호는"+num+"입니다.");
				break;
			}
			System.out.println("해당하는 이름이 존재하지 않습니다.");
		} while (true);
	}
		
	}


