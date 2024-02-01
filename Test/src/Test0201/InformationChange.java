package Test0201;

public class InformationChange {
	//외부에서 전송된 문자열을 저장하는 변수.
	String string = "문자열입니다.";
	public static void main(String[] args) {
		new InformationChange().string="인스턴스화";
		//오브젝트를 new를 사용해서 인스턴스를 만들었다.
		//스택구조를 new를 사용해서 힙 구조로 만들었다.
		//변경할 수 없는 객체를 변경 할 수 있는 객체로 만들었다.
		//접근할 수 없는 객체를 접근 할 수 있는 객체로 만들었다.
		//오브젝트를 인스턴스처럼 사용할 수 있는 객체를 만들었다. = 인스턴스화
		//==========================//
		//인스턴스화 객체를 참조해서 멤버변수에 접근한다.=>참조의 기호는 . 이다.
		
		
		System.out.println(new InformationChange().string);
		//오브젝트에 접근하기 위해서 로컬변수를 만들었다.
		//로컬 변수는 오브젝트의 구조를 그대로 가지고 있다.
		InformationChange informationChange;
		//로컬 변수를 new연산자를 통해서 클래스를 동작시켜 사용자가 접근 할 수 있는 공간으로 변경한다.
		informationChange = new InformationChange();
		informationChange.string="어렵다";
		System.out.println(informationChange.string);
		
	}

}
