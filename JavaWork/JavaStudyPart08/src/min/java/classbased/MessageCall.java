package min.java.classbased;

public class MessageCall {
	public static void main(String[] args) {
		// 인스턴스를 선언한다.
		Message message1 = new Message();
		// 인스턴스를 선언한다.
		Message message2 = new Message();
		// 인스턴스를 선언한다.
		Message message3 = new Message();
		@SuppressWarnings("unused")
		Message message4 = new Message();
		// 인스턴스로 메서드에 접근하여 호출한다.
		message1.call1();
		// 인스턴스로 메서드에 접근하여 호출한다.
		message2.call1();
		// 인스턴스로 메서드에 접근하여 호출한다.
		message3.call1();
		// 클래스로 스테틱 메서드에 접근하여 호출한다.
		Message.call2();
	}
}
