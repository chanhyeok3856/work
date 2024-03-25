package chan.log;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import chan.log.dto.LogDTO;


@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String save = request.getParameter("save");
		LogDTO logDTO = new LogDTO();
		logDTO.setId(id);
		logDTO.setPassword(password);
		id = logDTO.getId();
		password = logDTO.getPassword();
		if (id.equals("chan")& password.equals("1234")) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("id", id);
			if (save != null) {
				Cookie cookie = new Cookie("id",id);
				cookie.setMaxAge(60*60*24);
				cookie.setPath("/");
			response.addCookie(cookie);
			}
			response.sendRedirect("./log/preference_select.jsp?id="+id);
		}else {
			response.sendRedirect("./log/logcheck.jsp?id="+id);
		}

	}

}
