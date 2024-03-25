package min.java.packageuse;

import java.util.Objects;

public class CheckNull {

	public static void main(String[] args) {
		// String 타입의 변수를 선언하고 초깃값으로 null을 할당한다.
		String name = null;
		// 제공된 참조 객체가 null이면 true를 반환하고 그렇지 않으면 false를 반환한다.
		System.out.println("null 체크 : " + Objects.isNull(name));
		// 제공된 참조 객체가 null이 아니면 true를 반환하고 그렇지 않으면 false를 반환한다.
		System.out.println("null 체크 : " + Objects.nonNull(name));
		// 제공된 참조 객체가 null일 때 NullPointerException 예외를 발생시킨다.
		System.out.println("null 체크 : " + Objects.requireNonNull(name));

	}

}
