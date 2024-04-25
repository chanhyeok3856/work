package chan.spring.ioc;

public class InformationChange {
String string = "문자열입니다";
public static void main(String[] args) {
	new InformationChange().string = "인스턴스화 오브젝트로 접근한다.";
	System.out.println(new InformationChange().string);
	InformationChange informationChange = new InformationChange();
	informationChange.string = "인스턴스로 접근한다.";
	System.out.println(informationChange.string);
}
}
