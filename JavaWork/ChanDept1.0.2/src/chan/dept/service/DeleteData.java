package chan.dept.service;

import java.util.Scanner;

import chan.dept.dao.DeptDAO;

public class DeleteData {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DeptDAO deptDAO = new DeptDAO();
		System.out.println("삭제할 데이터 번호를 입력하세요.");
		System.out.print("번호 : ");
		int deptno;
		deptno = scanner.nextInt();
		deptDAO.delete(deptno);
		scanner.close();
	}

}
