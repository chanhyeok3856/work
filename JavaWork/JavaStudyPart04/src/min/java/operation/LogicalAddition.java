package min.java.operation;

public class LogicalAddition {
	public static void main(String[] args) {
		// 이진수로 변환하면 1010이 된다.
		int number1 = 10;
		// 이진수로 변환하면 1100이 된다.
		int number2 = 12;
		// 비트에 대해 논리합(OR) 연산을 수행하며 같은 위치의 비트가 모두 0일 경우에만 결과 비트가 0이 된다.
		int result = number1 | number2;
		System.out.println("number1 변수의 이진수 : " + Integer.toBinaryString(number1));
		System.out.println("number2 변수의 이진수 : " + Integer.toBinaryString(number2));
		System.out.println("버티컬바 연산의 결과 : " + result + " (이진수: " + Integer.toBinaryString(result) + ")");
	}
}
