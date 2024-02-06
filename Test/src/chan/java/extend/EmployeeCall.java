package chan.java.extend;

public class EmployeeCall {
	public static void main(String[] args) {
EmployeeInherit employeeInherit = new EmployeeInherit("야",3,"너");
System.out.println("슈퍼 클래스의 멤버 변숫값 : "+employeeInherit.name+
		+employeeInherit.getAge()+employeeInherit.depart);
	}

}
