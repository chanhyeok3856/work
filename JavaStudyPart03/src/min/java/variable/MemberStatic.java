package min.java.variable;

public class MemberStatic {
	// 스테틱 멤버 변수를 선언한다.
	static String name;
	public static int age;
	// 스테틱 블록을 선언하여 스테틱 멤버 변수를 초기화한다.
	static {
		age = 33;

	}

	public static void main(String[] args) {
		// 스테틱 멤버 변수의 초깃값을 출력하며 아무 값도 할당되지 않았으므로 null이 출력된다.
		System.out.println(name);
// 스테틱 멤버 변수에 값을 할당한다.
		name = "홍길동";
		System.out.println(name);
		System.out.println(MemberStatic.age);
	}
}
