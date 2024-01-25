package min.java.packageuse;

import java.util.regex.Pattern;

public class RegexPattern {
	public static void main(String[] args) {
		String deptNumber = "50";
		// regex 변수에 정규식을 할당하며 정규식은 0부터 99 사이의 숫자로 이루어진 문자열이다.
		String regex = "^[0-9]{1,2}$";
		// 주어진 정규식을 패턴으로 컴파일하고 pattern 변수에 할당한다.
		Pattern pattern = Pattern.compile(regex);
		System.out.println("컴파일된 패턴 : " + pattern);
		// 주어진 입력 문자열에 대한 Matcher 객체를 생성하며 반환값을 사용하지 않는다.
		pattern.matcher(deptNumber);
		System.out.println("생성된 Matcher 객체 : " + pattern.matcher(deptNumber));
		// 주어진 정규식과 문자열을 사용해 매칭 여부를 확인하고 result 변수에 할당한다.
		boolean result = Pattern.matches(regex, deptNumber);
		System.out.println("매칭 여부 확인 : " + result);
		// 패턴이 컴파일된 정규식을 문자열로 반환하여 patternString 변수에 할당한다.
		String patternString = pattern.pattern();
		System.out.println("반환된 문자열 : " + patternString);
		// 주어진 정규식을 패턴과 대소문자를 구분하지 않는 플래그로 함께 컴파일하고 pattern 변수에 할당한다.
		pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
		// 패턴 객체에서 사용된 플래그를 반환하여 patternFlags 변수에 할당한다.
		int patternFlags = pattern.flags();
		System.out.println("패턴 적용 플래그 : " + patternFlags);
	}

}
