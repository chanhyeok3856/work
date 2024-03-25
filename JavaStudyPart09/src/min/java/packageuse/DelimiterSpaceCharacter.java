package min.java.packageuse;

import java.util.StringTokenizer;

public class DelimiterSpaceCharacter {
	public static void main(String[] args) {
		// 문자열을 초기화한다.
		String citizenship = "서울시 노원구 월계동";
		// StringTokenizer 객체를 사용하여 문자열을 공백 문자를 기준으로 토큰화한다.
		StringTokenizer stringTokenizer = new StringTokenizer(citizenship);
		// 모든 토큰을 출력한다.
		while (stringTokenizer.hasMoreTokens()) {
			System.out.print(" " + stringTokenizer.nextToken());
		}
	}
}