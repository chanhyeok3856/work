package chan.member.control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import chan.member.dao.MemberDAO;
import chan.member.view.MemberMain;
import chan.member.dto.MemberDTO;

public class MemberDelete {
	public void execute(Scanner scanner) {
		System.out.println();
		System.out.println("==회원 삭제==");
		MemberDAO memberDAO = new MemberDAO();
		
		ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>( );
		//왜 들어오는지 이해x
		arrayList = memberDAO.memberSelectAll( );
		System.out.println("삭제할 이름을 조회하세요.");
		for(chan.member.dto.MemberDTO memberDTO : arrayList) {
			System.out.print("이름 : ");
			String name = scanner.next();
			memberDTO = memberDAO.memberNameCheck(name);
			if(memberDTO.getName()==null) {
				System.out.println("삭제할 회원이 없습니다. 다시 입력하세요");
			}else {
				System.out.println("삭제할 아이디가 있습니다.");
				System.out.print("회원에서 탈퇴하시겠습니까?(y/n)");
				String choice = scanner.next();
				switch(choice) {
				case"y":
					memberDAO.memberDelete(name);
					System.out.println("삭제하였습니다.");
					break;
				case"n":
					System.out.println("취소하였습니다.");
					MemberMain.main(null);
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
				}
			}
		}
		
	}
}
