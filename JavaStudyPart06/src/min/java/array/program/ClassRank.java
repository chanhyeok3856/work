package min.java.array.program;

import java.util.Scanner;

public class ClassRank {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("반의 학생 수: ");
		int stuNumber = scanner.nextInt();
		// 사용자 입력의 학생 수에 따라 학생들의 이름을 저장할 문자열 배열을 생성한다.
		String name[] = new String[stuNumber];
		int nameNumber = 0;
		// 사용자로부터 학생들의 이름을 입력받는다.
		do {
			// 조건을 학생 수와 학생 이름의 수가 같게 설정한다.
			if (nameNumber == stuNumber) {
				// 학생 수와 학생 이름 수가 같으면 코드 블록을 빠져나간다.
				break;
			} else {
				System.out.print("이름: ");
				// 입력한 학생 이름을 1차원 name 배열 변수에 할당한다.
				name[nameNumber] = scanner.next();
				nameNumber++;
			}
		} while (true);
		// 각 과목, 총점, 석차에 대한 정보를 담는 배열을 선언하고 초기화한다.
		String[] arrange = { "국어", "영어", "수학", "총점", "석차" };
		// 학생별 과목 점수, 총점, 석차를 저장할 2차원 배열을 선언하며 학생 수에 대한 과목과 과목 점수를 저장한다.
		int[][] subject = new int[name.length][arrange.length];
		// 학생별 평균 점수를 저장할 실수형 배열을 선언한다.
		float average[] = new float[name.length];
		// 각 학생에 대해 각 과목의 점수를 입력받고 총점과 평균을 계산하고 과목과 과목 점수에 대한 학생 수를 반복한다.
		for (int i = 0; i < subject.length; i++) {
			System.out.println(name[i] + "의 점수를 입력하세요.");
			// 과목과 과목 점수를 반복한다.
			for (int j = 0; j < subject[i].length - 2; j++) {
				// 0에서 100 사이의 점수만 입력받도록 한다.
				do {
					System.out.print(arrange[j] + "=");
					// 과목과 과목 점수를 입력한다.
					subject[i][j] = scanner.nextInt();
					// 과목의 점수가 0점에서 100점의 범위를 초과하면 다시 호출하여 실행한다.
				} while (subject[i][j] < 0 || subject[i][j] > 100);
				// 총점을 계산하며 과목이 총 3개이므로 -2를 설정하고 입력한 과목의 점수를 할당한다.
				subject[i][subject[i].length - 2] += subject[i][j];
			}
			// 과목의 평균 점수를 계산한다.
			average[i] = subject[i][subject[i].length - 2] / (float) (subject[i].length - 2);
			// 각 학생의 초기 석차를 1로 초기화하여 1부터 시작할 수 있도록 할당한다.
			subject[i][subject[i].length - 1] = 1;
		}
		// 각 학생의 석차를 계산하고 각 학생의 총점을 다른 학생들의 총점과 비교하여 석차를 결정하고 반복한다.
		for (int i = 0; i < subject.length; i++) {
			for (int j = 0; j < subject.length; j++) {
				if (subject[i][subject[i].length - 2] < subject[j][subject[j].length - 2]) {
					// 현재 학생의 총점이 다른 학생의 총점보다 작을 때 석차를 1씩 증가시킨다.
					subject[i][subject[i].length - 1]++;
				}
			}
		}
		// 각 학생의 이름, 석차, 총점, 평균을 출력한다.
		for (int i = 0; i < subject.length; i++) {
			System.out.println(name[i] + ": " + subject[i][subject[i].length - 1] + "등, "
					+ subject[i][subject[i].length - 2] + "점, " + average[i] + " 평균");
		}
	}
}