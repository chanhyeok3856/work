package 실습;

import java.util.Scanner;

public class montwo0129 {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 :  ");
	num = scanner.nextInt();
	if (num % 2 == 1) {
		System.out.println("홀수를 선택하셨습니다.");
		
	}else {
		System.out.println("짝수를 선택하셨습니다.");
	}
	scanner.close();
	
	}

}
