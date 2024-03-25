package min.java.array.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deviation {
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		// 배열의 크기가 2인 1차원 배열을 선언한다.
		int[] num = new int[2];
		int tot = 0;
		int ave;
		System.out.println("점수를 입력하세요.");
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 점수:  ");
			num[i] = Integer.parseInt(bufferedReader.readLine());
			// 입력받은 점수를 총점에 더한다.
			tot = tot + num[i];
		}
		// 평균을 계산한다.
		ave = (int) tot / num.length;
		System.out.println(" 총점은 " + tot + "점입니다.");
		System.out.println(" 평균은 " + ave + "점입니다.");
		System.out.print(" <편차> ");
		// 각 점수와 평균의 차이를 편차로 계산하여 출력하며 편차는 점수와 평균의 차이를 나타내는 수치다.
		for (int n : num) {
			System.out.print(" \n" + n + "점의 편차는 " + (n - ave) + "점입니다.");
		}
	}
}