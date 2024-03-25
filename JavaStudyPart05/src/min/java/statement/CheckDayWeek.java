package min.java.statement;

public class CheckDayWeek {
	public static void main(String[] args) {
		// String 타입의 day 변수를 선언하고 Sunday 문자열을 할당한다.
		String day = "Sunday";
		// day 변수의 값을 검사하여 해당하는 요일을 출력하며 문자열 타입은 JDK 7버전부터 지원된다.
		switch (day) {
		case "Monday":
			System.out.println("오늘은 월요일입니다.");
			break;
		case "Tuesday":
			System.out.println("오늘은 화요일입니다.");
			break;
		case "Wednesday":
			System.out.println("오늘은 수요일입니다.");
			break;
		case "Thursday":
			System.out.println("오늘은 목요일입니다.");
			break;
		case "Friday":
			System.out.println("오늘은 금요일입니다.");
			break;
		case "Saturday":
			System.out.println("오늘은 토요일입니다.");
			break;
		case "Sunday":
			System.out.println("오늘은 일요일입니다.");
			break;
		// 입력된 요일 문자열이 기대되는 값들과 일치하지 않을 때 default 문을 실행한다.
		default:
			System.out.println("설정된 요일이 없습니다.");
		}
	}
}