package chan.member.control;

import java.util.ArrayList;
import java.util.Scanner;

import chan.member.dao.MemberDAO;
import chan.member.dto.MemberDTO;

public class MemberSelect {
	public void execute(Scanner scanner) {
		System.out.println( );
		System.out.println("==회원 조회 페이지==");
		System.out.println("번호를 선택하세요.");
		System.out.println("1.전체 회원 조회  2.개인 회원 조회 ");
		System.out.print("번호 : ");
		int choice = scanner.nextInt( );
		if(choice == 1) {
			ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>( );
			// 데이터베이스에 전송하는 메소드를 호출할 인스턴스를 선언한다.
			MemberDAO memberDAO = new MemberDAO( );
			// 가변 배열에 추가한 전체 데이터를 반환하여 arrayList 인스턴스로 할당하고 할당하지 않으면 null 값이 반환된다.
			arrayList = memberDAO.memberSelectAll( );
			
			System.out.println("---회원 정보---");
		
			for(MemberDTO memberDTO : arrayList) {
				String phonenumber = memberDTO.getPhonenumber( );
				String company = memberDTO.getCompany( );
				String idnumber = memberDTO.getIdnumber( );
				String name = memberDTO.getName( );
				
				System.out.print("1.핸드폰번호: " + phonenumber + "  ");
				System.out.print("2.통신사: " + company + "  ");
				System.out.print("3.주민등록번호: " + idnumber + "  ");
				System.out.print("4.이름: " + name + "  ");
				System.out.println( );
			}
		} else if(choice == 2) {
			MemberSelectDetail memberSelectDetail = new MemberSelectDetail( );
			memberSelectDetail.execute(scanner);
		} else {
			System.out.println("번호를 다시 입력하세요.");
			MemberSelect memberSelect = new MemberSelect( );
			memberSelect.execute(scanner);
		}
	}
}