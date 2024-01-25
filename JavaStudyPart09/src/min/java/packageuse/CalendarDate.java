package min.java.packageuse;

import java.util.Calendar;

public class CalendarDate {
	public static void main(String[] args) {
		// 기본 시간대와 로케일을 사용하여 Calendar 인스턴스를 얻는다.
		Calendar calendar = Calendar.getInstance();
		// 현재의 연도를 구한다.
		int year = calendar.get(Calendar.YEAR);
		// 현재의 월을 구하며 MONTH 필드는 0부터 시작하므로 1을 더한다.
		int month = calendar.get(Calendar.MONTH) + 1;
		// 현재의 일을 DAY_OF_MONTH 필드로 구하며 DAY_OF_MONTH 필드는 DATE 필드와 같게 작동한다.
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("현재 날짜 : " + year + "년 " + month + "월 " + day + "일");
		// 현재 날짜의 DATE 필드값을 얻어 7을 더하고 newDay 변수에 할당한다.
		int newDay = calendar.get(Calendar.DATE) + 7;
		// set 메서드를 사용하여 수정된 값을 DATE 필드에 설정한다.
		calendar.set(Calendar.DATE, newDay);
		// 7일을 더했을 때 월이나 연도가 변경될 수 있으므로 출력을 정확하게 하려면 연, 월 값을 다시 가져온다.
		month = calendar.get(Calendar.MONTH) + 1;
		year = calendar.get(Calendar.YEAR);
		// 수정된 날짜에서의 일 값을 다시 가져와서 day 변수에 다시 할당한다.
		day = calendar.get(Calendar.DATE);
		System.out.println("7일 추가 날짜 : " + year + "년 " + month + "월 " + day + "일");
	}
}