package 실습0205;

public class Mon9 {
	int i = 10;
	private int j = 20;
	static int k = 30;
	class Mon10{
		public void call() {
			System.out.println("i 변숫값 : "+ i );
			System.out.println("j 변숫값 : "+j);
System.out.println("k변숫값 : "+k);
		}
	}
	public static void main(String[] args) {
		Mon9 mon9 = new Mon9();
		Mon9.Mon10 mon10 = mon9.new Mon10();
		mon10.call();
	}

}
