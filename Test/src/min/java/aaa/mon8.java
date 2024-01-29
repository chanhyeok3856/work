package min.java.aaa;

public class mon8 {
	public static void main(String[] args) {
		int kor =100;
		int eng =50;
		if (kor>90) {
			System.out.println("합격");
			if (kor<60 | eng<60) {
				System.out.println("불합격");
			}else {
				System.out.println("합격");
			}
		}else {
			System.out.println("불합격");
		}
	}

}
