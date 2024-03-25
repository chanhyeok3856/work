package min.java.classbased.inherit;

import min.java.classbased.Child;

// Child 클래스에 의해서 Baby 클래스를 선언한다.
public class Baby extends Child {
	public void babyMethod( ) {
		System.out.println("아기 메서드를 실행한다.");
	}
}