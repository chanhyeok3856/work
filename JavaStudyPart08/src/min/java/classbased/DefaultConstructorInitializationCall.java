package min.java.classbased;

public class DefaultConstructorInitializationCall {
	public static void main(String[] args) {
		// DefaultConstructorInitialization 클래스의 인스턴스를 생성하며
		// DefaultConstructorInitialization의 기본 생성자가 호출된다.
		DefaultConstructorInitialization defaultConstructorInitialization = new DefaultConstructorInitialization();
		// num 인스턴스로 멤버 변수의 값을 출력한다.
		System.out.println("num 멤버 변숫값 : " + defaultConstructorInitialization.num);
	}
}