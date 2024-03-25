package min.java.array;

public class ShallowCopy {
	public static void main(String[] args) {
		// 크기가 2인 1차원 num1 배열 변수를 선언하고 초기화한다.
		int[] num1 = new int[2];
		System.out.println("num1 주소값 : " + num1);
		// 원소에 값을 저장한다.
		num1[0] = 2;
		num1[1] = 4;
		System.out.println("num1 결괏값 : " + num1[0] + ", " + num1[1]);
		// 1차원 num1 배열 변수를 참조하는 num2 배열 변수를 선언하고 얕은 복사를 한다.
		int[] num2 = num1;
		System.out.println("num2 주소값 : " + num2);
		// 원소에 값을 저장한다.
		num2[0] = 6;
		num2[1] = 8;
		System.out.println("num2 결괏값 : " + num2[0] + ", " + num2[1]);
		// 얕은 복사 때문에 num2 변수가 변경되면 num1 변수도 함께 변경된다.
		System.out.println("num1 변경된 결괏값 : " + num1[0] + ", " + num1[1]);
	}
}