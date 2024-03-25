package min.java.statement.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticCalculation {
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int su1, su2, tot = 0;
		char sign = 0;
		System.out.print("첫 번째 수 = ");
		// 키보드에 입력된 한 줄 텍스트를 읽으며 읽어온 데이터를 부호 없는 정수로 구문 분석한다.
		su1 = Integer.parseInt(bufferedReader.readLine());
		System.out.print("연산자(+, -,*, /, %) = ");
		sign = (char) System.in.read();
		// 복귀 개행인 엔터 기능으로 처리되며 입력 버퍼를 비워 다음 입력을 정확하게 읽을 수 있도록 한다.
		System.in.read();
		System.in.read();
		System.out.print("두 번째 수 = ");
		su2 = Integer.parseInt(bufferedReader.readLine());
		switch (sign) {
		case '+':
			tot = su1 + su2;
			break;
		case '-':
			tot = su1 - su2;
			break;
		case '*':
			tot = su1 * su2;
			break;
		case '/':
			tot = su1 / su2;
			break;
		case '%':
			tot = su1 % su2;
			break;
		default:
			System.out.println("잘못된 연산자를 입력하였습니다.");
			// 잘못된 연산자를 입력한 경우 프로그램을 종료하며 현재 실행 중인 Java Virtual Machine은 정상 종료된다.
			System.exit(0);
		}
		System.out.println(su1 + " " + sign + " " + su2 + " = " + tot);
	}
}