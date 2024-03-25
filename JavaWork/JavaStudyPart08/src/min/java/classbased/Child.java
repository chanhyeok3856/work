package min.java.classbased;

// Parent 클래스를 상속받는 Child 클래스를 선언한다.
public class Child extends Parent {
	// Child 클래스에서 호출할 메서드를 선언한다.
	public void childMethod() {
		System.out.print("서브 메서드를 실행한다.");
	}
}