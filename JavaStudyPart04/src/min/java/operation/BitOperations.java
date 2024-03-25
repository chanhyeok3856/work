package min.java.operation;

public class BitOperations {
	public static void main(String[ ] args) {
		// 앰퍼샌드 연산자로 비트 연산을 하여 2진수를 10진수로 변환하여 호출하고 출력한다.
		System.out.println("a & b = " + (10 & 12));
		// 버티컬바 연산자로 비트 연산을 하여 2진수를 10진수로 변환하여 호출하고 출력한다.
		System.out.println("a | b = " + (10 | 12));
		// 서컴플렉스 연산자로 비트 연산을 하여 2진수를 10진수로 변환하여 호출하고 출력한다.
		System.out.println("a ^ b = " + (10 ^ 12));
		// 틸드 연산자로 비트 연산을 하여 2진수를 10진수로 변환하여 음수를 호출하고 출력한다.
		System.out.println("~a = " + (~3));
	}
}