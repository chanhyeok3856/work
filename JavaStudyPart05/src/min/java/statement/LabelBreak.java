package min.java.statement;

public class LabelBreak {
	public static void main(String[] args) {
		// 레이블 ForLabel을 선언한다.
		ForLabel: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {
				if (j == 10) {
					// j 변수가 10이 될 때 레이블 ForLabel의 반복문을 완전히 종료한다.
					break ForLabel;
				}
				// 구구단의 곱셈 결과를 출력한다.
				System.out.println(i + "*" + j + "=" + i * j + " ");
			}
		}
	}
}