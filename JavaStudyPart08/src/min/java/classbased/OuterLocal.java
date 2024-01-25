package min.java.classbased;

public class OuterLocal {
	// 멤버 변수를 선언한다.
	public int i = 100;

	// 메서드를 선언한다.
	public void outerCall() {
		// 로컬 변수를 상수처럼 final 키워드로 선언해야 사용할 수 있으며 JDK 8 버전부터는 생략할 수 있다.
		final int j = 50;
		class InnerLocal {
			// 내부 클래스의 메서드를 선언한다.
			public void innerCall() {
				System.out.println("멤버 변숫값 : " + i);
				System.out.println("메서드 내의 상숫값 : " + j);
			}
		}
		// 내부 클래스의 인스턴스를 생성하고 호출한다.
		InnerLocal innerLocal = new InnerLocal();
		innerLocal.innerCall();
	}

	public static void main(String[] args) {
		// 외부 클래스의 인스턴스를 생성하고 호출한다.
		OuterLocal outerLocal = new OuterLocal();
		outerLocal.outerCall();
	}
}