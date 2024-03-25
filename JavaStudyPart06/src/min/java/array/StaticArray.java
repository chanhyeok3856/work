package min.java.array;

public class StaticArray {
	public static void main(String[] args) {
		// 배열의 크기가 3행 2열인 2차원 정적 배열을 선언한다.
		int[][] num = new int[3][2];
		char c = 'A';
		// 각 배열의 위치에 아스키 문자 A를 순차적으로 증가시키며 할당하고 이를 int 타입으로 변환하여 저장한다.
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = c++;
			}
		}
		// 배열의 행과 열을 반복하면서 배열의 값을 char 타입으로 변환하여 출력한다.
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("num[" + i + "][" + j + "] = " + (char) num[i][j]);
			}
		}
	}
}