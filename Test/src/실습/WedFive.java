package 실습;

import java.util.Scanner;

public class WedFive {
private static Scanner scanner;
public static void main(String[] args) {
	int year, mon, date, i;
 scanner = new Scanner (System.in);
 while (true) {
	System.out.println("연도를 입력하세요(1900년 이후) : ");
	year = scanner.nextInt();
	if(year<1990) {
		System.out.println("1900년 이전 연도입니다. 다시 실행하세요.");
		System.exit(0);
	}
	System.out.print("월을 입력하세요(1~12월) : ");
	mon = scanner.nextInt();
	System.out.println("\n"+year+"년"+mon+"월 달력입니다.");
	System.out.println("---------------------------------");
	System.out.print("일\t월\t화\t수\t목\t금\t토\n");
	System.out.println("---------------------------------");
	date = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
	int leafday =28;
	if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
		leafday=29;
	}
	int[]month = {0,31,leafday,31,30,31,30,31,31,30,31,30,31};
	for (i = 0; i < mon; i++) {
		date += month[i];
	}
	int weekday = 0;
	weekday = (date+1) % 7;
	for (i = 0;  i< mon; i++) {
System.out.print("\t"+"");
	}
	
	for (i = 0;  i<=month[mon]; i++) {
		System.out.printf("%d\t",i);
		if ((date + i) % 7 == 6)System.out.println(); 
			
		}
	System.out.println("\n--------------------------------\n");
	System.exit(0);
		
	}
	}
	

}


