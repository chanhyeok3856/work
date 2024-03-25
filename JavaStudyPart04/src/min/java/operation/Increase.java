package min.java.operation;

public class Increase {
	public static void main(String[] args) {
		int a = 3;
		// 증가 연산자로 a의 값을 1 증가시키며 a의 값을 변경한 후에 평가되므로 출력 결과는 4다.
		a++;
		System.out.println("3 + 1 = " + a);
		// 감소 연산자로 a의 값을 1 감소시키며 a의 값을 변경한 후에 평가되므로 출력 결과는 3다.
		a--;
		System.out.println("4 - 1 = " + a);
		int b = 1;
		// 후위 증가 연산자로 b의 값을 1 증가시키며 b의 원래 값을 평가한 후에 b의 값을 변경하므로 total1의 값은 1이다.
		int total1 = b++;
		System.out.println("b 값을 증가시키기 전에 평가하므로 " + total1 + "이 된다.");
		int c = 1;
		// 전위 증가 연산자로 c의 값을 1 증가시키며 c의 값을 먼저 변경한 후에 평가하므로 total2의 값은 2다.
		int total2 = ++c;
		System.out.println("c 값을 증가시킨 다음에 평가하므로  " + total2 + "가 된다.");
	}
}