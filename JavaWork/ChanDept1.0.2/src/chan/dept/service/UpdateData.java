package chan.dept.service;

import java.util.Scanner;

import chan.dept.dao.DeptDAO;

public class UpdateData {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DeptDAO deptDAO = new DeptDAO();
		System.out.println("수정할 데이터를 입력하세요.");
		System.out.print("번호 : ");
		int deptno;
		deptno = scanner.nextInt();
		System.out.print("부서 : ");
		String dname;
		dname = scanner.next();
		System.out.print("지역 : ");
		String loc;
		loc = scanner.next();
		deptDAO.update(dname, loc, deptno);
		scanner.close();
		
	}

}
