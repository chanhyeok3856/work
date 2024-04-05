package study;

public class TryCatchStudy {
public static void main(String[] args) {
	int intArray[] = new int[5];//intarray라는 변수에다가 5의 공간만큼 배열로 선언한다.
	
	try
	{
	intArray[3] = 10;
	intArray[6] = 1;
	}
	catch (Exception e)
	{
		e.printStackTrace();//실제 에러문 출력
	System.out.println("배열 범위 초과");
	System.exit(0);//강제로 프로그램 종료
	}
	System.out.println("프로그램 끝");
}
}
//try catch 문
//try 안은 그냥 실행하는 부분
//만약 try 안의 문이 오류가 나면
//catch(Exception e) 로 이동함
//예외는 e 에 저장됨
//그 후 catch 문 실행된다
//e.printStackTrace(); 써주면 e 안에 들어있는 오류 볼 수 있음