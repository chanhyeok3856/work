package 실습0205;

public class Mon8 {
	static class Mon9{
		private void privateMethod() {
			System.out.println("내부 private 메서드에 접근한다.");
			
		}
		public void callPrivateMethod() {
			privateMethod();
		}
	}
public static void main(String[] args) {
	Mon8.Mon9 mon9 = new Mon8.Mon9();
mon9.callPrivateMethod();
}
}
