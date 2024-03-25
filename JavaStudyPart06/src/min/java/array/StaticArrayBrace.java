package min.java.array;

public class StaticArrayBrace {
	public static void main(String[] args) {
		// 배열의 크기가 3행 2열인 2차원 정적 배열을 선언하고 문자열 배열을 초기화한다.
		String[][] name = { { "홍길동", "전우치" }, { "임꺽정", "장길산" }, { "일지매", "조세형" } };
		// 배열의 원소를 탐색하여 2차원 배열의 각 행에 대해서 반복한다.
		for (String[] strings : name) {
			// 배열의 실제값을 하나씩 각 행에 속한 열의 값을 반복해서 출력한다.
			for (String string : strings) {
				System.out.println(string);
			}
		}
	}
}