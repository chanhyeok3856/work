package 실습0201;

public class Thurtwo {
	public static void main(String[] args) {
		String str1 = "홍길동";
		System.out.println("str 주소값 : "+ str1.hashCode());
		System.out.println("str1 결괏값 : "+str1);
		String str2 = str1;
		System.out.println("str2 주소값 : "+str2.hashCode());
		System.out.println("str2 결괏값 : "+str2);
		str2 = "전우치";
	
		System.out.println("str2 변경된 결괏값 : "+str2);
		System.out.println("str1 변경된 결괏값 : "+str1);
	}

}
