package min.java.variable;

public class VariableScope {
	// 스테틱 멤버 변수를 선언하고 값을 할당한다.
	static String str = "멤버 변수를 호출한다.";

	public static void main(String[ ] args) {
		// 스테틱 멤버 변수를 호출하여 출력한다.
		System.out.println(str);
		// 로컬 변수를 선언하고 값을 할당한다.
		String str = "로컬 변수를 호출한다.";
		// 로컬 변수를 호출하여 출력한다.
		System.out.println(str);
	}
}