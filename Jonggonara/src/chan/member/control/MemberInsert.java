package chan.member.control;

import java.util.ArrayList;
import java.util.Scanner;

import chan.member.dao.MemberDAO;
import chan.member.dto.MemberDTO;
public class MemberInsert  {
	
	public void execute(Scanner scanner) {
		System.out.println();
		System.out.println("======본인인증======");
		System.out.println("휴대폰 번호를 입력하세요.");
		MemberDAO memberDAO = new MemberDAO();
		ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>( );
		arrayList = memberDAO.memberSelectAll( );
		System.out.println("휴대폰 번호 : ");
		String phonenumber = scanner.next();
		System.out.println("통신사");
		System.out.println("선택해 주세요 (sk/kt/lg) : ");
		String company = scanner.next();
		System.out.println("주민등록번호 :");
		String idnumber = scanner.next();
		System.out.println(" 이름 :");
		String name = scanner.next();
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setPhonenumber(phonenumber);
		memberDTO.setCompany(company);
		memberDTO.setIdnumber(idnumber);
		memberDTO.setName(name);
		memberDAO.memberInsert(memberDTO);
		System.out.println("가입이 완료되었습니다.");
		}
		
	}
	


