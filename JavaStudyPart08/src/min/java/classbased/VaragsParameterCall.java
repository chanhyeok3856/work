package min.java.classbased;

public class VaragsParameterCall {
	public static void main(String[] args) {
		// VaragsParameter 클래스의 인스턴스를 생성한다.
		VaragsParameter varagsParameter = new VaragsParameter();
		// variableArgument 메서드를 1개의 인자로 호출한다.
		varagsParameter.variableArgument("홍길동");
		// variableArgument 메서드를 2개의 인자로 호출한다.
		varagsParameter.variableArgument("홍길동, ", "전우치");
		// variableArgument 메서드를 3개의 인자로 호출한다.
		varagsParameter.variableArgument("홍길동, ", "전우치, ", "임꺽정");
	}
}