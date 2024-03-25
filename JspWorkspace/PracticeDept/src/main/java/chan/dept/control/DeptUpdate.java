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


@WebServlet("/DeptUpdate")
public class DeptUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int deptno = Integer.parseInt(request.getParameter("deptno"));
DeptDAO deptDAO = new DeptDAO();
DeptDTO deptDTO = new DeptDTO();
deptDTO = deptDAO.deptSelect(deptno);
request.setAttribute("dname", deptDTO.getDname());
request.setAttribute("loc", deptDTO.getLoc());
RequestDispatcher dispatcher = request.getRequestDispatcher("./dept/dept_update.jsp");
dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		DeptDAO deptDAO = new DeptDAO();
		DeptDTO deptDTO = new DeptDTO();
		deptDTO.setDeptno(deptno);
		deptDTO.setDname(dname);
		deptDTO.setLoc(loc);
		deptDTO = deptDAO.deptUpdate(deptDTO);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./dept/dept_update_view.jsp");
		dispatcher.forward(request, response);
	
	}

}
