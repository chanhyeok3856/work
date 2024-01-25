package min.java.packageuse;

public class StringManipulation {
	public static void main(String[] args) {
		String str1 = " java ";
		String str2 = "java";
		String str3 = "JAVA";
		// str2 변수와 str3 변수의 내용을 사전적 순서로 비교한다.
		int point = str2.compareTo(str3);
		// 반환값은 str2과 str3 사이의 문자 차이를 나타낸다.
		System.out.println("문자열의 위치값 : " + point);
		// str1 변숫값의 양 끝 공백을 제거하고 str1 변수에 할당한다.
		str1 = str1.strip();
		// str1 변수와 str2 변수의 내용이 같은지 비교한다.
		if (str1.compareTo(str2) == 0) {
			// str1 변숫값을 두 번 반복하여 result 변수에 저장한다.
			String result = str1.repeat(2);
			System.out.println("문자열의 결괏값 : " + result);
		} else {
			System.out.println("대소문자를 구분하므로 비교할 수가 없습니다.");
		}
	}
}
