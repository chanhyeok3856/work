package chan.spring.injection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionCall {
public static void main(String[] args) throws ClassNotFoundException {
	Class class1 = ReflectionService.class;
	System.out.println(class1.getName());
	class1 = Class.forName("chan.spring.injection.ReflectionService");
Field[] field = class1.getDeclaredFields();
System.out.println(field[0]);
Constructor[] constructors = class1.getDeclaredConstructors();
System.out.println(constructors[0]);
System.out.println(constructors[1]);
Method[] methods = class1.getDeclaredMethods();
System.out.println(methods[0]);
System.out.println(methods[1]);
}
}
