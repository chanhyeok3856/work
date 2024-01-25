package min.java.classbased.inherit;

public class ReInheritedCall {
	public static void main(String[ ] args) {
		Baby baby = new Baby( );
		baby.parentMethod( );
		baby.childMethod( );
		System.out.println( );
		baby.babyMethod( );
	}
}