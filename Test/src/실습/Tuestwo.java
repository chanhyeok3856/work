package 실습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tuestwo {
	public static void main(String[] args) throws  IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int su1, su2;
		int tot =0;
		System.out.println("첫 번째 수 = ");
		su1 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("두 번째 수 = ");
		su2 = Integer.parseInt(bufferedReader.readLine());
		if (su1>su2) {
		int temp =su1;
		su1 = su2;
		su2 =temp;
		
		}
		for (int i = su1; i <=su2; i++) {
			tot +=i;
			
		}
		System.out.println(su1 + "에서"+ su2 + "의 값은"+ tot +"입니다.");
	}

}
