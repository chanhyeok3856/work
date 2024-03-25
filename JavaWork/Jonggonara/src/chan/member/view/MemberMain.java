package chan.member.view;

import java.util.Scanner;

import chan.db.main.DbMain;
import chan.member.control.MemberInsert;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println();
		System.out.println("=====중고나라=====");
		System.out.println("중고나라에 오신 것을 환영합니다.");
		System.out.print("1.네이버로 시작하기");
		System.out.print("2.카카오로 시작하기");
		System.out.print("3.휴대폰 번호로 시작하기");
		System.out.print("4.개발자 메뉴");
		System.out.println();
	    String menu = scanner.next();
	    switch (menu) {
		case "1":
			System.out.println("점검중입니다.");
			break;
		case "2":
			System.out.println("점검중입니다.");
			break;
		case "3":
			MemberInsert memberInsert = new MemberInsert();
			memberInsert.execute(scanner);
			break;
		case "4":
			DbMain.main(null);
			break;
		}
	} 
	}

