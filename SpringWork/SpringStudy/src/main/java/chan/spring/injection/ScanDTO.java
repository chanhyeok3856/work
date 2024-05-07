package chan.spring.injection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScanDTO {
	
	private String name;
	private int age;
	@Override
	public String toString() {
		return "데이터정보 [이름=" + name + ", 나이=" + age + "]";
	}
	
}
