package min.java.statement.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYearVerification {
	public static void main(String[] args) throws IOException {
		System.out.println("2020년까지 윤년과 평년을 확인합니다. ");
		// 키보드에서 입력된 내용을 읽어온다.
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		// 키보드에 입력되는 내용을 버퍼에 임시로 저장하고 저장된 데이터를 읽어온다.
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("년도 입력: ");
		// 키보드에 입력된 한 줄 텍스트를 읽으며 읽어온 데이터를 부호 없는 정수로 구문 분석하고 분석 결과를 j 변수에 할당한다.
		int j = Integer.parseInt(bufferedReader.readLine());
		// 입력한 연도부터 2020년까지의 모든 연도를 확인한다.
		for (int i = j; i <= 2020; i++) {
			// 조건에 윤년 구하는 공식을 설정하고 퍼렌씨시스(( )) 연산자로 연산자 강제 우선순위로 계산하여 윤년을 확인한다.
			if (0 == (i % 4) && 0 != (i % 100) || 0 == (i % 400)) {
				System.out.println(i + "년은 윤년입니다.");
			} else {
				System.out.println(i + "년은 평년입니다.");
			}
		}
	}
}