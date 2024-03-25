package min.java.classbased;

public class NameCall {
	public static void main(String[] args) {
// NameDTO 클래스의 인스턴스를 생성한다.
		NameDTO nameDTO = new NameDTO();
// name 프로퍼티에 홍길동을 저장한다.
		nameDTO.setName("홍길동");
// name 프로퍼티의 값을 호출하고 그 값을 name 변수에 할당한다.
		String name = nameDTO.getName();
		System.out.println("이름은 " + name + "입니다.");
	}
}