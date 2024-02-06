package 실습0205;


class InnerAnonymous {
	public void change() {
		System.out.print("변경하고 ");
		
	}

}
public class Mon7{
	public static void main(String[] args) {
		InnerAnonymous innerAnonymous = new InnerAnonymous() {
		@Override
 public void change() {
	 super.change();
	 System.out.println("확인한다.");
 }
	};
innerAnonymous.change();
	}
}
