package min.java.packageuse;

public class WrapperInteger {
	public static void main(String[] args) {
		String string1 = "123";
		// 문자열 123을 int 타입으로 변환한다.
		int i = Integer.parseInt(string1);
		System.out.println("문자열의 정수 변환 : " + i);
		int num = 123;
		// int 타입의 num 변숫값을 문자열 형태로 표현하고 변환하여 String 타입의 string2 변수에 할당한다.
		String string2 = Integer.toString(num);
		System.out.println("int 타입의 문자열 변환 : " + string2);
		// 10이라는 int 타입 값을 Integer 객체로 변환한다.
		Integer integer = Integer.valueOf(10);
		System.out.println("int 타입의 객체 변환 : " + integer);

	}

}
