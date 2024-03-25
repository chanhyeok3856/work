package min.java.statement;

public class MedianValue {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		// 전위 증감 연산자로 i 변수를 1씩 증가시키고 j 변수를 1씩 감소시키면서 i 변수가 j 변수보다 작은 동안 반복한다.
		while (++i < --j) {
			// 각 반복에서 증가한 i 값과 감소한 j 값을 출력한다.
			System.out.println("i 변수의 1씩 증가한 값은 " + i + "이고, " + "j 변수의 1씩 감소한 값은 " + j + "입니다.");
		}
		// 증가와 감소 연산이 끝난 후의 i 변수와 j 변수의 값은 중간값을 나타낸다.
		System.out.println("i 변수의 1씩 증가한 최종값은 " + i + "입니다.");
		System.out.println("j 변수의 1씩 감소한 최종값은 " + j + "입니다.");
	}
}