package min.java.aaa;

public class WedFour {
	public static void main(String[] args) {
		int[] num1 = new int[2];
		//[I@880ec60 주소값 출력
		System.out.println(num1);
		num1[0] = 2;
		num1[1] = 4;
System.out.println("결과값 : "+ num1[0] +","+num1[1]);

int [] num2 = num1;
//[I@880ec60 주소값 복사
System.out.println(num2);
num2[0]=6;
num2[1]=8;
System.out.println("결과값 : "+ num2[0] +","+num2[1]);
System.out.println("결과값 : "+ num1[0] +","+num1[1]);


	}

}
