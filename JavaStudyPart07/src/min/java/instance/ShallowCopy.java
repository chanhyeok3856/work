package min.java.instance;

public class ShallowCopy {
	public static void main(String[] args) {
		// String 타입의 str1 변수를 생성하고 홍길동이라는 값을 할당한다.
		String str1 = "홍길동";
		System.out.println("str1 주소값 : " + str1.hashCode());
		System.out.println("str1 결괏값 : " + str1);
		// str1 변수의 참조값을 str2 변수에 할당하여 얕은 복사를 한다.
		String str2 = str1;
		System.out.println("str2 주소값 : " + str2.hashCode());
		System.out.println("str2 결괏값 : " + str2);
		// str2 변수에 새로운 값을 할당하며 String은 불변 객체이므로 str1 변수의 값이나 주소에 영향을 주지 않는다.
		str2 = "전우치";
		System.out.println("str2 변경된 결괏값 : " + str2);
		// str1 변수의 값은 변하지 않는다.
		System.out.println("str1 변경된 결괏값 : " + str1);
	}
}