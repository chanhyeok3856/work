package min.java.packageuse;

public class NumberRandom {
	public static void main(String[] args) {
		// 0.0 이상 1.0 미만의 실수형 난수를 생성한 후 100을 곱하고 1을 더하여 값의 범위가 1부터 100 사이의 정수로 변환한다.
		int i = (int) (Math.random() * 100) + 1;
		System.out.println("1부터 100 사이의 난수 : " + i);
	}
}