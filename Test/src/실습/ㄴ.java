package 실습;

public class ㄴ {
	
	public static void parameterMethod(char c, int i) {
		System.out.println("성별 : "+ c);
		System.out.println("나이 : "+ i);
	}
	public static void main(String[] args) {
		char c ='남';
int i =33;
		
		parameterMethod(c,i);
	}

}
