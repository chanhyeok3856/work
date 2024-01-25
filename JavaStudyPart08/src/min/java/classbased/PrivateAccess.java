package min.java.classbased;

public class PrivateAccess {
	// 클래스 내부에서만 접근할 수 있는 num 멤버 변수를 선언한다.
	private int num = 40;

	// num 멤버 변수의 값을 반환하는 public 메서드를 선언한다.
	public int getNum() {
		return num;
	}
}