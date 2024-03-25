package min.java.variable;

public class LocalVariable {
	public static void main(String[] args) {
		// 로컬 변수를 선언한다.
		String name;
		// 변수 str에 값이 할당되지 않았기 때문에 주석을 제거하면 오류가 발생된다.
		// System.out.println(name);
		name = "홍길동";
		System.out.println(name);
		// var 키워드를 통한 변수 선언은 반드시 초기화를 통해서 선언하며 컴파일러가 int 타입으로 추론한다.
		var age = 33;
		System.out.println(age);
	}
}
