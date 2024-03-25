package min.java.statement;

public class WhileCompareDowhile {
	public static void main(String[] args) {
		int i = 0;
		// 조건이 먼저 평가되고 조건이 참일 때만 명령문이 실행된다.
		while (i >= 1) {
			System.out.println("조건이 맞으면 실행한다.");
		}
		// 명령문이 먼저 실행되고 이후에 조건을 확인한다.
		do {
			System.out.println("조건이 맞지 않아도 실행한다.");
			// i 변수가 0이므로 조건은 거짓이 되어 두 번째 반복은 발생하지 않는다.
		} while (i >= 1);
	}
}