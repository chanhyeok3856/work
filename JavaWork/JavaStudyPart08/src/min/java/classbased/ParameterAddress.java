package min.java.classbased;

public class ParameterAddress {
	// 문자열 타입의 매개 변수를 받는 스테틱 메서드를 선언한다.
	public static void call(String name1) {
		System.out.println(name1 + "안녕하세요.");
		// 매개 변수의 주소와 같은 해시 코드를 Object 클래스의 hashCode 메서드로 호출한다.
		System.out.println("name1의 해시 코드 : " + name1.hashCode());
	}

	public static void main(String[] args) {
		String name2 = "홍길동님 ";
		// 메서드의 매개 변수의 주소값을 참조하여 호출한다.
		call(name2);
		System.out.println("name2의 해시 코드 : " + name2.hashCode());
	}
}