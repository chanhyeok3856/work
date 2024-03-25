package chan.java.member.serive;


class Inner{
	public void change() {
		System.out.println("변경하고");
	}
}
public class RealName {
	public static void main(String[] args) {
		Inner inner = new Inner() {

			@Override
			public void change() {
				// TODO Auto-generated method stub
				super.change();
			}
			
		};
 	}

}
