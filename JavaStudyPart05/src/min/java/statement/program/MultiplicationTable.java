package min.java.statement.program;

public class MultiplicationTable {
	public static void main(String[] args) {
		// 2부터 9까지 반복하여 단을 출력한다.
		for (int i = 2; i < 10; i++) {
			// 1부터 9까지 반복하여 각 단의 곱셈 결과를 출력한다.
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "x" + j + "=" + i * j);
				// 공백 문자를 이용하여 각 곱셈 결과를 구분한다.
				System.out.print(" ");
			}
			// 각 단이 끝나면 줄을 바꾼다.
			System.out.println();
		}
	}
}