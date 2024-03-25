package min.java.statement;

public class NumberSize {
	public static void main(String[] args) {
		int x = 1;
		int y = 10;
		int z = 100;
		// 첫 번째 조건식에서 y 변숫값이 x 변숫값보다 큰지 검사한다.
		if (y > x) {
			// y 변숫값이 x 변숫값보다 클 때 두 번째 조건식에서 y 변숫값이 z 변숫값보다 작은지 검사한다.
			if (y < z) {
				System.out.println("y는 x보다 크고 y는 z보다 작다.");
				// y 변숫값이 z 변숫값보다 작지 않을 때 이를 출력한다.
			} else {
				System.out.println("y는 x보다 크고 y는 z보다 크다.");
			}
			// y 변숫값이 x 변숫값보다 크지 않을 때 이를 출력한다.
		} else {
			System.out.println("y는 x보다 작다.");
		}
	}
}