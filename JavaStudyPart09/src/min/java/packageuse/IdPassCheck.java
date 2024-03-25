package min.java.packageuse;

public class IdPassCheck {
	// 아이디를 저장하는 스테틱 멤버 변수를 선언한다.
	static String id = "홍길동";
	// 비밀번호를 저장하는 스테틱 멤버 변수를 선언한다.
	static String pass = "1234";

	public static void main(String[] args) {
		// 아이디가 문자열인 홍길동과 같은지 검사한다.
		if (!id.equals("홍길동")) {
			System.out.println("회원 정보가 없습니다.");
			// 비밀번호가 문자열인 1234와 같은지 검사한다.
		} else if (!pass.equals("1234")) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		} else {
			System.out.println(id + "님이 로그인했습니다.");
		}
	}
}