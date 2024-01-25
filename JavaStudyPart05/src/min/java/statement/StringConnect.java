package min.java.statement;

public class StringConnect {
	public static void main(String[] args) {
		// 빈 문자열을 초깃값으로 가지는 string 변수를 선언한다.
		String string = "";
		// 0부터 4까지 1씩 증가시키면서 반복한다.
		for (int i = 0; i < 5; i++) {
			// int 타입의 i 변숫값을 문자열 형태로 표현하고 연결 연산자로 문자열을 연결하여 문자열에 재할당한다.
			string = string + Integer.toString(i);
			// 주석을 제거하면 중간 문자열 객체 생성을 확인할 수 있고 각 단계에서의 문자열 변화를 확인할 수 있다.
			// System.out.println(string);
		}
		// 모든 반복이 끝난 후에 최종적으로 연결된 문자열을 출력한다.
		System.out.println(string);
	}
}