package min.java.datatype;

public class CharacterType {
	 // main 메서드는 프로그램의 시작점으로 JVM에 의해 자동으로 호출된다.
	public static void main(String[ ] args) {
		 // char 타입의 kword 변수를 선언한다.
		char kword;
		// char 타입의 eword 변수를 선언한다.
		char eword;
		// kword 변수에 한글 문자 '삶'을 할당하며 모든 유형의 글자 형태와 관계없이 한 글자만 가능하다.
		kword = '삶';
		// eword 변수에 영어 문자 'a'를 할당하며 모든 유형의 글자 형태와 관계없이 한 글자만 가능하다.
		eword = 'a';
	     // kword 값인 삶을 출력한다.
		System.out.println("한글: " + kword);
		// eword 값인 a를 출력한다.
		System.out.println("영어: " + eword);
	}
}