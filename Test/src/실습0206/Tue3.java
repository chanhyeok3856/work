package 실습0206;

public class Tue3 {
public static void main(String[] args) {
	//힙 영역에 새로운 자바 문자열 객체를 생성하고 인스턴스에 주소값을 할당한다.
String str1 = new String("자바");
String str2 = new String ("자바");
System.out.println("str1과 str2 시스템 주소 : "+System.identityHashCode(str1)+", "+System.identityHashCode(str2));
//문자열 상수풀에서 자바 문자열의 주소값을 인스턴스에 할당.
String str3 = "자바";
String str4 = "자바";
System.out.println("str3과 str4 시스템 주소 : "+System.identityHashCode(str3)+", "+System.identityHashCode(str4));
//str1의 값을 가진 문자열을 상수풀에서 찾아 str5 인스턴스에 주소값을 할당하고 없으면 상수풀에 추가한다.
String str5 = str1.intern();
System.out.println("str5 시스템 주소 : "+System.identityHashCode(str5));
System.out.println("str3과 str5의 주소 비교 : "+(str3 == str5));
if (str1 == str2) {
	System.out.println("str1과 str2은 주소가 같다.");
	
}else {
	System.out.println("str1과 str2 는 주소가 같지 않다.");
	
}
if (str3 == str4) {
	System.out.println("str3과 str4 는 주소가 같다.");
}
if (str1.equals(str2)) {
	System.out.println("str1과 str2은 실제값이 같다.");
}
}
}
