package min.java.instance;

public class InformationInvoke {
	// price 인스턴스 변수를 선언한다.
	public int price;

	// price 멤버 변수를 100으로 증가시키는 메서드를 선언한다.
	public void priceUp() {
		// price 멤버 변수에 100을 더하여 값을 증가시킨다.
		price = price + 100;
	}

	public static void main(String[] args) {
		// InformationInvoke 객체를 생성하고 그 참조를 informationInvoke 인스턴스에 할당한다.
		InformationInvoke informationInvoke = new InformationInvoke();
		// informationInvoke 인스턴스의 price 멤버 변수에 1000을 할당한다.
		informationInvoke.price = 1000;
		// informationInvoke 인스턴스의 priceUp 메서드를 호출하여 price 멤버 변숫값을 증가시킨다.
		informationInvoke.priceUp();
		// priceUp 메서드에 의해서 100이 추가된 가격을 informationInvoke 인스턴스로 price 멤버 변수를 호출하여 출력한다.
		System.out.println("가격 = " + informationInvoke.price + "원");
	}
}