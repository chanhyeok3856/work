package min.java.operation;

public class Complement {
	public static void main(String[] args) {
		// 양의 정수를 선언한다.
		int number1 = 3;
		// 음의 정수를 선언한다.
		int number2 = -3;
		// ~ 연산자로 number1의 비트를 반전시킨 후, 1을 더하여 2의 보수를 구하고 양수를 음수로 바꾼다.
		int complement = ~number1 + 1;

		System.out.println("음수 변환값 : " + complement);
		// ~ 연산자로 number2의 비트를 반전시킨 후, 1을 더하여 2의 보수를 구하고 음수를 양수로 바꾼다.
		complement = ~number2 + 1;
		System.out.println("양수 변환값 : " + complement);

	}
}
