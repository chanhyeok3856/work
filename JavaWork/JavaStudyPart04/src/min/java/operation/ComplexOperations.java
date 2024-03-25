package min.java.operation;

public class ComplexOperations {
	public static void main(String[ ] args) {
		int a = 10;
		int b = 10;
		// b 로컬 변수에 b 로컬 변수의 값인 10과 a 로컬 변수의 값인 10을 더해서 할당하며 b = b + a와 같다.
		b += a;
		System.out.println("10+10 = " + b);
		// b 로컬 변수에 b 로컬 변수의 값인 20과 a 로컬 변수의 값인 10을 빼서 할당하며 b = b - a와 같다.
		b -= a;
		System.out.println("20-10 = " + b);
		// b 로컬 변수에 b 로컬 변수의 값인 10과 a 로컬 변수의 값인 10을 곱해서 할당하며 b = b * a와 같다.
		b *= a;
		System.out.println("10x10 = " + b);
		// b 로컬 변수에 b 로컬 변수의 값인 100과 a 로컬 변수의 값인 10을 나누어서 할당하며 b = b / a와 같다.
		b /= a;
		System.out.println("100/10 = " + b);
		// b 로컬 변수에 b 로컬 변수의 값인 10과 a 로컬 변수의 값인 10을 나누어서 나머지를 할당하며 b = b % a와 같다.
		b %= a;
		System.out.println("10/10의 나머지는 " + b);
	}
}