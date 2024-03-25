package min.java.variable;

public class ParameterVariable {
	// 매개변수가 char 타입인 c와 int 타입인 i인 스테틱 메서드를 선언한다.
	public static void parameterMethod(char c, int i) {
		System.out.println("성별 : " + c);
		System.out.println("나이 : " + i);
	}

	public static void main(String[] args) {
		// char 타입의 변수를 선언하고 남을 할당한다.
		char c = '남';
		// int 타입의 변수를 선언하고 33을 할당한다.
		int i = 33;
		// parameterMethod 메서드를 호출하며 매개변수로 c와 i를 전달한다.
		parameterMethod(c, i);
	}
}