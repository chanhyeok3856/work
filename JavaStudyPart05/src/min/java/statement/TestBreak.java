package min.java.statement;

public class TestBreak {
	public static void main(String[] args) {
		int i = 0;
		// i 변수가 10 이하일 동안 반복한다.
		while (i <= 10) {
			System.out.println(i + ". 파이팅!");
			// i 변숫값을 1씩 증가시킨다.
			i++;
			if (i == 4) {
				// i 변숫값이 4가 되면 반복문을 즉시 중단하고 벗어난다.
				break;
			}
		}
	}
}