package min.java.statement.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersPlus {
	public static void main(String[] args) throws IOException {
		// 키보드에서 입력된 내용을 읽어온다.
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		// 키보드에 입력되는 내용을 버퍼에 임시로 저장하고 저장된 데이터를 읽어온다.
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int su1, su2;
		int tot;
		System.out.print("첫 번째 수 = ");
		// 키보드에 입력된 한 줄 텍스트를 읽으며 읽어온 데이터를 부호 없는 정수로 구문 분석한다.
		su1 = Integer.parseInt(bufferedReader.readLine());
		System.out.print("두 번째 수 = ");
		su2 = Integer.parseInt(bufferedReader.readLine());
		// 입력된 두 수 중 su1 변숫값이 su2 변숫값보다 크다면 두 수의 위치를 바꾼다.
		if (su1 > su2) {
			int temp = su1;
			su1 = su2;
			su2 = temp;
		}
		tot = su1 + su2;
		System.out.println();
		System.out.print(su1 + "과 " + su2 + "의 합은 " + tot + "입니다.");
	}
}