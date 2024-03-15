package min.ser.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test")
public class Test extends HttpServlet{

		private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String age = req.getParameter("age");
		System.out.println(age);
		TestDTO testDTO = new TestDTO();
		testDTO.setAge(age);
		System.out.println(testDTO);
		
	System.out.println("연결");
	}

}
