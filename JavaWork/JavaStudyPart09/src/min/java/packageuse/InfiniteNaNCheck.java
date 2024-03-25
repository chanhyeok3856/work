package min.java.packageuse;

public class InfiniteNaNCheck {
	public static void main(String[] args) {
		// 1.0을 0.0으로 나눈다.
		double value1 = 1.0 / 0.0;
		// 나눗셈의 결과는 무한대인 Infinity 값을 출력한다.
		System.out.println("결괏값 : " + value1);
		// 주어진 부동소수점 값이 Infinity인지를 판별하여 검사한다.
		if (Double.isInfinite(value1)) {
			System.out.println("무한대인 infinite 값입니다.");
		} else {
			System.out.println("무한대가 아닌 결괏값 : " + value1);
		}
		// 0.0을 0.0으로 나눈다.
		double value2 = 0.0 / 0.0;
		// 나눗셈의 결과는 숫자가 아닌 NaN(Not-a-Number) 값을 출력한다.
		System.out.println("결괏값 : " + value2);
		// 주어진 부동소수점 값이 NaN인지 판별하여 검사한다.
		if (Double.isNaN(value2)) {
			System.out.println("숫자가 아닌 NaN 값입니다.");
		} else {
			System.out.println("NaN이 아닌 결괏값 : " + value2);
		}

	}

}
