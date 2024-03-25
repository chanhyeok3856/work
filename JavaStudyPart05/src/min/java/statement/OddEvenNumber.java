package min.java.statement;

public class OddEvenNumber {
	public static void main(String[] args) {
		// int 타입인 i 변수를 선언하고 9를 할당한다.
		int i = 9;
		// i 변숫값을 2로 나누었을 때 나머지가 1이면 i 변숫값은 홀수다.
		if (i % 2 == 1) {
			System.out.println(i + "는 홀수다.");
			// i 변숫값을 2로 나누었을 때 나머지가 1이 아니면 i 변숫값은 짝수다.
		} else {
			System.out.println(i + "는 짝수다.");
		}
	}
}