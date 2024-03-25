package min.java.packageuse;

import java.util.Scanner;

public class ScanningStringInput {
	public static void main(String[] args) {
		// Scanner 객체를 생성하여 사용자의 키보드 입력을 처리한다.
		Scanner scanner = new Scanner(System.in);
		String str1;
		String str2;
		System.out.print("공백 기준 문자열 입력 : ");
		// 공백을 기준으로 문자열을 입력받는다.
		str1 = scanner.next();
		System.out.print("한 라인 기준 문자열 입력 : ");
		// 한 라인을 기준으로 입력받고 개행 문자를 포함한다.
		str2 = scanner.nextLine();
		System.out.println();
		System.out.println("공백 기준 문자열 입력 결과 : " + str1);
		System.out.println("한 라인 기준 문자열 입력 결과 : " + str2);
		// Scanner 객체를 닫아 리소스를 해제한다.
		scanner.close();
	}
}