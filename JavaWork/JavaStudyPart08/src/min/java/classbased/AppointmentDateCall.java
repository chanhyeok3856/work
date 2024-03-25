package min.java.classbased;

public class AppointmentDateCall {
	public static void main(String[] args) {
		// 매개변수를 통해 초기화된 인스턴스를 선언한다.
		AppointmentDate appointmentDate = new AppointmentDate(31, 5);
		// 날짜를 호출하여 할당한다.
		int day = appointmentDate.getDay();
		// 월을 호출하여 할당한다.
		int month = appointmentDate.getMonth();
		System.out.println("설정한 날짜는 " + month + "월 " + day + "일입니다.");
	}
}