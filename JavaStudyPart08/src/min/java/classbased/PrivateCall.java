package min.java.classbased;

public class PrivateCall {
	public static void main(String[] args) {
		PrivateAccess privateAccess = new PrivateAccess();
		// getNum 메서드를 통해 private 접근 제한자로 선언된 num 멤버 변수의 값을 호출하여 출력한다.
		System.out.println("num 인스턴스 멤버 변숫값 : " + privateAccess.getNum());
		// 주석을 제거하여 멤버 변수로 접근하려면 private 접근 제한자로 선언되었으므로 직접 접근할 수가 없어서 컴파일 오류가 발생한다.
		// System.out.println("num 인스턴스 멤버 변숫값 : " + privateAccess.num);
	}
}