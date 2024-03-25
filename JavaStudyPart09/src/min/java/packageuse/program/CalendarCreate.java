package min.java.packageuse.program;

import java.util.Calendar;

public class CalendarCreate {
	// 달력의 헤더인 요일을 설정하는 배열로 7개 요일에 대한 1차원 배열을 리터럴 방식으로 선언한다.
	private String[] calHeader = { "일", "월", "화", "수", "목", "금", "토" };
	// 달력의 날짜를 출력하는 표를 설정하기 위해 6행 7열의 2차원 배열을 선언하므로 6주 곱하기 7일이 된다.
	private String[][] calDate = new String[6][7];
	// 달력의 한 주의 넓이를 설정하며 일주일은 7일이므로 배열의 크기를 사용한다.
	private int width = calHeader.length;
	// 해당 월의 시작 날짜를 설정하며 1은 일요일이고 7은 토요일이다.
	private int startDay;
	// 해당 월의 마지막 날짜를 설정한다.
	private int lastDay;
	// 입력 날짜를 1로 초기화한다.
	private int inputDate = 1;
	// 기본 시간대와 로케일을 사용하여 Calendar 인스턴스를 얻는다.
	Calendar calendar = Calendar.getInstance();

	// 입력한 년도와 월을 사용하여 Calendar 객체를 초기화하는 파라미터 생성자를 선언한다.
	public CalendarCreate(int year, int month) {
		// 조건에서 월이 1 미만이거나 12 초과인 경우의 조건을 체크한다.
		if (month < 1 || month > 12) {
			System.out.println("월은 1~12 사이의 숫자입니다. 다시 실행하세요.");
			// 12월을 초과하면 System 클래스의 exit 메서드로 JVM을 정상 종료한다.
			System.exit(0);
		} else {
			// 연도를 설정한다.
			calendar.set(Calendar.YEAR, year);
			// Calendar 클래스에서 월은 0은 1월이고 11은 12월이므로 1을 빼서 설정한다.
			calendar.set(Calendar.MONTH, month - 1);
			// 일을 설정하고 해당 월의 시작일을 1일로 설정한다.
			calendar.set(Calendar.DATE, 1);
			// 해당 월의 시작일에 대한 요일 정보를 얻는다.
			startDay = calendar.get(Calendar.DAY_OF_WEEK);
			// 해당 월의 마지막 날짜를 얻는다.
			lastDay = calendar.getActualMaximum(Calendar.DATE);
			int row = 0;
			// 1일부터 해당 월의 마지막 날짜까지 달력 배열에 날짜를 설정하고 반복한다.
			for (int i = 1; inputDate <= lastDay; i++) {
				// 조건을 시작 날짜보다 미만을 설정하여 시작 요일 이전의 위치는 비워둔다.
				if (i < startDay) {
					// 달력의 화면에서 시작 요일이 아닌 비어 있는 공간을 공백으로 설정한다.
					calDate[row][i - 1] = "";
				} else {
					// [0][0]부터 시작하고 열의 값을 너비 값인 calHeader 멤버 변수의 크기 7로 나눈 나머지를 설정한다.
					calDate[row][(i - 1) % width] = Integer.toString(inputDate);
					// 문자열로 표현한 입력 날짜를 1씩 증가한다.
					inputDate = inputDate + 1;
					// 조건으로 나머지가 0일 때 가로 마지막 열에 오면 행을 바꾸므로 한 주의 마지막 날인 토요일에 도달하면 다음 행으로 이동한다.
					if (i % width == 0) {
						row = row + 1;
					}
				}
			}
		}
	}

	// 달력 형태를 설정한다.
	public void call() {
		// 너비만큼 반복한다.
		for (int i = 0; i < width; i++) {
			// 일, 월, 화, 수, 목, 금, 토를 탭의 크기로 호출한다.
			System.out.print(calHeader[i] + "\t");
		}
		System.out.println();
		int column = 0;
		// 마지막 날짜와 시작 날짜를 더한 길이만큼 날짜를 반복한다.
		for (int j = 1; j < lastDay + startDay; j++) {
			// 일을 7로 나누어 탭의 크기를 호출한다.
			System.out.print(calDate[column][(j - 1) % width] + "\t");
			// 한 줄에 7일씩 호출한다.
			if ((j - 1) % width == width - 1) {
				System.out.println();
				column = column + 1;
			}
		}
	}
}