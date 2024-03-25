package min.java.classbased;

public class Message {
	// 인스턴스 코드 블록을 선언하고 인스턴스를 호출할 때마다 실행한다.
	{
		System.out.println("인스턴스 코드 블록 실행");
	}
	// 스테틱 코드 블록을 선언하고 인스턴스 개수와 관계없이 한 번만 실행한다.
	static {
		System.out.println("스테틱 코드 블록 실행");
	}

	// 메서드로 코드 블록을 실행한다.
	void call1( ) {
		System.out.println("이름으로 인스턴스 코드 블록 실행");
	}

	// 스테틱 메서드로 코드 블록을 실행한다.
	static void call2( ) {
		System.out.println("이름으로 스테틱 코드 블록 실행");
	}
}