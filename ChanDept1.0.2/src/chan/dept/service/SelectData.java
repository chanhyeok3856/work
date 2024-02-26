package chan.dept.service;

import java.util.Scanner;

import chan.dept.dao.DeptDAO;

public class SelectData {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DeptDAO deptDAO = new DeptDAO();
		System.out.println("조회할 데이터 번호를 입력하세요.");
		System.out.print("번호 :");
		int deptno;
		deptno = scanner.nextInt();
		deptDAO.select(deptno);
		scanner.close();
	}

}
