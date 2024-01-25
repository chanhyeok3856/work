package min.java.datatype;

public class HexType {
	public static void main(String[ ] args) {
		 // 0x를 시작으로 0~9와 A~F의 조합으로 16진수를 표현하여 int 타입의 hexValue 변수에 할당한다.
		int hexValue = 0x23;
		// hexValue 변수의 값을 10진수 형태인 35로 출력한다.
		System.out.println("16진수의 정수값: " + hexValue);
	}
}