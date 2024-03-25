package min.java.packageuse;

public class StringSearch {
	public static void main(String[] args) {
		// 문자열을 초기화한다.
		String str = "java again study";

		// 첫 번째 a 문자의 위치를 찾아 출력한다.
		System.out.println("1. a 문자의 첫 번째 인덱스 : " + str.indexOf('a'));
		// 탐색 시작 위치를 인덱스 2로 지정하여 두 번째 a 문자의 위치를 찾아 출력한다.
		System.out.println("2. a 문자의 두 번째 인덱스 : " + str.indexOf('a', 2));
		// 탐색 시작 위치를 인덱스 4로 지정하여 세 번째 a 문자의 위치를 찾아 출력한다.
		System.out.println("3. a 문자의 세 번째 인덱스 : " + str.indexOf('a', 4));
		// 세 번째 a 문자의 문자를 대문자 A로 변경하고 출력한다.
		System.out.println("4. 세 번째 a 문자의 문자 변경 : " + str.substring(0, str.indexOf('a', 4)) + 'A' + str.substring(str.indexOf('a', 4) + 1));
		// a 문자의 마지막 인덱스를 탐색하고 출력한다.
		System.out.println("5. a 문자의 마지막 인덱스 : " + str.lastIndexOf('a'));
		// 마지막 a 문자의 문자를 대문자 A로 변경하고 출력한다.
		System.out.println("6. 마지막 a 문자의 문자 변경 : " + str.substring(0, str.lastIndexOf('a')) + 'A' + str.substring(str.lastIndexOf('a') + 1));
		// 문자열이 java로 시작하는지와 j로 시작하는지 확인하여 출력한다.
		System.out.println("7. 문자열의 접두사 : " + str.startsWith("java") + " " + str.startsWith("j"));
		// 문자열이 study로 끝나는지와 y로 끝나는지 확인하여 출력한다.
		System.out.println("8. 문자열의 접미사 : " + str.endsWith("study") + " " + str.endsWith("y"));
	}

}
