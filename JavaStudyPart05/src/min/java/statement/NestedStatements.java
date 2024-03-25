package min.java.statement;

public class NestedStatements {
	public static void main(String[] args) {
		// i 변수는 1부터 시작하여 2까지 1씩 증가한다.
		for (int i = 1; i <= 2; i++) {
			// j 변수는 1부터 시작하여 3까지 1씩 증가한다. 이 반복문은 외부 반복문의 각 순회마다 실행된다.
			for (int j = 1; j <= 3; j++) {
				// 현재 외부 반복문과 내부 반복문의 카운터 값을 출력한다.
				System.out.println("밖의 for 문 출력: " + i + " 안의 for 문 출력 = " + j);
			}
		}
	}
}