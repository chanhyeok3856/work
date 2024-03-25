package min.java.packageuse;

import java.util.StringTokenizer;

public class DelimiterTokenizer {
	public static void main(String[] args) {
		// 문자열을 초기화한다.
		String string = "어깨동무 자바는 자바 강의의 혁명이다.";
		// StringTokenizer 객체를 사용하여 문자열을 공백 문자를 기준으로 토큰화한다.
		StringTokenizer stringTokenizer = new StringTokenizer(string);
		// 토큰으로 요소를 확인하여 반복하고 각 토큰을 번호와 함께 출력한다.
		for (int i = 1; stringTokenizer.hasMoreElements(); i++) {
			System.out.print(i + "번째 토큰: " + stringTokenizer.nextToken() + " ");
		}
	}
}