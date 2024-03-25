package min.java.classbased;

public class ThisMethodCall {
	public static void main(String[] args) {
		// 인스턴스를 선언하고 파라미터 생성자에 매개 변숫값을 설정하며 age 매개 변수는 33으로 자동 설정된다.
		ThisMethod thisMethod = new ThisMethod("홍길동");
		System.out.println(thisMethod);
	}
}