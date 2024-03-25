package min.java.array;

public class ArrayInt {
	public static void main(String[] args) {
		// 배열의 크기가 5인 1차원 배열을 선언하고 값을 할당한다.
		int[] score = new int[5];
		score[0] = 78;
		score[1] = 97;
		score[2] = 85;
		// score[3]의 값이 할당되지 않았으므로 기본값인 0이 된다.
		// score[3] = 99;
		score[4] = 91;
		// 배열 변수의 크기만큼 반복하며 i 변수는 score 변수의 length보다 작을 때까지만 반복한다.
		for (int i = 0; i <= score.length; i++) {
			System.out.println("배열값 : " + score[i]);
		}
	}
}