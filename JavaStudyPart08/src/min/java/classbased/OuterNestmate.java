package min.java.classbased;

public class OuterNestmate {

	// 스테틱 중첩 클래스를 선언한다.
	static class InnerNestmate {

		// 내부 클래스의 private 메서드를 선언한다.
		private void privateMethod() {
			System.out.println("내부 private 메서드에 접근한다.");
		}

		// private 메서드를 호출하는 public 메서드를 선언한다.
		public void callPrivateMethod() {
			privateMethod();
		}
	}

	public static void main(String[] args) {
		// 외부 클래스의 인스턴스를 생성하지 않고 직접 내부 클래스의 인스턴스를 선언한다.
		OuterNestmate.InnerNestmate innerNestmate = new OuterNestmate.InnerNestmate();
		// 중첩 클래스의 public 메서드를 호출한다.
		innerNestmate.callPrivateMethod();
	}
}
