package 실습0202;

public class FriSix {
	public static void main(String[] args) {
		FriFive friFive = new FriFive();
		friFive.variableArgument("홍길동");
		friFive.variableArgument("홍길동, ","전우치" );
		friFive.variableArgument("홍길동, ", "전우치,","임꺽정");
	}

}
