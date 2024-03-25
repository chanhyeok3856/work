package min.java.operation;

public class Comparison {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		// > 연산자로 a 변숫값과 b 변숫값을 비교하면 a의 값이 b보다 크므로 true를 반환하고 출력한다.
		System.out.println("a > b : " + (a > b));
		// >= 연산자로 a 변숫값과 b 변숫값을 a의 값이 b보다 크거나 같으므로 true를 반환한다.
		System.out.println("a >= b : " + (a >= b));
		// < 연산자로 a 변숫값과 b 변숫값을 a의 값이 b보다 작으므로 false를 반환한다.
		System.out.println("a < b : " + (a < b));
		// <= 연산자로 a 변숫값과 b 변숫값을 a의 값이 b보다 작거나 같지 않으므로 false를 반환한다.
		System.out.println("a <= b : " + (a <= b));
		// == 연산자로 a 변숫값과 b 변숫값을 a와 b의 값이 같지 않으므로 false를 반환한다.
		System.out.println("a == b : " + (a == b));
		// != 연산자로 a 변숫값과 b 변숫값을 a와 b의 값이 다르므로 true를 반환한다.
		System.out.println("a != b : " + (a != b));
		String str = "안녕";
		// instanceof 연산자로 String 타입인 str이 String 클래스의 인스턴스인지 확인하고 같은 타입이므로 true를 반환한다.
		System.out.println("객체 확인 : " + (str instanceof String));
	}
}