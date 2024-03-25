package min.java.aaa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class mon7 {
	private static Scanner scanner;
	public static void main(String[] args)  {
		
		
		scanner  = new Scanner (System.in);
		int su1, su2;
		int tot;
		
		//su1 =>5 su2 =>5 su1 + su2=tot
		//웹 브라우저에서 나이를 입력 받았을 때, 자바에서 숫자 변경 => 웹 브라우저는 모든 타입이 문자열이다.
	System.out.print("첫번째 숫자 :");
//su1 = Integer.parseInt(bufferReader.readLine());
	su1 =scanner.nextInt();
//System.out.println(su1);
System.out.print("두번째 숫자 :");
//su2 = Integer.parseInt(bufferReader.readLine());
su2 =scanner.nextInt();



if (su1>su2) {
	int temp = su1;
	su1 = su2;
	su2 = temp;
	
}
//scanner.close();
tot = su1+su2;
//System.out.println("두 숫자의 합"+tot);
System.out.println(su1 + "과" +su2 + "의 합은" +tot + "입니다.");
	
	}

	

	


	


	

}
