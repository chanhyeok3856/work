package min.java.packageuse;

import java.util.Date;

public class CurrentDate {
	public static void main(String[] args) {
		// 현재 날짜와 시간의 인스턴스를 생성한다.
		Date date = new Date();
		System.out.println("현재 날짜 : " + date);

		// 현재 날짜와 시간의 인스턴스를 문자열로 변환한다.
		String dateString = date.toString();
		System.out.println("날짜 문자열 : " + dateString);
	}
}