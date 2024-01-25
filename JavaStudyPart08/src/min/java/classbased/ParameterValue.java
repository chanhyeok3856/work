package min.java.classbased;

public class ParameterValue {
// 두 개의 int 타입인 매개 변수를 가지는 스테틱 메서드를 선언한다.
	public static void call(int x, int y) {
// int 타입의 j 변수를 x 매개 변숫값까지 1씩 증가하여 반복 호출하여 x 만큼의 행을 갖는 2차원 * 패턴을 생성한다.
		for (int j = 0; j < x; j++) {
// int 타입의 i 변수를 y 매개 변숫값까지 1씩 증가하여 반복 호출하여 각 행에 y 만큼의 *를 출력한다.
			for (int i = 0; i < y; i++) {
				System.out.print("*");
			}
// 행이 끝나면 새로운 줄로 이동한다.
			System.out.println();
		}
	}

	public static void main(String[] args) {
// call 메서드에 매개 변수 3과 5를 전달하여 호출한다.
		call(11, 5);
	}
}