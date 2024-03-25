package 실습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WedSix {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String [] subname = {"국어", "영어","수학"};
		int[] sub = new int[subname.length + 1];
		float avg = 0.0f;
		for (int i = 0; i < sub.length-1; i++) {
			do {
				System.out.print(subname[i]+"=");
				sub[i]=Integer.parseInt(bufferedReader.readLine());
				
			} while (sub[i]<0||sub[i]>100);
			sub[sub.length -1]+=sub[i];
		}
		avg=sub[sub.length-1]/(float)(sub.length-1);
		System.out.println();
		System.out.println("총점 = "+sub[sub.length-1]);
		System.out.println("평균 = "+avg);
	}

}
