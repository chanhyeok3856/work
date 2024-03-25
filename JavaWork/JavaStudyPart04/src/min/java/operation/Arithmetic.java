package min.java.operation;

public class Arithmetic {
	public static void main(String[] args) {
		// a 로컬 변수를 선언하고 5를 할당한다.
		int a = 5;
		// b 로컬 변수를 선언하고 2를 할당한다.
		int b = 2;
		// a 로컬 변수와 b 로컬 변수를 + 연산자로 더하여서 sum 로컬 변수에 할당한다.
		int sum = a + b;
		System.out.println("a + b= " + sum);
		// a 로컬 변수와 b 로컬 변수를 - 연산자로 빼서 sub 로컬 변수에 할당한다.
		int sub = a - b;
		System.out.println("a - b = " + sub);
		// a 로컬 변수와 b 로컬 변수를 * 연산자로 곱하여서 mul 로컬 변수에 할당한다.
		int mul = a * b;
		System.out.println("a * b = " + mul);
		// a 로컬 변수와 b 로컬 변수를 / 연산자로 나누어서 div 로컬 변수에 할당한다.
		float div = (float) a / b;
		System.out.println("a / b = " + div);
		// a 로컬 변수와 b 로컬 변수를 % 연산자로 나눈 나머지를 mod 로컬 변수에 할당한다.
		int mod = a % b;
		System.out.println("a % b = " + mod);
	}
}