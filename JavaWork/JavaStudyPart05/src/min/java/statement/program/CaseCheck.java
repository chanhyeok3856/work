package min.java.statement.program;

import java.io.IOException;

public class CaseCheck {
	public static void main(String[] args) throws IOException {
		System.out.print("영어 문자: ");
		char c = (char) System.in.read();
		// 입력된 문자가 소문자일 경우에 호출한다.
		if (c >= 'a' && c <= 'z') {
			System.out.println(c + "는 소문자입니다.");
			// 입력된 문자가 대문자일 경우에 호출한다.
		} else if (c >= 'A' && c <= 'Z') {
			System.out.println(c + "는 대문자입니다.");
			// 입력된 문자가 대소문자 알파벳이 아닐 경우에 호출한다.
		} else {
			System.out.println("대소문자 외의 문자를 입력하였습니다.");
		}
	}
}