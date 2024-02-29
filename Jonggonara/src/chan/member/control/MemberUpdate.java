package chan.member.control;

import java.util.ArrayList;
import java.util.Scanner;

import chan.member.dao.MemberDAO;
import chan.member.dto.MemberDTO;

public class MemberUpdate {
	
	public void execute(Scanner scanner) {
		System.out.println( );
		System.out.println("==회원 수정 페이지==");
		MemberDAO memberDAO = new MemberDAO( );
		ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>( );
		arrayList = memberDAO.memberSelectAll( );
		System.out.println("회원 정보를 수정하세요.");
		for(MemberDTO memberDTO : arrayList) {
			System.out.print("이름 ");
			String name = scanner.next( );
			memberDTO = memberDAO.memberNameCheck(name);
			System.out.println( );
			if(memberDTO.getName( ) == null) {
				System.out.println("이름이 없습니다. 다시 입력하세요.");
			} else {
				
				System.out.println( );
				System.out.println("이름이 있습니다. 수정하세요.");
				
				memberDTO = memberDAO.memberSelect(name);
				
				System.out.println("핸드폰번호 : " + memberDTO.getPhonenumber( ));
				System.out.print("수정할 핸드폰번호 : ");
				String phonenumber = scanner.next( );
				
				
				System.out.println("통신사 : " + memberDTO.getCompany( ));
				System.out.print("수정할 통신사 : ");
				String company = scanner.next( );
				
				System.out.println("주민등록번호 : " + memberDTO.getIdnumber( ));
				System.out.print("수정할 주민등록번호 : ");
				String idnumber = scanner.next( );
			
				
				memberDTO.setPhonenumber(phonenumber);
				memberDTO.setCompany(company);
				memberDTO.setIdnumber(idnumber);
				memberDTO.setName(name);
				// memberDTO 인스턴스로 수정한 데이터를 반환한다.
				memberDAO.memberUpdate(memberDTO);
				System.out.println("회원 정보를 수정하였습니다.");
				
			}
		}
	}
}