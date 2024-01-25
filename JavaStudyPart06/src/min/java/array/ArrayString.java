package min.java.array;

public class ArrayString {
	public static void main(String[] args) {
		// 배열의 크기가 4인 1차원 배열을 선언하고 값을 할당한다.
		String[] name = new String[4];
		name[0] = "홍길동";
		name[1] = "전우치";
		name[2] = "임꺽정";
		// name[3]의 값이 할당되지 않았으므로 null이 된다.
		// name[3] = "조세형";
		// 배열 변수의 크기만큼 반복하며 i 변수는 name 변수의 length보다 작을 때까지만 반복한다.
		for (int i = 0; i <= name.length; i++) {
			System.out.println(" 배열값 : " + name[i]);
		}
	}
}