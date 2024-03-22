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


@WebServlet("/DeptSelect")
public class DeptSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	DeptDAO deptDAO = new DeptDAO();
	DeptDTO deptDTO = new DeptDTO();
	ArrayList<DeptDTO> arrayList = new ArrayList<DeptDTO>();
	arrayList = deptDAO.deptSelectAll();
	request.setAttribute("arrayList", arrayList);
	RequestDispatcher dispatcher = request.getRequestDispatcher("./dept/dept_select_view.jsp");
	dispatcher.forward(request, response);
	}

}
