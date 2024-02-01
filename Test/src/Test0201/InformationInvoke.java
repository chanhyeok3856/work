package Test0201;

public class InformationInvoke {
	public int price;
	public void priceUp() {
		price = price+100;
		
	}
	public static void main(String[] args) {
		
		InformationInvoke informationInvoke = new InformationInvoke();
		informationInvoke.price = 1000;
		informationInvoke.priceUp();
		
		System.out.println(informationInvoke.price);
	}

}
