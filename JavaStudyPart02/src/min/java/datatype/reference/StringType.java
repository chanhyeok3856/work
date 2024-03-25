package min.java.datatype.reference;

public class StringType {
	public static void main(String[] args) {
		// 문자열 타입의 name 로컬 변수를 선언하고 초깃값으로 null을 할당하고 이는 아무것도 참조하고 있지 않음을 의미한다.
		String name = null;
		// name 변수에 홍길동이라는 문자열을 할당한다.
		name = "홍길동";
		System.out.println(name);
		// 문자열 타입의 name2라는 새로운 문자열 변수를 선언하고 생성자를 이용하여 전우치라는 문자열을 할당한다.
		String name2 = new String("전우치");
		System.out.println(name2);
	}
}