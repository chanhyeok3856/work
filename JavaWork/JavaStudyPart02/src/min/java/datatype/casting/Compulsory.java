package min.java.datatype.casting;

public class Compulsory {
	public static void main(String[ ] args) {
        // 바이트 자료형을 선언한다.
		byte b;
        // int 형 자료형을 선언한다.
		int i = 256;
        // int 형을 byte 자료형으로 강제 형 변환을 한다.
		b = (byte) i;
		System.out.println("int 256의 byte : " + b);
	}
}