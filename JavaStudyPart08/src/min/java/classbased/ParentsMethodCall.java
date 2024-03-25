package min.java.classbased;

// ParentsMethod 클래스를 상속받아 ParentsMethodCall 클래스를 선언한다.
public class ParentsMethodCall extends ParentsMethod {
	@Override
	public void call() {
		// 슈퍼 클래스의 call 메서드를 호출한다.
		super.call();
		// 서브 클래스에서 메서드의 코드를 추가한다.
		System.out.println("전우치입니다.");
	}

	public static void main(String[] args) {
		// 서브 클래스의 객체를 생성한다.
		ParentsMethodCall parentsMethodCall = new ParentsMethodCall();
		// 서브 클래스의 call 메서드를 호출한다.
		parentsMethodCall.call();
	}
}