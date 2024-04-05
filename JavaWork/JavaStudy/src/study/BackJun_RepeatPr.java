package study;


import java.util.Scanner;

public class BackJun_RepeatPr {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	printNumbers(N);
}

	private static void printNumbers(int N) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
		
	}
	}
//for 문은 반복횟수 알 때
//while 문은 반복횟수 모를 때
//while() , ()안의 조건식이 참일때 까지 무한반복한다. false 가 되면 빠져나온다.