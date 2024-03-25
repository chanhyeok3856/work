package min.java.classbased;

// Employee 클래스를 상속하는 EmployeeInherit 클래스를 선언한다.
public class EmployeeInherit extends Employee {
	String depart;

	public EmployeeInherit(String name, String depart) {
		// 첫 라인에서 슈퍼 클래스의 파라미터 생성자의 매개 변수를 호출하고 초기화한다.
		super(name);
		this.depart = depart;
	}

	// 파라미터 생성자의 매개 변수를 반환한다.
	public String getManager() {
		return name + depart;
	}
}