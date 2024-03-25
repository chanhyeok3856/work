package chan.controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chan.dto.ParameterDTO;


@WebServlet("/GetDispatcher")
public class GetDispatcher extends HttpServlet {

private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
int age = Integer.parseInt(request.getParameter("age"));

ParameterDTO parameterDTO = new ParameterDTO( );
parameterDTO.setName(name);
parameterDTO.setAge(age);

request.setAttribute("name", parameterDTO.getName( ));

request.setAttribute("age", parameterDTO.getAge( ));

RequestDispatcher dispatcher = request.getRequestDispatcher("./view/get_dispatcher_view.jsp");

dispatcher.forward(request, response);
}
}