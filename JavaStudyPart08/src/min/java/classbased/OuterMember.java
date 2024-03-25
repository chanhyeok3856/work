package min.java.classbased;

public class OuterMember {
	int i = 10;
	private int j = 20;
	static int k = 30;

	class InnerMember {
		public void call() {
			// 외부 클래스의 인스턴스 변수에 접근하여 출력한다.
			System.out.println("i 변숫값 : " + i);
			// 외부 클래스의 private 인스턴스 변수에 접근하여 출력한다.
			System.out.println("j 변숫값 : " + j);
			// 외부 클래스의 스테틱 변수에 접근하여 출력한다.
			System.out.println("k 변숫값 : " + k);
		}
	}

	public static void main(String[] args) {
		// 외부 클래스의 인스턴스를 선언한다.
		OuterMember outerMember = new OuterMember();
		// 외부 클래스 인스턴스를 사용해 내부 클래스의 인스턴스를 선언한다.
		OuterMember.InnerMember innerMember = outerMember.new InnerMember();
		// innerMember 인스턴스로 call 메서드를 호출한다.
		innerMember.call();
	}
}