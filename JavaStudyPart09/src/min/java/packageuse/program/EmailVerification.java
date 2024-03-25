package min.java.packageuse.program;

import java.util.Random;

public class EmailVerification {
	public static void main(String[] args) {
		// 이메일 인증 코드의 길이를 설정한다.
		int codeLength = 6;

		// 인증 코드에 사용할 문자열을 초기화한다.
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		// Random 객체를 생성한다.
		Random random = new Random();

		// 인증 코드를 저장할 StringBuffer 객체를 생성한다.
		StringBuffer stringBuffer = new StringBuffer();
		// codeLength 변수의 길이만큼 랜덤한 문자를 선택하여 stringBuffer 인스턴스에 추가한다.
		for (int i = 0; i < codeLength; i++) {
			// characters 변수에 저장된 문자열 내의 임의의 인덱스를 구하고 nextInt 메서드의 경곗값으로 지정한다.
			int randomIndex = random.nextInt(characters.length());
			// 임의의 인덱스에 위치한 문자를 추출한다.
			char randomChar = characters.charAt(randomIndex);
			// 추출한 문자의 randomChar 변숫값을 stringBuffer 인스턴스에 추가한다.
			stringBuffer.append(randomChar);
		}
		// stringBuffer 인스턴스를 문자열로 변환하여 인증 코드를 저장한다.
		String emailVerificationCode = stringBuffer.toString();

		// 이메일 인증 코드를 출력한다.
		System.out.println("이메일 인증 코드 : " + emailVerificationCode);
	}
}
