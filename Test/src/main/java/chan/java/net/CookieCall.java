package chan.java.net;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieCall")
public class CookieCall extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		if (cookies==null) {
			System.out.println("쿠키가 존재하지않는다.");
			//원래는 로그로 확인해야 한다. 귀찮으니 이렇게 한거.
			//조건에 관련된게 확실하면 else 쓸수있다. if문 조건 확실 x면 else쓰면 안된다.
			// null외에 다니까 확실하다. 그니까 else문 써도 무방하다.
			
		}else {
			//쿠키는 배열로 되있다. 배열에서 각각의 이름 불러올려면 for문 써야지.
			//for문 안쓰면 각각 이름 못불러옴.
			for (int i = 0; i < cookies.length; i++) {
				// 여기서 향상된 for문인 for each 문 맞지 않음. 
				String name = cookies[i].getName();
				System.out.println(name);
				request.setAttribute("name", name);
				String value = cookies[i].getValue();
				System.out.println(value);
				request.setAttribute("value", value);
				//[]안에 i 빼먹지 마라.
				//log찍어야 되는거 잊지마라
				//for 문에 네임 없으니 속성 적어줘야 한다. 그래야 보내 줄 수 있다.
			}
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("./test/cook_info.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
