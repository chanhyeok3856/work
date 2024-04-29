package chan.spring.injection;

public class DefaultConstructor {
	// 기본 생성자를 선언하고 생성자명의 첫 글자가 소문자인 defaultConstructor가 빈이 된다.
	public DefaultConstructor( ) {
	}
	// int 타입 반환 타입인 메서드를 선언한다.
	public int insert( ) {
	System.out.println("insert 메서드를 호출한다.");
	return 0;
	}
	// void 타입 반환 타입인 메서드를 선언한다.
	public void delete( ) {
	System.out.println("delete 메서드를 호출한다.");
	}
	}