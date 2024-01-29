package min.java.aaa;

import java.io.IOException;

public class mon1 {
	public static void main(String[] args) throws IOException {
		System.out.println("숫자입력");
		int i =System.in.read();
		//찍어본다. 로그확
		System.out.println(i);
		String check = "";
		//조건을 부여
		check = i%2==0 ? "짝수" : "홀수";
		System.out.println(check+"입니다.");
		
	}

}
