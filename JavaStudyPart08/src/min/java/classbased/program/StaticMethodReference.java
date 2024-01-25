package min.java.classbased.program;

public abstract class StaticMethodReference {
	private String name = "홍길동";

	protected abstract void value( );

	static StaticMethodReference staticMethodReference = new StaticMethodReference( ) {

		@Override
		public void value( ) {
			System.out.print("온다.");

		}

	};

	public static StaticMethodReference come( ) {
		return staticMethodReference;

	}

	public String getName( ) {
		return name;
	}

}
