package chan.test.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ListAttribute")
public class ListAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<String> list = new ArrayList<String>();
	list.add("순두부");
	list.add("된장찌개");
	list.add("제육덮밥");
	request.setAttribute("list", list);
	RequestDispatcher dispatcher = request.getRequestDispatcher("./test/list_attribute.jsp");
	dispatcher.forward(request, response);
	}

}
