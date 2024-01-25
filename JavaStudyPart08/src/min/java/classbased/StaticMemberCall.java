package min.java.classbased;

// 스테틱 멤버 변수를 임포트한다. 
import static min.java.classbased.StaticMember.count;

public class StaticMemberCall {
	public static void main(String[] args) {
		// 스테틱 멤버 변수를 클래스 이름을 통해 직접 접근하여 출력한다.
		System.out.println("클래스 접근에 의한 스테틱 멤버 변숫값 : " + StaticMember.count);
		// 스테틱 임포트를 사용하여 클래스 이름 없이 직접 멤버 변수에 접근하여 출력한다.
		System.out.println("스테틱 임포트에 의한 스테틱 멤버 변숫값 : " + count);
	}
}