package min.java.classbased;

public class AbstractCall {
	public static void main(String[ ] args) {
		// 인스턴스를 선언한다.
		AbstractAB abstractAB = new AbstractAB( );
		// 인스턴스로 메서드를 호출한다.
		abstractAB.methodA( );
		// 인스턴스로 메서드를 호출한다.
		abstractAB.methodB( );
	}
}