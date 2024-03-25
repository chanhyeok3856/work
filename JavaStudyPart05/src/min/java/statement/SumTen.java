package min.java.statement;

public class SumTen {
	public static void main(String[] args) {
		// 총합을 저장할 변수를 선언하고 초기화한다.
		int total = 0;
		// 1부터 10까지 반복한다.
		for (int i = 1; i <= 10; i++) {
			// total 변수에 int 타입의 i 변수를 더한 후에 다시 total 변수에 할당한다.
			total = total + i;
		}
		// 총합을 출력한다.
		System.out.println("1에서 10까지 총합계는 " + total + "입니다.");
	}
}