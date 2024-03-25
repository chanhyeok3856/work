package 실습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WedFour {
	public static void main(String[] args) throws  IOException {
		InputStreamReader inputStreamReader= new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int[] num = new int [2];
		int tot = 0;
		int ave;
		System.out.println("점수를 입력하세요.");
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1)+ "번째 점수:  ");
			num[i]=Integer.parseInt(bufferedReader.readLine());
			tot = tot + num[i];
			
		}
		ave = (int)tot/num.length;
		System.out.println("총점은"+tot+"점입니다.");
		System.out.println("평균은"+ave+"점입니다.");
		System.out.print(" <편차> ");
//		for (int n : num) {
//			System.out.print(" \n"+n+"점의 편차는"+ (n-ave)+"점입니다.");
			
		}
	}


