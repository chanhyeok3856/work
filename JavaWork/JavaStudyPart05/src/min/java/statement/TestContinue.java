package min.java.statement;

public class TestContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			// i 변수가 짝수인지 판별한다.
			if (i % 2 == 0) {
				// i 변수가 짝수일 때 남은 반복문을 건너뛰고 다음 반복으로 이동한다.
				continue;
			}
			// i 변수가 홀수일 때만 i 변숫값을 출력한다.
			System.out.println(i);
		}
	}
}