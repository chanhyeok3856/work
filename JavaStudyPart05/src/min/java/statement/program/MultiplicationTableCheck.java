package min.java.statement.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTableCheck {
	public static void main(String[] args) throws IOException {
		System.out.println("확인하고 싶은 구구단의 단을 입력하세요.");
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("단 입력: ");
		int dan = Integer.parseInt(bufferedReader.readLine());
		// 입력받은 단의 값이 2부터 9까지일 경우에만 구구단을 출력하며 그렇지 않으면 오류 메시지가 출력된다.
		if (dan >= 2 && dan <= 9) {
			int num = 1;
			int result = 0;
			// 1부터 9까지 반복하여 구구단을 출력한다.
			while (num <= 9) {
				result = dan * num;
				System.out.println(dan + " * " + num + " = " + result);
				num = num + 1;
			}
		} else {
			System.out.println("단의 값이 잘못되었습니다.");
		}
	}
}