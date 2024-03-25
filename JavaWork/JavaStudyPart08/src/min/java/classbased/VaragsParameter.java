package min.java.classbased;

public class VaragsParameter {
	// 매개 변수가 가변 인자인 메서드를 선언한다.
	public void variableArgument(String... names) {
		// 각 가변 인자를 반복하여 출력한다.
		for (String string : names) {
			System.out.print(string);
		}
		System.out.println();
	}
}