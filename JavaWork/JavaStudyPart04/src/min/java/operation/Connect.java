package min.java.operation;

public class Connect {
	public static void main(String[] args) {
		// i 로컬 변수를 선언하고 3을 할당한다.
		int i = 3;
		// j 로컬 변수를 선언하고 3을 할당한다.
		int j = 3;
		String string1 = "나이는 ";
		String string2 = "살입니다.";
		// 연결 연산자를 사용하여 string1 변수, i 변수, j 변수, string2 변수를 순서대로 연결한다.
		String string3 = string1 + i + j + string2;
		System.out.println(string3);
	}
}