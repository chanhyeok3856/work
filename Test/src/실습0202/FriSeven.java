package 실습0202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FriSeven {
	public static int getInt(String score) throws NumberFormatException, IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print(score);
		int num= Integer.parseInt(bufferedReader.readLine());
		return num;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		int kor = getInt("국어 점수 입력 : ");
		System.out.println("국어 점수는 "+kor+ "점입니다.");
	}

}
