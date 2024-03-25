package min.java.packageuse;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentFormatDate {
	public static void main(String[] args) {
		// SimpleDateFormat 객체를 생성하여 날짜 및 시간 형식을 지정한다.
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss a");
		// 현재 날짜를 지정한 형식으로 포맷한다.
		String formattedDate = simpleDateFormat.format(new Date());
		System.out.println("현재 날짜와 시간 : " + formattedDate);
	}
}