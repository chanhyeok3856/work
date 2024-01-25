package min.java.classbased;

public class AppointmentDate {
	private int day;
	private int month;

// 파라미터 생성자를 생성하여 멤버 변숫값을 초기화하고 임시로 저장한다.
	public AppointmentDate(int day, int month) {
		this.day = day;
		this.month = month;
	}

	// 날짜를 반환한다.
	public int getDay() {
		return day;
	}

	// 월을 반환한다.
	public int getMonth() {
		return month;
	}
}