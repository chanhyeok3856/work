package min.java.statement;

public class CreditOutput {
	public static void main(String[] args) {
		// 점수를 초기화한다.
		int score = 99;
		// 학점을 저장하기 위한 char 타입의 grade 변수를 선언한다.
		char grade;
		// 점수에 따른 학점을 결정한다.
		if (score >= 90) {
			// 점수가 90점 이상일 경우 A 학점을 부여한다.
			grade = 'A';
		} else if (score >= 80) {
			// 점수가 80점 이상이지만 90점 미만일 경우 B 학점을 부여한다.
			grade = 'B';
		} else if (score >= 70) {
			// 점수가 70점 이상이지만 80점 미만일 경우 C 학점을 부여한다.
			grade = 'C';
		} else {
			// 점수가 70점 미만일 경우 D 학점을 부여한다.
			grade = 'D';
		}
		// 결정된 학점을 출력한다.
		System.out.println("학점은 " + grade + "다.");
	}
}