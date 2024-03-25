package min.java.classbased;

// 이름 없는 익명 클래스를 선언한다.
class InnerAnonymous {
	public void change() {
		System.out.print("변경하고 ");
	}
}

// 이름 있는 클래스를 선언한다.
public class RealName {
	public static void main(String[] args) {
		// 익명 클래스를 통해 InnerAnonymous 클래스를 상속하여 change 메서드를 오버라이드한다.
		InnerAnonymous innerAnonymous = new InnerAnonymous() {
			// 메서드를 오버라이드하고 한 번만 수행한다.
			@Override
			public void change() {
				super.change();
				// 메서드에 내용을 추가한다.
				System.out.println("확인한다.");
			}
			// 익명 클래스는 세미콜론(;)으로 종료한다.
		};
		innerAnonymous.change();
	}
}