package min.java.operation;

public class Circumflex {
	public static void main(String[] args) {

		// 1차원 정수 배열을 선언하며 중복되는 값들과 유일한 값이 함께 있다.
		int[] array = { 4, 2, 4, 5, 2, 3, 3 };
		// 중복되지 않은 유일한 값을 찾기 위한 변수를 초기화하며 초깃값은 0이다.
		int result = 0;
		// 배열의 모든 요소에 대해 XOR 연산을 for문으로 수행한다. 이를 통해 중복된 숫자들은 서로 상쇄되어 0이 되고 유일한 값만 남게된다.
		for (int i = 0; i < array.length; i++) {
//			System.out.println("현재 result: " + Integer.toBinaryString(result) + " (10진수 : " + result + ")");
//			System.out.println("현재 arr[" + i + "]: " + Integer.toBinaryString(arr[i]) + " (10진수 : " + arr[i] + ")");
			result = result ^ array[i];
//			System.out.println("XOR 연산 결과: " + Integer.toBinaryString(result) + " (10진수 : " + result + ")");
//			System.out.println("----------------------");
		}

		System.out.println("배열의 유일값 : " + result);

	}
}
