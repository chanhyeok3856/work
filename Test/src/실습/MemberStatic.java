package 실습;

public class MemberStatic {
	
	 
		static String name;
		//string 정적, 클래스 변수 name 은 null 로 초기화
		public static int age;
		//string 정적, 클래스 변수 age 는 0으로 초기화 
		//여기서 age는 뒤에 스태틱 변수 33로 초기화됨?
	static {
		age=33;
	}
	public static void main(String[] args) {
		System.out.println(name);
		
		name="홍길동";
				System.out.println(name);
		System.out.println(MemberStatic.age);
	}
	
	}


