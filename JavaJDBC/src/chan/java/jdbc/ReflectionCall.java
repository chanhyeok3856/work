package chan.java.jdbc;
import java.lang.reflect.*;
public class ReflectionCall {
//원시 유형 사용법과 관련된 경고를 무시한다. @SuppressWarnings("rawtypes")
public static void main(String[ ] args) throws ClassNotFoundException {
// 클래스에 직접 접근하여 할당한다. 
	Class class1 = ReflectionService.class;
// 클래스의 이름을 호출하여 출력한다. 
	System.out.println(class1.getName( ));
// 이미 로드된 클래스 내에서 다른 클래스에 접근하여 클래스의 요소를 사용한다. class1 = Class.forName("min.java.classextension.ReflectionService");
// 클래스에서 필드를 호출한다. 
	Field[ ] field = class1.getDeclaredFields( );
System.out.println(field[0]);
// 클래스에서 생성자를 호출한다. 
Constructor[ ] constructors = class1.getDeclaredConstructors( );
System.out.println(constructors[0]);
System.out.println(constructors[1]);
// 클래스에서 메서드를 랜덤으로 호출한다. 
Method[ ] methods = class1.getDeclaredMethods( );
System.out.println(methods[0]);
System.out.println(methods[1]);
}
}
