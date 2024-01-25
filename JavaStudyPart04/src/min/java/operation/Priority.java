package min.java.operation;

public class Priority {
	public static void main(String[] args) {
		// 곱셈 연산자가 덧셈 연산자보다 우선순위가 높으므로 먼저 3 * 2를 계산한 후에 5를 더한다.
		int x = 5 + 3 * 2;
		// 퍼렌씨시스(( ))를 사용하여 덧셈 연산이 먼저 이루어지도록 강제로 우선순위를 변경한다.
		int y = (5 + 3) * 2;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}