package min.java.operation.program;

import java.io.IOException;

public class OddEven {
	public static void main(String[] args) throws IOException {
		System.out.print("숫자를 입력하세요. : ");
		// 사용자로부터 입력받은 아스키코드를 '0'의 아스키코드값인 48을 빼서 실제 정숫값을 얻는다.
		int i = System.in.read() - 48;
		String numberCheck = "";
		// 조건 연산자로 i가 홀수인지 짝수인지 확인한다.
		numberCheck = i % 2 == 0 ? "짝수" : "홀수";
		System.out.println(numberCheck + "입니다.");
	}
}