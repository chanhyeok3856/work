package 실습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tuesthree {

	public static void main(String[] args) throws  IOException {
		System.out.println("2020년까지 윤년과 평년을 확인합니다. ");
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		System.out.print("년도 입력 : ");
		int j = Integer.parseInt(bufferedReader.readLine());
		for (int i = j; i <= 2020; i++) {
			if (0 == (i % 4) && 0 != (i % 100)||0 ==(i %400)) {
				System.out.println(i+ "년은 윤년입니다.");
			} else {
System.out.println(i + "년은 평년입니다.");
			}
		}
		
		}
		

}
