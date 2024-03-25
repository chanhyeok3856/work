package 실습0205;

public class Mon5 {
	int a = 10;
	@SuppressWarnings("unused")
	private int b = 20;
	static int c =30;
	static class Mon6{
		static int d = 40;
		public void call() {
			// 스테틱 중첩 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없으므로 주석을 제거하면 오류발생
			//System.out.println(a);
System.out.println("c 변숫값 : "+ c);
System.out.println("d 변숫값 : "+d);
		}
	}
public static void main(String[] args) {
	Mon5.Mon6 mon6 = new Mon5.Mon6();
mon6.call();
}
}
