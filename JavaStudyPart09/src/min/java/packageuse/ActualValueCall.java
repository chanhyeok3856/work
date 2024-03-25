package min.java.packageuse;

public class ActualValueCall {
	public static void main(String[] args) {
		// ActualValue 클래스의 인스턴스를 생성한다.
		ActualValue actualValue = new ActualValue("홍길동", 33);
		// 생성된 객체의 실제값을 호출한다.
		System.out.println("실제값 호출 : " + actualValue);
	}
}