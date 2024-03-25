package min.java.statement;

public class LogicDifferences {
	// boolean 값과 메시지 문자열을 받아 해당 메시지를 출력하고 boolean 값을 반환하는 메서드를 선언한다.
	public static boolean differencesCall(boolean b, String message) {
		System.out.println(message);
		return b;
	}

	public static void main(String[] args) {
		// & 연산자는 첫 번째 피연산자와 두 번째 피연산자를 모두 평가한다.
		System.out.println("<앰퍼샌드(&) 연산자>");
		if (differencesCall(false, "첫 번째 false 불리언값") & differencesCall(true, "두 번째 true 불리언값")) {
		}
		// && 연산자는 첫 번째 피연산자가 false이면 두 번째 피연산자를 평가하지 않는다.
		System.out.println("<더블 앰퍼샌드(&&) 연산자>");
		if (differencesCall(false, "첫 번째 false 불리언값") && differencesCall(true, "두 번째 true 불리언값")) {
		}
		// | 연산자는 첫 번째 피연산자와 두 번째 피연산자를 모두 평가한다.
		System.out.println("<버티컬바(|) 연산자>");
		if (differencesCall(true, "첫 번째 true 불리언값") | differencesCall(true, "두 번째 true 불리언값")) {
		}
		// || 연산자는 첫 번째 피연산자가 true이면 두 번째 피연산자를 평가하지 않는다.
		System.out.println("<더블 버티컬바(||) 연산자>");
		if (differencesCall(true, "첫 번째 true 불리언값") || differencesCall(true, "두 번째 true 불리언값")) {
		}
	}
}