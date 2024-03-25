package min.java.statement;

public class ThreeMultiplicationTable {
	public static void main(String[] args) {
		// n 변수를 선언하고 초깃값을 1로 설정하며 이 변수는 구구단의 곱셈 결과에 사용된다.
		int n = 1;
		System.out.println("구구단 3단");
		// 조건을 확인하기 전에 코드 블록의 내용을 최소한 한 번은 실행한다.
		do {
			System.out.println(" " + 3 + "*" + n + "=" + (3 * n));
			// n 변수를 1씩 증가시킨다.
			n = n + 1;
			// 조건식에 의해서 n 변수가 10 미만인 동안 반복이 지속되고 n 변수가 10이 되면 조건식이 거짓이 되어 반복이 종료된다.
		} while (n < 10);
	}
}