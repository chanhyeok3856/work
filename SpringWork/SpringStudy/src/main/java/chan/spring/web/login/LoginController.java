package chan.spring.web.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
@GetMapping("/login")
public String admin_login() {
	return "./login/login";
	
}
@PostMapping("/login_admin")
public String login(HttpServletRequest request, HttpSession httpSession) {
	String returnURL = "";
	if (request.getParameter("id").equals("admin") & request.getParameter("password").equals("1234")) {
httpSession.setAttribute("admin_id", "admin");		
httpSession.setAttribute("admin_name", "관리자");	
returnURL = "redirect:/admin_main";
	}
	else {
		returnURL = "redirect:/login";
	}
	return returnURL;
}
//인터셉터의 요청을 처리할 URL 매핑명, 처리할 임의의 서블릿 메서드를 설정함.	
@GetMapping("/admin_main")
public String admin_main(){
	return "./login/admin_main";
}
}
