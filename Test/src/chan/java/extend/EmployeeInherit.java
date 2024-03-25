package chan.java.extend;

public class EmployeeInherit extends Employee{
	String depart;

	public EmployeeInherit(String name, int age, String depart) {
		super(name, age);
		this.depart = depart;
		// TODO Auto-generated constructor stub
	}
public String name() {
	return name+depart;
}
}
