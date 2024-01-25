package min.java.packageuse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
	public static void main(String[] args) {
		String deptNumber = "50";
		// regex 변수에 정규식을 할당하며 정규식은 0부터 99 사이의 숫자로 이루어진 문자열이다.
		String regex = "^[0-9]{1,2}$";
		// 주어진 정규식을 패턴으로 컴파일하고 pattern 변수에 할당한다.
		Pattern pattern = Pattern.compile(regex);
		// deptNumber 변숫값과 패턴을 매칭하여 Matcher 객체를 생성하고 matcher 변수에 할당한다.
		Matcher matcher = pattern.matcher(deptNumber);

		// 전체 문자열이 패턴과 매칭하는지 검사한다.
		if (matcher.matches()) {
			System.out.println("올바른 부서 번호가 맞습니다.");

			// 매칭한 부분 문자열을 반환한다.
			String deptnoText = matcher.group();
			System.out.println("매치된 부서 번호: " + deptnoText);

			// 매칭한 부분 문자열의 시작 인덱스를 반환한다.
			int startIndex = matcher.start();
			// 매칭한 부분 문자열의 끝 인덱스 바로 다음을 반환한다.
			int endIndex = matcher.end();
			System.out.println("매치 시작 위치: " + startIndex);
			System.out.println("매치 종료 위치: " + endIndex);
		} else {
			System.out.println("올바른 부서 번호가 아닙니다.");
		}
	}
}
