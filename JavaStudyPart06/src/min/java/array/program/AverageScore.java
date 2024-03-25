package min.java.array.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageScore {
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		// 과목 이름에 대한 리터럴 배열을 선언하며 만약에 총점을 배열의 요소로 설정하면 {"국어", "영어", "수학", "총점"}이 된다.
		String[] subname = { "국어", "영어", "수학" };
		// [0]:국어 [1]:영어 [2]:수학 [3]:총점인 인덱스를 가지며 총점은 별도의 요소를 설정하지 않고 1로 길이만 증가시킨다.
		int[] sub = new int[subname.length + 1];
		float avg = 0.0f;
		// 과목만 필요하므로 배열의 크기에서 총점을 빼기 위해 1을 빼주고 각 과목에 대해 점수를 입력받고 과목을 반복한다.
		for (int i = 0; i < sub.length - 1; i++) {
			do {
				System.out.print(subname[i] + " = ");
				sub[i] = Integer.parseInt(bufferedReader.readLine());
				// 점수가 0~100 범위 안에 있을 때까지 반복하여 입력한다.
			} while (sub[i] < 0 || sub[i] > 100);
			// 입력받은 과목 점수를 총점에 더한다.
			sub[sub.length - 1] += sub[i];
		}
		// 총점을 과목 수로 나눠 평균을 구한다.
		avg = sub[sub.length - 1] / (float) (sub.length - 1);
		System.out.println();
		System.out.println("총점 = " + sub[sub.length - 1]);
		System.out.println("평균 = " + avg);
	}
}