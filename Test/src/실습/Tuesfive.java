package 실습;
import java.util.Scanner;
public class Tuesfive {	
	public static void main(String arg[]) {
	
		Scanner scanner = new Scanner(System.in);		
		
	
		double b = Math.random();	
		int a = (int) ((b * 50) + 1);
		do {
			System.out.print("입력한 숫자 : ");
		int	c=scanner.nextInt();
		
		if (c < 1) {
			System.out.println("잘못 입력하셨습니다");
			} else if (c > 50) {	
				System.out.println("잘못 입력하셨습니다");
				} else if (c > a) {	
					System.out.println("다운");		
					} else if (c < a) {
						System.out.println("업");		
						} else {			
							System.out.println("정답");
							
						
						}		
	
		}while (true);
	
}
}
