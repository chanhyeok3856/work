package min.java.classbased.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterScore {
	public static int getInt(String score) throws IOException {
		// 키보드에서 입력된 내용을 읽어온다.
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		// 키보드에 입력되는 내용을 버퍼에 임시로 저장하고 저장된 데이터를 읽어온다.
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print(score);
		// 키보드에 입력된 한 줄 텍스트를 읽으며 읽어온 데이터를 부호 없는 정수로 구문 분석한다.
		int num = Integer.parseInt(bufferedReader.readLine());
		// 변환된 정수를 반환한다.
		return num;
	}

	public static void main(String[] args) throws IOException {
		// getInt 메서드는 int 반환 타입이므로 반드시 int 타입의 변수에 할당한다.
		int kor = getInt("국어 점수 입력 : ");
		System.out.println("국어 점수는 " + kor + "점입니다.");
	}
}