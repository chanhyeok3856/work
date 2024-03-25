package min.java.instance;

public class InformationChange {
	// 인스턴스 변수를 선언하고 초기화한다.
	String string = "문자열입니다.";

	public static void main(String[] args) {
		// 새로운 InformationChange 객체를 생성하고 객체의 string 변수를 변경한다.
		new InformationChange().string = "인스턴스화 오브젝트로 접근한다.";
		// 새로운 인스턴스를 생성하므로 기존에 초기화된 값이 출력된다.
		System.out.println(new InformationChange().string);
		// InformationChange 타입의 인스턴스를 선언하고 초기화한다.
		InformationChange informationChange = new InformationChange();
		// informationChange 인스턴스를 통해 string 변수를 변경한다.
		informationChange.string = "인스턴스로 접근한다.";
		System.out.println(informationChange.string);
	}
}