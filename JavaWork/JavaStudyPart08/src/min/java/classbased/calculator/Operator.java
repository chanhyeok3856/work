package min.java.classbased.calculator;

public class Operator {
	// int 타입의 두 정수를 더하기 연산하는 스테틱 메서드를 선언한다.
	public static int plu(int x, int y) {
		return x + y;
	}

	// int 타입의 두 정수를 빼기 연산하는 스테틱 메서드를 선언한다.
	public static int min(int x, int y) {
		return x - y;
	}

	// int 타입의 두 정수를 곱하기 연산하는 스테틱 메서드를 선언한다.
	public static int mul(int x, int y) {
		return x * y;
	}

	// int 타입의 두 정수를 나누기 연산하는 스테틱 메서드를 선언한다.
	public static int div(int x, int y) {
		return x / y;
	}
}