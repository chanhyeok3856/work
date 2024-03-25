package min.java.packageuse;

public class StringBufferProcessing {
	public static void main(String[ ] args) {
		// 문자열을 생성한다.
		StringBuffer stringBuffer = new StringBuffer("자바");
		// 문자열을 추가한다.
		stringBuffer.append(" 완성");
		System.out.println("1. 문자열 추가: " + stringBuffer);
		// 문자열의 특정 위치에서 문자열을 입력한다.
		stringBuffer.insert(5, " !!!");
		System.out.println("2. 저장된 문자열의 5번째에 추가: " + stringBuffer);
		// 문자열의 특정 위치에서 문자열을 삭제한다.
		stringBuffer.delete(2, 7);
		System.out.println("3. 저장된 문자열의 2번째부터 7번째까지 제거: " + stringBuffer);
	}
}