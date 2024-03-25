package min.java.classbased.member;

public class MemberData {
	// MemberDTO 타입의 배열을 선언하고 크기가 2인 배열을 생성하여 초기화한다.
	public static MemberDTO[] memberDTOs = new MemberDTO[2];

	// 기본 생성자를 호출하고 memberDTOs 배열의 각 요소를 MemberDTO 객체로 초기화한다.
	public MemberData() {
		// 배열은 같은 타입만을 저장할 수 있으므로 memberDTO 타입의 객체를 배열 요소에 값을 저장한다.
		memberDTOs[0] = new MemberDTO("홍길동", 33);
		memberDTOs[1] = new MemberDTO("전우치", 30);
	}

}
