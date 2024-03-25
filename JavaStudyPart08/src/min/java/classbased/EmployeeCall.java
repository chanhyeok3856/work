package min.java.classbased;

public class EmployeeCall {
	public static void main(String[] args) {
		// 인스턴스를 생성하고 파라미터 생성자에 매개 변숫값을 설정한다.
		Employee employee = new Employee("홍길동");
		// 인스턴스를 생성하고 파라미터 생성자에 매개 변숫값을 설정한다.
		EmployeeInherit employeeInherit = new EmployeeInherit("전우치 ", " 개발부");
		// 슈퍼 클래스의 파라미터 생성자의 매개 변수를 호출하고 실행한다.
		System.out.println(employee.getName());
		// 서브 클래스의 파라미터 생성자의 매개 변수를 호출하고 실행한다.
		System.out.println(employeeInherit.getManager());
	}
}