package study;

import java.util.Scanner;

public class DoWhileStudy {
public static void main(String[] args) {
	int input = 0, answer = 0;
	answer = (int)(Math.random()*100)+1;//1부터 100사이의 난수를 발생시킴
	Scanner scanner = new Scanner(System.in);
	do {
		System.out.print("1부터100사이의 수를 입력하세요 :");
		input = scanner.nextInt();
		if (input>answer) {
			System.out.println("더 작은수로 시도하세요");
		}else if (input<answer) {
			System.out.println("더 큰 수로 시도하세요");
		}
	} while (input!=answer);
	System.out.println("정답입니다");
}

}
