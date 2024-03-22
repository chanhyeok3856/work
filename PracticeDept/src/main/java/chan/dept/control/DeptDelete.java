package chan.dept.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chan.dept.dao.DeptDAO;
import chan.dept.dto.DeptDTO;


@WebServlet("/DeptDelete")
public class DeptDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
RequestDispatcher dispatcher = request.getRequestDispatcher("./dept/dept_delete.jsp");
dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int deptno = Integer.parseInt(request.getParameter("deptno"));
	DeptDAO deptDAO = new DeptDAO();
	DeptDTO deptDTO = new DeptDTO();
	deptDTO.setDeptno(deptno);
	deptDTO = deptDAO.deptDelete(deptno);
	RequestDispatcher dispatcher = request.getRequestDispatcher("./dept/dept_delete_view.jsp");
	dispatcher.forward(request, response);
	}

}
