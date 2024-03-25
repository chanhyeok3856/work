package 실습0205;
import static 실습0205.StaticMember.count;
public class StaticMembercall {
	public static void main(String[] args) {
		System.out.println("클래스 접근에 의한 스테틱 멤버 변숫값 : "+StaticMember.count);
		System.out.println("스테틱 임포트에 의한 스테틱 멤버 변숫값 : "+count);
	}

}
