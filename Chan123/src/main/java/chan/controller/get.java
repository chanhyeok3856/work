package chan.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chan.dto.ChanDTO;


@WebServlet("/get")
public class get extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
String id = request.getParameter("id");
String password = request.getParameter("password");
String gender = request.getParameter("gender");
String[] hobbyAarray = request.getParameterValues("hobby");
String hobby = "";
for (int i = 0; i < hobbyAarray.length; i++) {
	hobby += hobbyAarray[i] + " ";
}
ChanDTO chanDTO = new ChanDTO();
chanDTO.setName(name);
chanDTO.setId(id);
chanDTO.setPassword(password);
chanDTO.setGender(gender);
chanDTO.setHobby(hobby);
System.out.println("이름"+chanDTO.getName());
System.out.println("아이디"+chanDTO.getId());
System.out.println("비밀번호"+chanDTO.getPassword());
System.out.println("성별"+chanDTO.getGender());
System.out.println("취미"+chanDTO.getHobby());
}
}