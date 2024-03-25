package min.java.classbased;

public class DataTypeReturn {
	// int 타입의 매개 변수 두 개를 받아 덧셈을 수행하고 결과를 반환하는 스테틱 메서드를 선언한다.
	public static int call(int a, int b) {
		// 두 매개 변수를 더하고 그 결과를 c 변수에 저장한다.
		int c = a + b;
		// 더하기 연산의 결과를 c 변수에 반환한다.
		return c;
	}

	public static void main(String[] args) {
		// call 메서드를 호출하여 더하기 연산의 결과를 출력한다.
		System.out.print("더하기 연산의 결괏값 : " + call(4, 3));
	}
}