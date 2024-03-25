package 실습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mon0129 {
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int su1, su2;
		int tot;
		System.out.print("첫번째 수 =");
		su1 =Integer.parseInt(bufferedReader.readLine());
		System.out.print("두번째 수 =");
		su2 =Integer.parseInt(bufferedReader.readLine());
		if (su1>su2) {
			int temp = su1;
			su1 =su2;
			su2 =temp;
			
		}
		tot = su1 +su2;
		System.out.println();
		System.out.print(su1 + "과 "+su2 +"의 합은"+tot+"입니다.");
		
	}

}
