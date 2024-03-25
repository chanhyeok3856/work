package min.java.datatype;

public class Accuracy {
	public static void main(String[] args) {
		// 1.0f를 3.0f로 나누는 연산을 수행하고 그 결과를 float 타입인 f 변수에 할당한다.
		float f = 1.0f / 3.0f;
		// 1.0을 3.0으로 나누는 연산을 수행하고 그 결과를 double 타입인 d 변수에 할당한다.
		double d = 1.0 / 3.0;
		// 1을 3으로 나누는 연산을 수행하고 그 결과를 int 타입인 i 변수에 할당한다.
		int i = 1 / 3;
		System.out.println("float 값 = " + f);
		System.out.println("double 값 = " + d);
		System.out.println("int 값 = " + i);
	}
}