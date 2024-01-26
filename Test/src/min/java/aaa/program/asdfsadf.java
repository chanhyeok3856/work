package min.java.aaa.program;
import java.io.IOException;

public class asdfsadf {
    public static void main(String[] args) throws IOException {
        System.out.println("용어설명");
        System.out.print("1.객체");
        System.out.print(" 2.클래스");
        System.out.println();
        System.out.println("원하는 번호를 입력하세요 : ");

        // 개행 문자 소비
        System.in.read();

        // 숫자 입력 받기
        int digit = System.in.read() - '0';
        int choic = digit;

        // 로그 확인
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
    }
}

