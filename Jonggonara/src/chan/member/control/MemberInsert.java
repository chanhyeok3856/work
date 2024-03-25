package chan.member.control;

import java.util.ArrayList;
import java.util.Scanner;

import chan.member.dao.MemberDAO;
import chan.member.dto.MemberDTO;
public class MemberInsert  {
	
	public void execute(Scanner scanner) {
		MemberDAO MemberDAO = new MemberDAO( );
		MemberDTO MemberDTO = new MemberDTO( );
		ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>( );
		System.out.println("부서를 등록하세요.");
		System.out.print("부서 번호 : ");
		int Memberno = scanner.nextInt( );
		// 가변 배열에 추가한 전체 데이터를 반환하여 arrayList 인스턴스로 할당하고 할당하지 않으면 null 값이 반환된다. 
		arrayList = MemberDAO.memberSelectAll( );
		
		// 저장된 데이터를 반복하여 출력한다. 
		for(MemberDTO MemberDTO2 : arrayList) {
		// ==(더블 이퀄) 연산자로 조건을 입력한 Memberno 변숫값을 확인한다. 
			if(MemberDTO2.getPhonenumber( ) == Phonenumber) {
		System.out.println("이미 등록한 핸드폰번호가 있습니다.");
		return;
		}
		}
		System.out.print("부서 이름 : ");
		String dname = scanner.next( );
		System.out.print("지역 : ");
		String loc = scanner.next( );
		Object name;
		// 입력된 데이터를 반환하여 MemberDTO 인스턴스로 할당하고 할당하지 않으면 null 값이 반환된다. 
		MemberDTO = MemberDAO.memberInsert(phonenumber);
		System.out.println("새로운 부서를 등록했습니다.");
		}
		}