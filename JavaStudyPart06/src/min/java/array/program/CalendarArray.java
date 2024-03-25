package min.java.array.program;

import java.util.Scanner;

public class CalendarArray {
	private static Scanner scanner;

	public static void main(String[] args) {
		// 연, 월, 일, 반복자 변수를 선언한다.
		int year, mon, date, i;
		scanner = new Scanner(System.in);
		while (true) {
			// 사용자에게 연도를 입력받는다.
			System.out.print("연도를 입력하세요(1900년 이후) : ");
			year = scanner.nextInt();
			// 조건을 1900년 이전으로 설정하며 1900년 이전의 연도는 유효하지 않으므로 검사한다.
			if (year < 1900) {
				System.out.println("1900년 이전 연도입니다. 다시 실행하세요.");
				// 19세기의 마지막 해인 1900년 이전이며 System 클래스의 exit 메서드로 JVM을 정상 종료한다.
				System.exit(0);
			}
			// 사용자에게 월을 입력받는다.
			System.out.print("월을 입력하세요(1~12월) : ");
			mon = scanner.nextInt();
			// 입력받은 연도와 월을 출력한다.
			System.out.println("\n" + year + "년 " + mon + "월 달력입니다.");
			System.out.println("-----------------------------------------------------------");
			System.out.print("일\t월\t화\t수\t목\t금\t토\n");
			System.out.println("-----------------------------------------------------------");
			// 입력한 연도의 1월 1일까지의 총 날짜를 계산하며 만약에 year 변수에 0을 할당하면 전년도 기준의 -365일이 저장된다.
			date = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
			// 윤년일 때 2월의 일 수를 조정한다.
			int leafday = 28;
			// 윤년으로 확인하고 2월의 일 수를 결정하며 조건이 거짓이면 28일을 적용하고 조건이 참이면 29일을 적용한다.
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				leafday = 29;
			}
			// 각 월의 일 수를 저장한 리터럴 배열을 선언한다.
			int[] month = { 0, 31, leafday, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			// 입력한 월의 1일까지의 총 날짜수를 계산하고 월의 날짜를 반복한다.
			for (i = 0; i < mon; i++) {
				date += month[i];
			}
			int weekday = 0;
			// 1900년 1월 1일이 월요일이므로 1을 더해서 일주일의 시작 위치를 일요일부터 시작하도록 설정한다.
			weekday = (date + 1) % 7;
			// 1일이 시작되는 요일 전까지는 공백으로 두며 월의 1일에 설정된 요일을 제외한 앞의 요일은 빈 문자열로 처리한다.
			for (i = 0; i < weekday; i++) {
				// \t 이스케이프 문자로 탭의 크기만큼 공간으로 출력한다.
				System.out.print("\t" + "");
			}
			// 월을 출력한다.
			for (i = 1; i <= month[mon]; i++) {
				// %d 표준서식으로 월을 정수로 표현하여 출력한다.
				System.out.printf("%d\t", i);
				// 코드 블록을 생략하고 출력할 때의 세로줄을 7줄로 설정하여 출력하며 토요일에 줄 바꿈을 한다.
				if ((date + i) % 7 == 6)
					System.out.println();
			}
			System.out.println("\n---------------------------------------------------\n");
			System.exit(0);
		}
	}
}