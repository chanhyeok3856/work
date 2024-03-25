package min.java.variable;

public class VariableLifeCycle {
	public static void variableMethod() {
		// 메서드 내에 int 타입인 num 로컬 변수를 선언하고 초깃값으로 4를 할당한다.
		int num = 4;
		System.out.println("메서드의 로컬 변숫값 : " + num);
	}

	public static void main(String[] args) {
		// 스테틱 메서드를 호출한다.
		variableMethod();
		// 메인 메서드 내에 int 타입인 num 로컬 변수를 선언하고 초깃값으로 3을 할당한다.
		int num = 3;
		// 변수의 생명주기가 같으므로 같은 이름의 int 타입인 num 로컬 변수를 선언하지 못하므로 주석을 제거하면 에러가 발생한다.
		// int num=5;
		System.out.println("메인 메서드의 로컬 변숫값 : " + num);
	}
}