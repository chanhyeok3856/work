package min.java.statement.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumTwoNumbers {
	public static void main(String[] args) throws IOException {
		// 키보드에서 입력된 내용을 읽어온다.
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		// 키보드에 입력되는 내용을 버퍼에 임시로 저장하고 저장된 데이터를 읽어온다.
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int su1, su2;
		int tot = 0;
		System.out.print("첫 번째 수 = ");
		// 키보드에 입력된 한 줄 텍스트를 읽으며 읽어온 데이터를 부호 없는 정수로 구문 분석한다.
		su1 = Integer.parseInt(bufferedReader.readLine());
		System.out.print("두 번째 수 = ");
		su2 = Integer.parseInt(bufferedReader.readLine());
		// 입력된 두 수를 비교하여 큰 수가 su1 변수에 있으면 두 수를 교환한다.
		if (su1 > su2) {
			int temp = su1;
			su1 = su2;
			su2 = temp;
		}
		// 입력받은 두 수 사이의 모든 수를 반복하면서 각 숫자를 tot 변수에 더한다.
		for (int i = su1; i <= su2; i++) {
			// 반복마다 i 변숫값을 tot 변수에 더한다.
			tot += i;
		}
		System.out.print(su1 + "에서 " + su2 + " 사이의 합은 " + tot + "입니다.");
	}
}