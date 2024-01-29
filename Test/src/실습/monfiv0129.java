package 실습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class monfiv0129 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader 		bufferedReader = new 		BufferedReader(inputStreamReader);
		int su1,su2,tot =0;
		char sign = 0;
		System.out.print("첫 번째 수 = ");
		su1 =Integer.parseInt(bufferedReader.readLine());
	System.out.print("연산자 (+, -, *, /, %) = ");
		sign = (char)System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("두 번째 수 = ");
		su2 = Integer.parseInt(bufferedReader.readLine());
		switch (sign) {
		case '+':
			tot=su1+su2;
			break;
case '-':
	tot=su1-su2;
			break;
case '*':
	tot=su1*su2;
	break;
case '/':
	tot=su1/su2;
	break;
case '%':
	tot=su1%su2;
	break;

		default:
			System.out.println("잘못된 연산자를 입력하였습니다.");
			
			System.exit(0);
		}
	System.out.println(su1 + " "+sign+""+su2+"="+tot);
	
	}

}
