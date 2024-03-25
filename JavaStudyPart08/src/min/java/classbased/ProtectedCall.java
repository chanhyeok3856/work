package min.java.classbased;

import min.java.classbased.access.ProtectedAccess;

// extends 키워드로 ProtectedAccess 클래스를 상속하는 ProtectedCall 클래스를 선언한다.
public class ProtectedCall extends ProtectedAccess {
	// ProtectedAccess 클래스에서 상속받은 메서드를 호출하여 재사용할 메서드를 선언한다.
	public void call() {
		// 슈퍼 클래스인 ProtectedAccess 클래스의 메서드를 호출한다.
		inheritance();
	}

	public static void main(String[] args) {
		// ProtectedAccess 클래스로 직접 접근하지 못하므로 상속받은 ProtectedCall 클래스의 인스턴스를 생성하여 접근한다.
		ProtectedCall protectedCall = new ProtectedCall();
		// 상속받은 메서드를 호출한다.
		protectedCall.call();
	}
}