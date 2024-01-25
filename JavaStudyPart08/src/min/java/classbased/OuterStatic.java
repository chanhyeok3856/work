package min.java.classbased;

public class OuterStatic {

	int a = 10;
	@SuppressWarnings("unused")
	private int b = 20;
	static int c = 30;

	static class InnerStatic {
		static int d = 40;

		public void call() {
			// 스테틱 중첩 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없으므로 주석을 제거하면 에러가 발생한다.
			// System.out.println(a);
			// 스테틱 중첩 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없으므로 주석을 제거하면 에러가 발생한다.
			// System.out.println(b);
			System.out.println("c 변숫값 : " + c);
			System.out.println("d 변숫값 : " + d);
		}
	}

	public static void main(String[] args) {
// 외부 클래스의 인스턴스를 생성하지 않고 직접 내부 클래스의 인스턴스를 선언한다.
		OuterStatic.InnerStatic innerStatic = new OuterStatic.InnerStatic();
		innerStatic.call();
	}
}