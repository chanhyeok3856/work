package min.java.packageuse.program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeptValidation {
	// 부서 번호의 유효성 검사에 대한 스테틱 메서드를 선언한다.
	public static boolean isValidDeptno(String deptNumber) {
		// 0부터 99 사이의 숫자로 이루어진 문자열인 정규식을 패턴으로 컴파일한다.
		Pattern pattern = Pattern.compile("^[0-9]{1,2}$");
		// deptNumber 변숫값과 패턴을 매칭하여 Matcher 객체를 생성하고 matcher 변수에 할당한다.
		Matcher matcher = pattern.matcher(deptNumber);
		// 주어진 문자열이 올바른 부서 번호인지 검사하고 반환한다.
		return matcher.matches();
	}

	// 부서 이름의 유효성 검사에 대한 스테틱 메서드를 선언한다.
	public static boolean isValidDname(String dname) {
		// 2 글자에서 4 글자인 한글이나 영문으로 이루어진 문자열인 정규식을 패턴으로 컴파일한다.
		Pattern pattern = Pattern.compile("^[가-힣A-Za-z]{2,4}$");
		// dname 변숫값과 패턴을 매칭하여 Matcher 객체를 생성하고 matcher 변수에 할당한다.
		Matcher matcher = pattern.matcher(dname);
		// 주어진 문자열이 올바른 부서 이름인지 검사하고 반환한다.
		return matcher.matches();
	}

	// 부서 지역의 유효성 검사에 대한 스테틱 메서드를 선언한다.
	public static boolean isValidLoc(String loc) {
		// 2 글자에서 4 글자인 한글이나 영문으로 이루어진 문자열인 정규식을 패턴으로 컴파일한다.
		Pattern pattern = Pattern.compile("^[가-힣A-Za-z]{2,4}$");
		// loc 변숫값과 패턴을 매칭하여 Matcher 객체를 생성하고 matcher 변수에 할당한다.
		Matcher matcher = pattern.matcher(loc);
		// 주어진 문자열이 올바른 부서 지역인지 검사하고 반환한다.
		return matcher.matches();
	}
}