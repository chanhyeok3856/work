package min.java.classbased;

import min.java.classbased.access.PublicAccess;

public class PublicAccessCall {
	public static void main(String[] args) {
		// PublicAccess 클래스의 인스턴스를 생성한다.
		PublicAccess publicAccess = new PublicAccess();
		// public 접근 제한자로 선언된 num 인스턴스 멤버 변수는 외부에서 접근할 수가 있으며 num 변수에 값을 할당한다.
		publicAccess.num = 40;
		// PublicAccess 클래스의 num 인스턴스 멤버 변수의 값을 출력한다.
		System.out.println("num 인스턴스 멤버 변숫값 : " + publicAccess.num);
	}
}