package chan.dept.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chan.dept.dao.DeptDAO;
import chan.dept.dto.DeptDTO;


@WebServlet("/DeptInsert")
public class DeptInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	RequestDispatcher dispatcher = request.getRequestDispatcher("./dept/dept_insert.jsp");
	dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int deptno = Integer.parseInt(request.getParameter("deptno"));
	String dname = request.getParameter("dname");
	String loc = request.getParameter("loc");
	DeptDAO deptDAO = new DeptDAO();
	DeptDTO deptDTO = new DeptDTO();
	ArrayList<DeptDTO> arrayList = new ArrayList<DeptDTO>();
	arrayList = deptDAO.deptSelectAll();
	request.getSession().setAttribute("arrayList", arrayList);
	deptDTO.setDeptno(deptno);
	deptDTO.setDname(dname);
	deptDTO.setLoc(loc);
	deptDTO = deptDAO.deptInsert(deptDTO);
	response.sendRedirect("./dept/dept_insert_view.jsp?deptno="+deptno);
	}

}
