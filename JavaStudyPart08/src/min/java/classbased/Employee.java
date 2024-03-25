package min.java.classbased;

public class Employee {
	// protected 접근 제한자로 선언되었으므로 서브 클래스에서만 사용한다.
	protected String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}