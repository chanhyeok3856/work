package min.java.array;

public class ArrayBrace {
	public static void main(String[] args) {
		// 브레이스({ }) 기호를 사용하여 배열을 초기화하고 값을 할당하며 배열의 크기가 4인 1차원 배열을 선언한다.
		String[] name = { "홍길동", "전우치", "임꺽정", "조세형" };
		// 각각의 문자열에 대해 탐색하며 각 반복에서 string 변수는 배열의 현재 요소를 참조한다.
		for (String string : name) {
			// 각 요소가 반복될 때마다 현재 참조 중인 배열 요소의 값을 출력한다.
			System.out.println(" 배열값 : " + string);
		}
	}
}