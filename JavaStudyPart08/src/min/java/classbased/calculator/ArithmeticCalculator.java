package min.java.classbased.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticCalculator {
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int su1;
		int su2;
		// 연산 결과를 저장할 변수를 선언하고 초기화한다.
		int tot = 0;
		char operation;
		System.out.print("첫 번째 수 = ");
		su1 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("연산 기호를 잘못 입력하면 다시 입력하세요.");
		do {
			System.out.print("operation(+, -, *, /) = ");
			operation = (char) System.in.read();
			// 복귀 개행으로 엔터로 처리된다.
			System.in.read();
			System.in.read();
		} while (operation != '+' && operation != '-' && operation != '*' && operation != '/');
		System.out.print("두 번째 수 = ");
		su2 = Integer.parseInt(bufferedReader.readLine());
		switch (operation) {
		case '+':
			// Operator 클래스로 plu 스테틱 메서드에 직접 접근하여 더하기 메서드를 호출한다.
			tot = Operator.plu(su1, su2);
			break;
		case '-':
			// Operator 클래스로 min 스테틱 메서드에 직접 접근하여 빼기 메서드를 호출한다.
			tot = Operator.min(su1, su2);
			break;
		case '*':
// Operator 클래스로 mul 스테틱 메서드에 직접 접근하여 곱하기 메서드를 호출한다.
			tot = Operator.mul(su1, su2);
			break;
		case '/':
			// Operator 클래스로 div 스테틱 메서드에 직접 접근하여 나누기 메서드를 호출한다.
			tot = Operator.div(su1, su2);
			break;
		}
		// OperatorResult 클래스로 result 스테틱 메서드에 직접 접근하여 연산 결과를 호출한다.
		OperatorResult.result(su1, operation, su2, tot);
	}
}