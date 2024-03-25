package min.java.packageuse;

public class StringCompare {
	public static void main(String[] args) {
		String str1 = "java again nstudy";
		String str2 = "JAVA AGAIN STUDY";
		// 두 문자열의 대소문자를 무시하고 내용이 같은지 비교하며 공백 문자도 확인한다.
		if (str1.compareToIgnoreCase(str2) == 0) {
			// 문자열을 줄바꿈(\n)을 기준으로 분리하여 배열로 반환한다.
			String[] lines = str1.split("\n");
			// 결과 배열의 인덱스를 설정한다.
			int index = 0;
			// 배열을 반복하여 공백이 아닌 문자열만 처리한다.
			for (String line : lines) {
				// 문자열이 비어있거나 오로지 공백만 포함하는지 확인한다.
				if (!line.isBlank()) {
					// 양 끝의 공백을 제거하고 배열의 해당 인덱스에 저장한다.
					lines[index] = line.strip();
					// 인덱스를 증가시킨다.
					index++;
				}
			}

			String result = " ";
			// 공백을 제거한 문자열을 result 변수에 추가한다.
			for (String line : lines) {
				// 기존 result 변수에 line 변숫값을 추가한다.
				result = result + line;

			}
			// 문자열을 2번 반복한다.
			result = result.repeat(2);
			System.out.println("결괏값 :" + result);
		} else {
			System.out.println("str1과 str2는 대소문자를 구분하지 않는 다른 문자열입니다.");
		}

	}
}
