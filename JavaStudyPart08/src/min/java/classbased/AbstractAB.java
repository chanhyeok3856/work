package min.java.classbased;

// AbstractB 추상 클래스에 의해서 AbstractAB 클래스를 선언한다.
public class AbstractAB extends AbstractB {
	@Override
	protected void methodA( ) {
		System.out.println("methodA 추상 메서드를 메서드로 구현한다.");
	}

	@Override
	protected void methodB( ) {
		System.out.println("methodB 추상 메서드를 메서드로 구현한다.");
	}
}