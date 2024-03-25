package min.java.packageuse;

public class WrapperFloat {
	public static void main(String[] args) {
		String string = "3.14F";
		// 문자열 3.14F를 float 타입으로 변환한다.
		float f = Float.parseFloat(string);
		System.out.println("문자열의 실수 변환 : " + f);
		// 3.14F라는 float 타입 값을 Float 객체로 변환한다.
		Float floatValue = Float.valueOf(3.14F);
		System.out.println("float 타입의 객체 변환 : " + floatValue);
	}

}
