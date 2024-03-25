package min.java.packageuse;

import java.util.Calendar;

public class CalendarMaxMinDay {
	public static void main(String[] args) {
		// 기본 시간대와 로케일을 사용하여 Calendar 인스턴스를 얻는다.
		Calendar calendar = Calendar.getInstance();
		// 연도를 2023년으로 설정한다.
		int year = 2023;
		// 월을 2월로 설정한다.
		int month = 1;
		// 연도를 설정한다.
		calendar.set(Calendar.YEAR, year);
		// 월을 설정한다.
		calendar.set(Calendar.MONTH, month);
		// 해당 월의 최대일 수를 계산한다.
		int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(year + "년 " + (month + 1) + "월의 최대일 수: " + maxDay);
		// 해당 월의 최소일 수를 계산한다.
		int minDay = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
		System.out.println(year + "년 " + (month + 1) + "월의 최소일 수: " + minDay);
	}
}