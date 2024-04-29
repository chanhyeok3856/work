package chan.spring.injection;

public class DefaultConstructorService {
private final DefaultConstructor defaultConstructor;
// 파라미터 생성자를 선언하고 생성자명의 첫 글자가 소문자인 defaultConstructorService가 빈이 된다.
public DefaultConstructorService(DefaultConstructor defaultConstructor) {
this.defaultConstructor = defaultConstructor;
}
public void call( ) {
defaultConstructor.insert( );
defaultConstructor.delete( );
}
}