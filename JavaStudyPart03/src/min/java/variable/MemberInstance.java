package min.java.variable;

public class MemberInstance {
	// 인스턴스 멤버 변수를 선언한다.
	String name;
	int age;

	public static void main(String[] args) {
		MemberInstance memberInstance = new MemberInstance();
		// 인스턴스 멤버 변수의 초깃값을 출력한다.
		System.out.println("이름 : " + memberInstance.name);
		System.out.println("나이 : " + memberInstance.age);
		// 인스턴스 멤버 변수에 값을 할당한다.
		memberInstance.name = "홍길동";
		memberInstance.age = 33;
		System.out.println("이름 : " + memberInstance.name);
		System.out.println("나이 : " + memberInstance.age);

	}
}
