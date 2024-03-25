package min.java.classbased;

public class MethodName {
	// 매개 변수가 없는 스테틱 메서드를 선언한다.
	public static void call() {
		System.out.print("여러분 ");
	}

	public static void main(String[] args) {
		// call 메서드의 이름인 call에 의해 호출되고 코드 블록에 있는 내용을 실행한다.
		call();
		System.out.println("반갑습니다.");
	}
}