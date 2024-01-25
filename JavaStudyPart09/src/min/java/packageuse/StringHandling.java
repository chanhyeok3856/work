package min.java.packageuse;

public class StringHandling {
	public static void main(String[] args) {
		// 두 개의 문자열을 초기화한다.
		String str1 = "java";
		String str2 = " study";
		// str1 변수와 str2 변수를 연결하여 새로운 문자열을 생성한다.
		String stringConcat = str1.concat(str2);
		System.out.println("문자열의 연결 : " + stringConcat);
		// 연결된 문자열의 길이를 구하고 출력한다.
		int stringLength = stringConcat.length();
		System.out.println("문자열의 길이: " + stringLength);
		// 연결된 문자열이 비어있는지 확인한다.
		if (stringConcat.isEmpty()) {
			System.out.println("문자열이 비어있습니다.");
		} else {
			// 연결된 문자열을 바이트 배열로 변환한다.
			byte[] bytes = stringConcat.getBytes();
			String byteArray = " ";
			// 변환된 바이트 배열을 문자열로 변환하여 출력을 위해 준비한다.
			for (byte b : bytes) {
				byteArray = byteArray + b + " ";
			}
			// 바이트 배열을 문자열 형태로 출력한다.
			System.out.println("바이트 배열 : [" + byteArray + "]");
			// 바이트 배열을 문자열 형태로 양쪽 공백을 제거한고 출력한다.
			System.out.println("바이트 배열 : [" + byteArray.trim() + "]");

		}

	}
}
