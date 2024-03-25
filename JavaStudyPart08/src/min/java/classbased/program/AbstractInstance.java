package min.java.classbased.program;

public abstract class AbstractInstance {
	// 추상 메서드를 선언한다.
	protected abstract void call();

	// 익명 중첩 클래스를 선언한다.
	static AbstractInstance abstractInstance = new AbstractInstance() {
		// 추상 메서드를 상속하여 { }(코드 블록)으로 메서드를 구현한다.
		@Override
		protected void call() {
			System.out.println("추상 메서드를 호출하여 인스턴스를 생성한다.");
		}
	};

	// 인스턴스를 생성할 AbstractInstance 추상 클래스 반환형인 스테틱 메서드를 선언한다.
	public static AbstractInstance getInstance() {
		return abstractInstance;
	}
}