package min.java.aaa.program;

import java.io.IOException;

/*
 * 프로젝트 이름 : 용어사전
 * 사용할 API : 문자열, 출력
 * 추가한 API : 
 * 부가 기능 : 
 * 불편한 사항들 : 
 * ? : int는 어떻게 하자
 * *
 */
public class DictionaryTerms {
	
public static void main(String[] args) throws IOException {
	System.out.println("용어설명");
	System.out.print("1.객체");
	System.out.print(" 2.클래스");
	System.out.println();
	System.out.println("원하는 번호를 입력하세요 : ");
//"1"1
	char choic = (char)System.in.read();
	//로그 확인 =>찍어본다
	//System.out.println(choic);
	// 정수는 그냥 기입, 문자는 작은따옴표, 문자열은 큰따옴표
	
	switch (choic) {
	case '1':
		System.out.println("객체는 어렵다.");
		break;
	case '2':
		System.out.println("클래스는 더 어렵다.");
		break;
	default:
		break;


	}

	
}
}
