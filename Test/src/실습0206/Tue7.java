package 실습0206;

public class Tue7 {
	public static void main(String[] args) {
		String str1 = " java ";
		String str2 = "java";
		String str3 = "JAVA";
		
		int point = str2.compareTo(str3);
		
		System.out.println("문자열의 위치값 : "+point);
		
		str1 = str1.strip();
		if (str1.compareTo(str2)==0) {
			String result = str1.repeat(2);
			System.out.println("문자열의 결괏값 : "+result);
			
		}else {
			System.out.println("대소문자를 구분하므로 비교할 수가 없습니다.");
		}
	}

}
