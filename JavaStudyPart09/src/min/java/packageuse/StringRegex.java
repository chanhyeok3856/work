package min.java.packageuse;

public class StringRegex {
	public static void main(String[] args) {
		String deptNumber = "50";
		// deptNumber 변숫값이 0부터 99 사이의 숫자로 이루어진 문자열인지를 확인한다.
		if (deptNumber.matches("^[0-9]{1,2}$")) {
			// deptNumber 변숫값인 문자열을 정수로 변환한 값을 저장한다.
			int deptno = Integer.parseInt(deptNumber);
			System.out.println("부서 번호 : " + deptno);
		} else {
			// 모든 문자를 ***으로 대체하여 result 변수에 할당한다.
			String result = deptNumber.replaceAll("^[\\s\\S]*$", "***");
			// deptNumber 변수의 조건을 만족하지 않을 때 출력한다.
			System.out.println(result + " 번호는 올바른 부서 번호가 아닙니다. 번호는 2자리의 정수입니다.");
		}

	}

}
