package 실습0206;

public class Tue2 {
	public static void main(String[] args) {
		long millisecond = System.currentTimeMillis();
		System.out.println("현재 시스템의"+millisecond +"밀리세컨드입니다.");
		long nanosecond = System.nanoTime();
		System.out.println("현재 시스템의"+nanosecond+"나노세컨드입니다.");
	}

}
