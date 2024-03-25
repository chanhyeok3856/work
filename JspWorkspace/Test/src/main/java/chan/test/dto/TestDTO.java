package chan.test.dto;

public class TestDTO {
	private String name ;
	private int age;
	@Override
	public String toString() {
		return "TestDTO [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
