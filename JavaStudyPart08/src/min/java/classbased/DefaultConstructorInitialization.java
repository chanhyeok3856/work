package min.java.classbased;

public class DefaultConstructorInitialization {
	int num = 300;

	// 기본 생성자를 명시적으로 호출하고 초기화한다.
	public DefaultConstructorInitialization() {
		// num 멤버 변수에 값을 할당한다.
		num = 200;
		// num 로컬 변수에 값을 할당한다.
		int num = 100;
		System.out.println("기본 생성자의 num 로컬 변숫값 : " + num);
	}
}