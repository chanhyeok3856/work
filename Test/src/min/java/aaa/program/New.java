package min.java.aaa.program;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        System.out.println("용어설명");
        System.out.print("1.객체");
        System.out.print(" 2.클래스");
        System.out.println();
        System.out.println("원하는 번호를 입력하세요 : ");

        // Scanner를 사용하여 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);
        int choic = scanner.nextInt();

        // 로그 확인 => 찍어본다
        // System.out.println(choic);

        switch (choic) {
            case 1:
                System.out.println("객체는 어렵다.");
                break;
            case 2:
                System.out.println("클래스는 더 어렵다");
                break;
            default:
                break;
        }

        // Scanner 사용 후에는 닫아주는 것이 좋음
        scanner.close();
    }
}

