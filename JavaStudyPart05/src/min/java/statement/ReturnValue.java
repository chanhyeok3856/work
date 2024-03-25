package min.java.statement;

public class ReturnValue {
	// 두 개의 int 타입 매개변수를 받아 그 합을 반환하는 스테틱 메서드를 선언한다.
	public static int sum(int num1, int num2) {
		// num1 변수와 num2 변수를 더한 값을 result 변수에 저장한다.
		int result = num1 + num2;
		// 덧셈 연산 결과를 내부에서 출력한다.
		System.out.println(result);
		// 덧셈 연산의 결과를 호출한 곳으로 반환한다.
		return result;
	}

	public static void main(String[] args) {
		// 호출하여 출력하며 sum 메서드 내부에서 이미 결과를 출력하므로 이 문이 실행되면 결과가 한 번 더 출력된다.
		sum(5, 2);
		// 덧셈 연산 결과를 외부에서 직접 출력한다.
		System.out.println("더하기 연산 결괏값 : " + sum(5, 2));
	}
}