package min.java.array;

public class DeepCopy {
	public static void main(String[] args) {
		// 원본 배열을 선언하고 초기화한다.
		int[] original = { 1, 4, 6, 9 };
		System.out.println("original 주소값 : " + original);
		// 원본 배열의 참조값을 copyFrom 배열 변수에 얕은 복사를 하고 할당한다.
		int[] copyFrom = original;
		System.out.println("copyFrom 주소값 : " + copyFrom);
		// copyFrom 배열 변수를 깊은 복사하여 새로운 배열 copyTo 배열 변수를 생성한다.
		int[] copyTo = (int[]) copyFrom.clone();
		System.out.println("copyTo 주소값 : " + copyTo);
		// copyTo 배열 변수의 각 요소를 출력한다.
		for (int i = 0; i < copyTo.length; i++) {
			System.out.println("배열의 깊은 복사[" + i + "] : " + copyTo[i] + "  ");
		}
	}
}