package min.java.classbased.program;

public class AbstractCall {
	public static void main(String[ ] args) {
		// 스테틱 메서드로 직접 접근하여 인스턴스를 선언한다.
		AbstractInstance abstractInstance = AbstractInstance.getInstance( );
		// 인스턴스로 익명 중첩 클래스로 생성한 추상 메서드의 메서드를 호출한다.
		abstractInstance.call( );
	}
}