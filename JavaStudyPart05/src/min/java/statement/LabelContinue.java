package min.java.statement;

public class LabelContinue {
	public static void main(String[] args) {
		// ContinueLabel이라는 레이블을 선언하고 첫 번째 for 문에 붙인다.
		ContinueLabel: for (int i = 2; i <= 3; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5) {
					// j 변수가 5일 때 현재 순환을 중지하고 레이블이 붙은 바깥쪽 for 문의 다음 순환으로 이동한다.
					continue ContinueLabel;
				}
				// j 변수가 5가 아닐 때만 구구단을 출력한다.
				System.out.println(i + "*" + j + "=" + i * j + " ");
			}
		}
	}
}