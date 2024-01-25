package min.java.array;

public class ShallowCopyLiteral {
	public static void main(String[] args) {
		// String 타입의 citie 배열 변수를 선언하고 초기화한다.
		String[] citie = { "서울", "대구", "춘천", "울산", "광주", "천안" };
		System.out.println("citie 주소값 : " + citie);
		// citie 배열 변수와 같은 크기의 copy 배열 변수를 선언하고 초기화한다.
		String[] copy = new String[citie.length];
		System.out.println("copy 주소값 : " + copy);
		// copy 배열 변수의 초깃값을 출력한다.
		for (String str : copy) {
			System.out.print(" " + str + " ");
		}
		System.out.println();
		// 배열 객체의 0번 인덱스부터 얕은 복사를 하고 citie 객체의 길이만큼 데이터를 읽어온다.
		System.arraycopy(citie, 0, copy, 0, citie.length);
		// 복사된 copy 배열 변수의 값을 출력한다.
		for (String str : copy) {
			System.out.print(" " + str + " ");
		}
	}
}