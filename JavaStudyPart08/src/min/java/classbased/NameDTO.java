package min.java.classbased;

public class NameDTO {
	// 이름을 저장하는 프로퍼티를 선언한다.
	private String name;

	// name 프로퍼티의 값을 반환하는 메서드를 선언한다.
	public String getName() {
		return name;
	}

	// name 프로퍼티의 값을 설정하는 메서드를 선언한다.
	public void setName(String name) {
		this.name = name;
	}
}