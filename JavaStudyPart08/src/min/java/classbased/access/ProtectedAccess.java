package min.java.classbased.access;

public class ProtectedAccess {
	// public 접근 제한자를 사용하므로 어디서든 접근할 수 있다.
	public int i = 100;

	// protected 접근 제한자를 통해 같은 패키지나 상속받은 클래스에서 접근할 수 있다.
	protected void inheritance() {
		System.out.println("i 멤버 변숫값 : " + i + "  ");
	}
}