package min.java.classbased;

public class ConstantCall {
	public static void main(String[] args) {
		// Constant 클래스의 인스턴스를 생성한다.
		Constant constant = new Constant();
		// 생성된 인스턴스를 통해 NUM 상수의 값을 출력한다.
		System.out.println("NUM 상숫값 : " + constant.getNUM());
	}
}