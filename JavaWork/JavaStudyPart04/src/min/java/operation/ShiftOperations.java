package min.java.operation;

public class ShiftOperations {
	public static void main(String[] args) {
		// << 연산자를 사용하여 4를 2비트 왼쪽으로 이동시킨다. 이는 4를 2의 2승만큼 곱한 것과 같으며, 결과는 16이다.
		System.out.println("4 << 2 = " + (4 << 2));
		// >> 연산자를 사용하여 4를 2비트 오른쪽으로 이동시킨다. 이는 4를 2의 2승만큼 나눈 것과 같으며, 결과는 1이다.
		System.out.println("4 >> 2 = " + (4 >> 2));
		// >>> 연산자를 사용하여 4를 2비트 오른쪽으로 이동시킨다. 4는 양수이므로 >>와 >>>는 같은 결과를 가져오며 결과는 1이다.
		System.out.println("4 >>> 2 = " + (4 >>> 2));
		// >>> 연산자를 사용하여 -1을 1비트 오른쪽으로 이동하면 최상위 비트가 0으로 채워져 결과는 2의 31승인 2147483647이 된다.
		System.out.println("-1 >>> 1 = " + (-1 >>> 1));

		for (int i = 0; i < args.length; i++) {

		}

	}

}
