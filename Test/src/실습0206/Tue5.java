package 실습0206;

public class Tue5 {
	public static void main(String[] args) {
		//문자열 초기화
		String str = "java again study";
		//문자열의 a 문자를 c문자로 변경하고 출력한다.
		System.out.println("1. 문자열의 문자 변경 :"+str.replace('a', 'c'));
	//문자열에서 공백을 빈 문자열로 변경하여 모든 공백을 제거하고 출력.
		System.out.println("2. 문자열의 공백 제거 : "+str.replace(" ", ""));
		//문자열에서 1번 인덱스부터 9번 인덱스 전까지의 부분 문자열을 추출하고 출력한다.
	System.out.println("3. 문자열의 부분 문자열 추출 : "+ str.substring(1, 9));
	//문자열을 대문자로 변환하여 capitalLetter 변수에 할당한다.
	String capitalLetter = str.toUpperCase();
	//대문자로 변환된 문자열 출력.
	
	System.out.println("4. 문자열의 대문자 변환 : "+capitalLetter);
	//대문자로 변환된 문자열을 다시 소문자로 변환해 출력.
	System.out.println("5. 문자열의 소문자 변환 : "+capitalLetter.toLowerCase());
	//문자열에서 3번 인덱스에 위치한 a문자를 추출하고 출력한다.
	System.out.println("6. 문자열의 3번 인덱스값 추출 : "+str.charAt(3));
	
	System.out.println("7. 문자열의 4번 인덱스값 추출 : "+str.charAt(4));
	}

}
