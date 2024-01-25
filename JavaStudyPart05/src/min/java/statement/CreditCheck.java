package min.java.statement;

public class CreditCheck {
	public static void main(String[] args) {
		// int 타입의 score 변수를 선언하고 90을 할당한다.
		int score = 90;
		// char 타입의 grade 변수를 선언한다.
		char grade;
		// 점수를 10으로 나눈 결과에 따라 switch 문을 수행한다.
		switch (score / 10) {
		// 점수가 90점 이상일 때 A 학점을 부여한다.
		case 10:
			grade = 'A';
			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		// 점수가 60점 미만일 때 F 학점을 부여한다.
		default:
			grade = 'F';
		}
		// break 문이 없으면 점수와 관계없이 순차적으로 case 문을 수행하므로 학점을 받을 점수라도 D 또는 F 학점이 부여될 수 있다.
		System.out.println("학점은 " + grade + "다.");
	}
}