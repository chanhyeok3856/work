package min.java.packageuse;

import java.util.Calendar;
import java.util.Date;

public class CalendaPastDay {
	public static void main(String[] args) {
		// 날짜와 시간의 인스턴스를 선언한다.
		Date date = new Date();
		// 기본 시간대와 로케일을 사용하여 달력을 가져와서 인스턴스를 선언한다.
		Calendar calendar = Calendar.getInstance();
		// 주어진 날짜로 달력의 시간을 설정한다.
		calendar.setTime(date);
		// 기본 시간대와 로케일을 사용하여 달력을 가져와서 인스턴스를 선언한다.
		Calendar calendar2 = Calendar.getInstance();
		// 달력의 상수인 YEAR, MONTH, DAY_OF_MONTH의 정수값을 설정한다.
		calendar2.set(2022, 12 - 1, 12);
		int count = 0;
		// 설정된 날짜와 비교하여 현재 날짜 이후이면 true로 아니면 false를 반환하고 반복한다.
		while (!calendar2.after(calendar)) {
			count = count + 1;
			// 달력 규칙에 따라 지정된 달력 상수에 지정된 시간을 더한다.
			calendar2.add(Calendar.DATE, 1);
		}
		System.out.println("기준일로부터 " + count + "일이 지났습니다.");
	}
}