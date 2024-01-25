package min.java.classbased;

// MemberSuper 클래스를 상속받아 MemberSuperInherit 클래스를 선언한다.
public class MemberSuperInherit extends MemberSuper {
	// 슈퍼 클래스의 멤버 변수명과 같은 멤버 변수를 선언한다.
	public String name;

	String superVar() {
		name = "전우치";
		// 슈퍼 클래스의 멤버 변수를 호출하므로 멤버 변숫값은 홍길동을 반환한다.
		return super.name;
	}
}