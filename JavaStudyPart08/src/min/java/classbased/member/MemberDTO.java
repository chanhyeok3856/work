package min.java.classbased.member;

public class MemberDTO {
	private String name;
	private int age;

	// name과 age 인자를 받아 멤버 변수를 초기화하는 생성자를 정의한다.
	public MemberDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// name 변수의 값을 반환하는 getter 메서드를 정의한다.
	public String getName() {
		return name;
	}

	// age 변수의 값을 반환하는 getter 메서드를 정의한다.
	public int getAge() {
		return age;
	}
}
