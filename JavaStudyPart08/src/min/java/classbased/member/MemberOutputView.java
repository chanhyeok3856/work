package min.java.classbased.member;

public class MemberOutputView {
	// 회원 정보를 출력하는 스테틱 메서드를 정의한다.
	public static void result(MemberDTO memberDTO) {
		System.out.println(memberDTO.getName() + " 회원의 정보입니다.");
		System.out.println("이름 : " + memberDTO.getName());
		System.out.println("나이 : " + memberDTO.getAge());
	}
}
