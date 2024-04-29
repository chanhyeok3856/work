package chan.spring.injection;

public class DefaultConstructorCall {
	public static void main(String[] args) {
		DefaultConstructor defaultConstructor = new DefaultConstructor();
	DefaultConstructorService defaultConstructorService = new DefaultConstructorService(defaultConstructor);
	defaultConstructor.insert();
	}

}
