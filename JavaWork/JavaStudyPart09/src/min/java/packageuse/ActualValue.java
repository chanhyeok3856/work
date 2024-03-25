package min.java.packageuse;

public class ActualValue {
	// 인스턴스 멤버 변수를 선언한다.
	private String name;
	private int age;

	// 파라미터 생성자를 생성하여 멤버 변숫값을 초기화하고 임시로 저장한다.
	public ActualValue(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 주소값을 실제값으로 반환한다.
	@Override
	public String toString() {
		return "ActualValue [name=" + name + ", age=" + age + "]";
	}
}