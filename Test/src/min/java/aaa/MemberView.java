package min.java.aaa;

import java.util.Scanner;

public class MemberView {
	public static void main(String[] args) {
		memberDTO memberDTO = new memberDTO();
		System.out.println(memberDTO.age);
		System.out.println(memberDTO.name);
		Scanner scanner= new Scanner(System.in);
		System.out.print("당신의나이");
		
		memberDTO.age=scanner.nextInt();
		System.out.print("당신의이름");
		
		memberDTO.name=scanner.next();
		System.out.println(memberDTO.age);
		System.out.println(memberDTO.name);
	}

}
