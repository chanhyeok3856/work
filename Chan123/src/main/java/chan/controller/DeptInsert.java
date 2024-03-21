package chan.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chan.dao.InsertDAO;
import chan.dto.DeptDTO;


@WebServlet("/DeptInsert")
public class DeptInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		InsertDAO insertDAO = new InsertDAO();
		DeptDTO deptDTO = new DeptDTO();
		deptDTO = insertDAO.insert(deptno, dname, loc);
		response.sendRedirect("./dept/dept_insert_view.jsp?deptno="+deptno);
	}

}
