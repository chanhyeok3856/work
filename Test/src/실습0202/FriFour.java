package 실습0202;

public class FriFour {
	public static void call(String aasdf) {
		System.out.println(aasdf + "안녕하세요.");
		System.out.println("name1의 해시 코드 : "+ aasdf.hashCode());
		
	}
	public static void main(String[] args) {
		String name2 = "이찬혁님";
		call(name2);
		System.out.println("name2의 해시 코드 : "+name2.hashCode());
	}

}
