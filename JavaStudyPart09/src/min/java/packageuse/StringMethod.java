package min.java.packageuse;

public class StringMethod {
	public static void main(String[ ] args) {
		String string = "java";
		String string2 = "   H    e  l  l  o  ";
		// java 문자열의 공백을 포함한 study 문자열을 끝에 연결한다.
		System.out.println("1. 문자열 연결: " + string.concat(" study"));
		// java 문자열의 a 문자를 c 문자로 변경한다.
		System.out.println("2. 문자 a를 c로 변경: " + string.replace('a', 'c'));
		// java 문자열에서 포함하는 인덱스 1인 a 문자에서 포함하지 않는 인덱스가 3인 a 문자까지의 부분 문자열을 대체한다.
		System.out.println("3. 2번째에서 3번째까지 문자 출력: " + string.substring(1, 3));
		// java 문자열을 소문자로 변경한다.
		System.out.println("4. 소문자로 변경: " + string.toLowerCase( ));
		// java 문자열을 대문자로 변경한다.
		System.out.println("5. 대문자로 변경: " + string.toUpperCase( ));
		// java 문자열의 마지막 문자열을 비교한다.
		System.out.println("6. 끝나는 문자열 비교: " + string.endsWith("va"));
		// java 문자열의 인덱스 3인 a 문자를 반환한다.
		System.out.println("7. 인덱스값의 문자 출력: " + string.charAt(3));
		// java 문자열의 길이를 호출한다.
		System.out.println("8. 문자열의 길이 출력: " + string.length( ));
		// java 문자열에서 v 문자의 인덱스를 반환한다.
		System.out.println("9. v에 맞는 인덱스값 출력: " + string.indexOf("v"));
		// H e l l o 문자열 양 끝의 공백을 제거한다.
		System.out.println("10. 앞뒤 공백 제거 후 문자열 출력: " + string2.trim( ));
	}
}