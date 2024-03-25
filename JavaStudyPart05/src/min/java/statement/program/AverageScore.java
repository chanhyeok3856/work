package min.java.statement.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageScore {
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int korean, english, mathematics, total;
		// 평균을 계산하기 위한 변수를 부동소수점인 0.0f로 초기화한다.
		float average = 0.0f;
		System.out.println("점수를 입력하세요.");
		do {
			System.out.print("국어 점수 = ");
			korean = Integer.parseInt(bufferedReader.readLine());
			// 입력한 정수가 0 미만이거나 100 초과이면 유효하지 않은 점수로 간주하고 do 문으로 사용자에게 다시 입력을 요청한다.
		} while (korean < 0 || korean > 100);
		do {
			System.out.print("영어 점수 = ");
			english = Integer.parseInt(bufferedReader.readLine());
		} while (english < 0 || english > 100);
		do {
			System.out.print("수학 점수 = ");
			mathematics = Integer.parseInt(bufferedReader.readLine());
		} while (mathematics < 0 || mathematics > 100);
		total = korean + english + mathematics;
		// total 변수를 부동 소수형 3.0f로 나누어 평균을 계산하고 그 결과를 float 타입의 average 변수에 할당한다.
		average = total / 3.0f;
		System.out.println("총점 = " + total);
		// %.2f로 평균값을 부동소수점의 자릿수를 2자리까지 제한하여 출력하고 \n 문자로 줄 바꿈한다.
		System.out.printf("평균 = %.2f\n", average);
	}
}