package 실습;

import java.io.IOException;

public class friday {
	public static void main(String[] args) throws IOException {
		char ada;
		System.out.println("용어 설명");
		System.out.print(" 1. 객체  ");
		System.out.print(" 2. 클래스  ");
		System.out.println(" 3. 메서드  ");
		System.out.print("원하는 번호를 입력하세요: ");
		
		ada = (char)System.in.read();
		
		switch (ada) {
		case '1':
			System.out.println("객체 : 정보를 관리하기 위한 논리적인 단위이다.");
			break;
			
		case '2':
			System.out.println("클래스 : 객체를 생성하는 집단이다.");
			break;
			
		case '3':
			System.out.println("메서드 : 정보를 전달하는 매개체다.");
			break;



		default:
System.out.println("선택하신 번호가 잘못되었습니다.");
			break;
		}
	}

}
