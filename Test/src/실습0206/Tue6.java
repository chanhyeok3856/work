package 실습0206;

public class Tue6 {
	public static void main(String[] args) {
		String str = "java again study";
		//첫 번째 a 문자의 위치를 찾아 출력한다.
		System.out.println("1. a 문자의 첫 번째 인덱스 : "+str.indexOf('a'));
		//탐색 시작 위치를 인덱스 2로 지정하여 두 번째 a 문자의 위치를 찾아 출력한다.
		System.out.println("2. a 문자의 두 번째 인덱스 : "+str.indexOf('a', 2));
		System.out.println("3. a 문자의 세 번째 인덱스 : "+str.indexOf('a', 4));
		//3번째 a 문자의 문자를 대문자 A로 변경하고 출력한다.
	
		System.out.println("4. 세 번째 a문자의 문자 변경 : "+str.substring(0, str.indexOf('a', 4))+'A'+str.substring(str.indexOf('a',4) + 1));
	//a 문자의 마지막 인덱스를 탐색하고 출력한다.
		System.out.println("5. a 문자의 마지막 인덱스 : "+str.lastIndexOf('a'));
	//마지막 a 문자의 문자를 대문자 A로 변경하고 출력한다.
	System.out.println("6. 마지막 a 문자의 문자 변경 : "+ str.substring(0, str.lastIndexOf('a'))+'A'+str.substring(str.lastIndexOf('a')+1));
	System.out.println("7. 문자열의 접두사 : "+str.startsWith("java")+" "+ str.startsWith("j"));
	System.out.println("8. 문자열의 접미사 : "+str.endsWith("study")+" "+ str.endsWith("y"));
	}

}
