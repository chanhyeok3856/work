package min.java.datatype;

public class BooleanType {
	public static void main(String[ ] args) {
		// >(라이트 앵글 브래킷) 비교 연산자로 2와 4의 논리값을 확인하고 출력한다.
		System.out.println("비교 연산 : " + (2 < 4));
		// >(레프트 앵글 브래킷) 비교 연산자로 2와 4의 논리값을 확인하고 출력한다.
		System.out.println("비교 연산 : " + (2 > 4));
		// &&(더블 앰퍼샌드) 논리 연산자로 평가하고 출력한다.
		System.out.println("논리 연산 : " + (true && true));
		// ||(더블 버티컬바) 논리 연산자로 평가하고 출력한다.
		System.out.println("논리 연산 : " + (false || false));

	}
}
