public class DefaultAccessCall {
	public static void main(String[] args) {
		// DefaultAccess 클래스의 객체를 생성하고 그 참조를 defaultAccess 변수에 저장한다.
		DefaultAccess defaultAccess = new DefaultAccess();
		// 같은 패키지 내에서이므로 default 접근 제한자로 선언된 num 멤버 변수에 접근하여 33을 할당한다.
		defaultAccess.num = 33;
		// defaultAccess 객체의 num 멤버 변수 값을 출력한다.
		System.out.println("num 인스턴스 멤버 변숫값 : " + defaultAccess.num);
	}
}