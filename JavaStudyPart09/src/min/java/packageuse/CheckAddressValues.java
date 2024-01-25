package min.java.packageuse;

public class CheckAddressValues {
	public static void main(String[ ] args) {
		// 객체의 인스턴스를 선언한다.
		Object object = new Object( );
		// 자바에서 부여한 해시 코드를 호출한다.
		System.out.println("자바의 해시 코드 : " + object.hashCode( ));
		// 시스템에서 부여한 해시 코드를 호출한다.
		System.out.println("시스템의 해시 코드 : " + System.identityHashCode(object));
		// 해시 코드를 16진수로 변환한다.
		System.out.println("해시 코드의 16진수 변환 : " + Integer.toHexString(object.hashCode( )));
		// 주소값을 호출한다.
		System.out.println("객체의 주소값 : " + object);
	}
}