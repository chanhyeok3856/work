package min.java.datatype;

public class Underscore {
	public static void main(String[ ] args) {
	    //  long 타입의 cardNumber 변수를 선언하고 언더스코어를 사용한 카드 번호를 할당한다
		long cardNumber = 1234_5678_9012_3456L;
		System.out.println("카드 번호: " + cardNumber);
		 // int 타입의 securityNumber 변수를 선언하고 언더스코어를 사용한 보안 번호를 할당한다.
		int securityNumber = 999_99_9999;		
		System.out.println("보안 번호: " + securityNumber);
		// JDK 10 이상부터는 언더스코어를 변수명으로 단독으로 사용하는 것은 권장되지 않으며 컴파일 오류로 취급한다.
		//String _ = "홍길동" ;
	
	}
}