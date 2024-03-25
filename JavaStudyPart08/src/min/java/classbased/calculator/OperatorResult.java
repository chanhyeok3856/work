package min.java.classbased.calculator;

public class OperatorResult {
	// 연산 결과를 호출하는 스테틱 메서드를 선언한다.
	public static void result(int a, char b, int c, int d) {
		System.out.println();
		System.out.println("연산 결과");
		// 연결 연산자로 연산 결과를 표현하고 출력한다.
		System.out.print(a + " " + b + " " + c);
		System.out.println(" = " + d);
	}
}