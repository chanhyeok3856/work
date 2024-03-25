package min.java.variable.program;

// java.io 패키지에서 IOException 클래스를 임포트한다.
import java.io.IOException;

public class DictionaryTerms {
	// read 추상 메서드에서 발생한 예외 처리를 throws 키워드로 main 메서드에 예외 처리를 전달한다.
	public static void main(String[] args) throws IOException {
		// 사용자로부터 입력받은 문자를 저장할 char 타입인 choice 로컬 변수를 선언한다.
		char choice;
		System.out.println("용어 설명");
		System.out.print(" 1. 객체  ");
		System.out.print(" 2. 클래스  ");
		System.out.println(" 3. 메서드  ");
		System.out.print("원하는 번호를 입력하세요: ");
		// 사용자로부터 입력받은 1바이트의 문자를 읽어온다.
		choice = (char) System.in.read();
		// 다중 선택을 위해 순서와 관계없이 선택할 수 있는 switch 문을 사용하여 입력받은 번호에 따른 설명을 출력한다.
		switch (choice) {
		case '1':
			System.out.println("객체 : 정보를 관리하기 위한 논리적인 단위다.");
			break;
		case '2':
			System.out.println("클래스 : 객체를 생성하는 집합이다.");
			break;
		case '3':
			System.out.println("메서드: 정보를 전달하는 매개체다.");
			break;
		default:
			System.out.println("선택하신 번호가 잘못되었습니다.");
		}
	}
}