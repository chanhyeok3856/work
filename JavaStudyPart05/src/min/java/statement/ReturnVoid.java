package min.java.statement;

public class ReturnVoid {
	// 두 개의 int 타입 매개 변수를 받아 그 합을 내부에서 출력하는 스테틱 메서드를 선언한다.
	public static void sum(int num1, int num2) {
		// num1 변수와 num2 변수를 더한 값을 result 변수에 저장한다.
		int result = num1 + num2;
		// 덧셈 연산 결과를 내부에서 출력한다.
		System.out.println(result);
		// 메서드는 반환값을 가지지 않으므로 return 문은 생략할 수 있으며 여기서는 명시적으로 사용되었다.
		return;
	}

	public static void main(String[] args) {
		// 메서드를 호출하며 결과를 내부에서 바로 출력하므로 덧셈 결과가 한번 출력된다.
		sum(5, 2);
		// 반환값을 가지지 않으므로 이를 출력하거나 다른 연산에 사용하려 하면 컴파일 오류가 발생하며 주석을 제거하면 예외가 발생한다.
		// System.out.println("더하기 연산 결괏값 : " + sum(5, 2));
	}
}