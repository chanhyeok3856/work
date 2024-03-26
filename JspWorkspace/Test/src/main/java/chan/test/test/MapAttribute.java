package chan.test.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MapAttribute")
public class MapAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Map<String, String> map= new HashMap<String, String>();
map.put("순두부", "5000원");
map.put("된장찌개", "6000원");
map.put("제육덮밥", "7000원");
request.setAttribute("map", map);
RequestDispatcher dispatcher = request.getRequestDispatcher("./test/map_attribute.jsp");
dispatcher.forward(request, response);
	}

}
