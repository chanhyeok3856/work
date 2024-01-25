package min.java.classbased;

public class ThisMethod {
	private String name;
	private int age;

	// 파라미터 생성자를 선언한다.
	public ThisMethod(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 파라미터 생성자를 오버로딩된 생성자로 name 매개 변수만 받고 age 매개 변수는 33으로 초기화한다.
	public ThisMethod(String name) {
		this(name, 33);
	}

	// 주소값을 실제값으로 반환하며 객체의 상태인 멤버 변숫값을 문자열 표현으로 반환한다.
	@Override
	public String toString() {
		return "ThisMethod [name=" + name + ", age=" + age + "]";
	}
}