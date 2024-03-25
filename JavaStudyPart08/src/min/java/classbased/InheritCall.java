package min.java.classbased;

public class InheritCall {
	public static void main(String[] args) {
		// Child 클래스의 인스턴스를 생성한다.
		Child child = new Child();
		child.parentMethod();
		child.childMethod();
	}
}