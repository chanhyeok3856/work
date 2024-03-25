package 실습;

public class Friday9 {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 12;
		int result = number1 & number2;
		System.out.println("number1 변수의 이진수 : "+Integer.toBinaryString(number1));
		System.out.println("number1 변수의 이진수 : "+Integer.toBinaryString(number2));
		System.out.println("앰퍼샌드 연산의 결과 : "+result + "(이진수 : "+Integer.toBinaryString(result)+")");

	}

}
