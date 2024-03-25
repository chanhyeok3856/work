package min.java.packageuse;

public class TimeMeasurement {
	public static void main(String[] args) {
		// 현재 시스템의 시간을 밀리세컨드 단위로 가져와서 millisecond 변수에 할당한다.
		long millisecond = System.currentTimeMillis();
		System.out.println("현재 시스템의 " + millisecond + " 밀리세컨드입니다.");
		// 현재 JVM의 시간을 나노세컨드 단위로 가져와서 nanosecond 변수에 할당한다.
		long nanosecond = System.nanoTime();
		System.out.println("현재 시스템의 " + nanosecond + " 나노세컨드입니다.");

	}
}