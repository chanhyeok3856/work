package 실습0205;

public class Mon11 {
	public int i = 100;
	public void chan() {
		final int j = 50;
		class Mon12{
			public void hyeok() {
				System.out.println("멤버 변숫값 : " + i);
				System.out.println("메서드 내의 상숫값 : "+j);
				
			}
		}
		Mon12 mon12 = new Mon12();
	mon12.hyeok();
	}
	public static void main(String[] args) {
		Mon11 mon11 = new Mon11();
	mon11.chan();
	}
	

}
