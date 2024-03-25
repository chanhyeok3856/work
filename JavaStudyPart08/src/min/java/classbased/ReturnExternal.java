package min.java.classbased;

public class ReturnExternal {
	// 문자열 반환 타입인 call 메서드를 선언한다.
	public String call() {
		return "https://www.google.com/";
	}

	public static void main(String[] args) {
		// ReturnExternal 클래스의 인스턴스를 생성하며 ReturnExternal의 기본 생성자가 호출된다.
		ReturnExternal returnExternal = new ReturnExternal();
		// call 메서드를 호출하여 결과를 출력하며 만약, void 반환 타입의 메서드일 때는 반환값이 없어 이처럼 출력할 수 없다.
		System.out.println(returnExternal.call());
	}
}