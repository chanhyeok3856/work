package min.java.classbased;

public class MemberSuperCall {
	public static void main(String[] args) {
		MemberSuperInherit memberSuperInherit = new MemberSuperInherit();
		// superVar 메서드를 호출하면 super 지시어에 의해서 슈퍼 클래스의 멤버 변수를 반환한다.
		System.out.print("슈퍼 클래스의 멤버 변숫값 : " + memberSuperInherit.superVar());
	}
}