package min.java.datatype;

public class IntegerTypeBinary {
	public static void main(String[ ] args) {
		// 0b로 시작해서 0과 1의 조합으로 2진수를 표현하여 int 타입의 binaryValue 변수에 할당한다.
		int binaryValue = 0b100011;
		// binaryValue 변수의 값을 10진수 형태인 35로 출력한다.
		System.out.println("2진수의 정수값 : " + binaryValue);
	}
}