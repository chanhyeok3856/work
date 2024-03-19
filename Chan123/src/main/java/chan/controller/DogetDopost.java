package chan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chan.dto.ChanDTO;


@WebServlet("/DogetDopost")
public class DogetDopost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	RequestDispatcher dispatcher = request.getRequestDispatcher("./view/dogetdopost.jsp");
	dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String name =  request.getParameter("name"); 
		  System.out.println(name);
		  int age =Integer.parseInt(request.getParameter("age")); 
		  System.out.println(age);
		  String password = request.getParameter("password");
		  String gender = request.getParameter("gender");
		  String[ ] hobbyAarray= request.getParameterValues("hobby");
		  String hobby="";
		  for(int i = 0; i < hobbyAarray.length; i++) {
		  hobby += hobbyAarray[i] + " ";
		  }
		  ChanDTO chanDTO = new ChanDTO(); 
		  chanDTO.setName(name); 
		  chanDTO.setAge(age);
		  chanDTO.setPassword(password);
		  chanDTO.setGender(gender);
		  chanDTO.setHobby(hobby);
		  request.setAttribute("name", chanDTO.getName()); 
		  request.setAttribute("age",  chanDTO.getAge()); 
		  request.setAttribute("password", chanDTO.getPassword());
		  request.setAttribute("gender", chanDTO.getGender());
		  request.setAttribute("hobby", chanDTO.getHobby());
		  System.out.println(chanDTO);
		  RequestDispatcher dispatcher = request.getRequestDispatcher("./view/dogetdopost_dispatcher_view.jsp");
		  dispatcher.forward(request, response);
		 
	}

}
