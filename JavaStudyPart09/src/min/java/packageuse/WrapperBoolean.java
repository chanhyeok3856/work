package min.java.packageuse;

public class WrapperBoolean {
	public static void main(String[] args) {
		// 입력된 문자열은 대소문자를 구분하지 않는다.
		String string = "TRuE";
		// 문자열 TRuE를 boolean 타입으로 변환한다.
		boolean b = Boolean.parseBoolean(string);
		System.out.println("문자열의 불리언 변환 : " + b);
		// true라는 boolean 타입 값을 Boolean 객체로 변환한다.
		Boolean boolValue = Boolean.valueOf(true);
		System.out.println("boolean 타입의 객체 변환 : " + boolValue);
	}

}
