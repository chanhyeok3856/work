package min.java.statement.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPass {
	private static BufferedReader bufferedReader;

	public static void main(String[ ] args) throws IOException {
		System.out.println("점수를 입력하세요.");
		// 키보드에 입력된 내용을 읽어온다.
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		// 입력된 내용을 임시로 저장하고 저장된 자료를 읽어온다.
		bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("국어 점수 = ");
		int kor = Integer.parseInt(bufferedReader.readLine( ));
		System.out.print("수학 점수 = ");
		int mat = Integer.parseInt(bufferedReader.readLine( ));
		System.out.print("영어 점수 = ");
		int eng = Integer.parseInt(bufferedReader.readLine( ));
		int total = 0;
		total = kor + mat + eng;
		// 180점 이상이면 합격 점수를 확인한다.
		if(total >= 180) {
			// 한 과목이라도 점수가 40점 미만일 경우에 호출하며 한 과목만 확인하면 되므로 더블 버티컬바 연산자를 사용한다.
			if(kor < 40 || mat < 40 || eng < 40) {
				System.out.println("과락이므로 불합격입니다.");
			} else {
				System.out.println("합격입니다.");
			}
		} else {
			System.out.println("총점이 부족하므로 불합격입니다.");
		}
	}
}