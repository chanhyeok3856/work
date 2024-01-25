package min.java.operation;

public class Logic {
	public static void main(String[] args) {
		// int 타입의 a 로컬 변수를 선언하고 10을 할당한다.
		int a = 10;
		// int 타입의 b 로컬 변수를 선언하고 5를 할당한다.
		int b = 5;
		// & 연산자로 a와 b를 평가하고 두 조건이 모두 true이므로 결과는 true가 된다.
		System.out.println("& 연산자 : " + (a == 10 & b == 5));
		// && 연산자로 a와 b를 평가하고 첫 번째 조건이 false이므로 두 번째 조건은 검사하지 않으며 결과는 false가 된다.
		System.out.println("&& 연산자 : " + (a == 9 && b == 5));
		// | 연산자로 a와 b를 평가하고 두 조건이 모두 false이므로 결과는 false가 된다.
		System.out.println("| 연산자 : " + (a == 9 | b == 4));
		// || 연산자로 a와 b를 평가하고 첫 번째 조건이 true이므로 두 번째 조건은 검사하지 않으며 결과는 true가 된다.
		System.out.println("|| 연산자 : " + (a == 10 || b == 4));
		// 참과 거짓을 확인하기 위해 boolean 타입인 c 변수를 선언하고 true를 할당한다.
		boolean c = true;
		// ! 연산자로 boolean 타입인 c 로컬 변수의 값을 반전시키므로 결과는 false가 된다.
		System.out.println("! 연산자 : " + !c);
	}
}