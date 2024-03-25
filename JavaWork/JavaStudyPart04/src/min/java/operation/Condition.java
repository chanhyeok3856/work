package min.java.operation;

public class Condition {
	public static void main(String[] args) {
		// a 로컬 변수를 선언하고 12를 할당한다.
		int a = 12;
		// b 로컬 변수를 선언하고 4를 할당한다.
		int b = 4;
		// 조건 연산자를 사용하여 a와 b를 비교하고 a가 b보다 큰 경우 a를 c에 할당하고 그렇지 않은 경우 b를 c에 할당한다.
		int c = (a > b) ? a : b;
		System.out.println("조건식의 비교한 c 변수의 값은 " + c + "다.");
	}
}