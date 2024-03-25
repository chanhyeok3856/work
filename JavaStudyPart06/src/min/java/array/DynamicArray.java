package min.java.array;

public class DynamicArray {
	public static void main(String[] args) {
		// 배열의 크기가 3행인 2차원 동적 배열을 선언한다.
		int[][] num = new int[3][];
		// 0행에 해당하는 3개 열을 배정한다.
		num[0] = new int[3];
		// 1행에 해당하는 2개 열을 배정한다.
		num[1] = new int[2];
		// 2행에 해당하는 1개 열을 배정한다.
		num[2] = new int[1];
		char c = 'A';
		// 각 배열의 위치에 아스키 문자 A를 순차적으로 증가시키며 할당하고 이를 int 타입으로 변환하여 저장한다.
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				// 각 배열의 위치에 아스키 문자 A부터 순차적으로 할당하고 할당 후 char 타입의 c 변숫값을 1 증가시킨다.
				num[i][j] = c++;
			}
		}
		// 배열의 행과 열을 반복하면서 배열의 값을 char 타입으로 변환하여 출력한다.
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				// int 타입의 배열값을 char 타입으로 변환하고 이를 통해 숫자가 아닌 원래의 문자값을 확인하여 출력한다.
				System.out.println("num[" + i + "][" + j + "] = " + (char) num[i][j]);
			}
		}
	}
}