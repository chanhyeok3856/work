package chan.member.control;

import java.util.Scanner;

import chan.member.dao.MemberDAO;
import chan.member.dto.MemberDTO;

public class MemberSelectDetail {
	public void execute(Scanner scanner) {
		do {
			MemberDAO memberDAO = new MemberDAO( );
			MemberDTO memberDTO = new MemberDTO( );
			System.out.println("검색할 이름을 입력하세요.");
			System.out.print("이름 : ");
			String name = scanner.next( );
			// 입력한 아이디 데이터를 반환하여 memberDTO 인스턴스로 할당하고 할당하지 않으면 null 값이 반환된다.
			memberDTO = memberDAO.memberSelect(name);
			String phonenumber = memberDTO.getPhonenumber( );
			String company = memberDTO.getCompany( );
			String idnumber = memberDTO.getIdnumber( );
			
			if(memberDTO.getName( ) == null) {
				System.out.println( );
				System.out.println("존재하는 이름이 없습니다.");
			} else {
			
				System.out.print("1.핸드폰번호: " + phonenumber + "  ");
				System.out.print("2.통신사: " + company + "  ");
				System.out.print("3.주민등록번호: " + name + "  ");
				System.out.print("4.이름: " + name + "  ");
				
				System.out.println( );
				return;
			}
		} while(true);
	}
}
