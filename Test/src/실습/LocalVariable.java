package 실습;

public class LocalVariable {
public static void main(String[] args) {
	
	String name;
	
	//The local variable name may not have been initialized <<로컬변수가 선언되지 않았다.
	name = "홍길동";
	System.out.println(name);
	var age=33;
	System.out.println(age);
	
	//var는 형식 추론을 사용하기 때문에 초기값이 없거나 형식이 명시적으로 지정되지 않으면
	//컴파일러가 형식을 추론할 수 없어 컴파일 오류가 발생할 수 있습니다.
	//int는 명시적으로 정수형 변수를 선언할 때 사용되며, 형식을 직접 지정해주어야 합니다.


}
}
