package min.java.packageuse.program;

import java.util.Scanner;

public class CalendarCall {
	public static void main(String[] args) {
		int year;
		int month;
		Scanner scanner = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		year = scanner.nextInt();
		System.out.print("월을 입력하세요 : ");
		month = scanner.nextInt();
		System.out.println("" + year + "년 " + month + "월 달력입니다.\n");
		CalendarCreate calendarCreate = new CalendarCreate(year, month);
		// 달력 형태를 호출한다.
		calendarCreate.call();
		// Scanner 객체를 닫아 리소스를 해제한다.
		scanner.close();
	}
}