package min.java.packageuse;

import java.util.Random;

public class RandomGeneration {
	public static void main(String[] args) {
		// Random 객체를 생성한다.
		Random random = new Random();

		// 0 이상 100 미만의 정수 난수를 생성한다.
		int randomNumber = random.nextInt(100);
		System.out.println("랜덤 정숫값 : " + randomNumber);

		// 0.0 이상 1.0 미만의 부동소수점 난수를 생성한다.
		double randomDouble = random.nextDouble();
		System.out.println("랜덤 부동소수점 값 : " + randomDouble);

		// 평균 0이고 표준편차 1의 가우스 분포를 따르는 난수를 생성한다.
		double gaussianRandom = random.nextGaussian();
		System.out.println("랜덤 가우스 분포값 : " + gaussianRandom);
	}
}