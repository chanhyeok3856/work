package min.java.packageuse;

public class StringBufferAppend {
	public static void main(String[] args) {
		// StringBuffer 객체를 생성한다.
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < 5; i++) {
			// i 변숫값을 stringBuffer에 추가한다. 연결 연산자로 반복할 때 발생하는 중간 문자열 객체는 생성되지 않는다.
			stringBuffer.append(i);
		}
		// stringBuffer 인스턴스의 내용을 출력한다.
		System.out.println(stringBuffer);
	}
}