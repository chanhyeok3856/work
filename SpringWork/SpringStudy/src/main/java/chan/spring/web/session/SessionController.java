package chan.spring.web.session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes("sessionDTO")
public class SessionController {

private static final Logger logger = LoggerFactory.getLogger(SessionController.class);
@GetMapping(value="/session")
public String send(Model model, SessionDTO sessionDTO) {
	sessionDTO.setId("민해티티");
	sessionDTO.setPassword("1234");
	model.addAttribute("sessionDTO", sessionDTO);
	return "./session/sessionform";
}
@PostMapping(value="/session")
//@ModelAttribute 어노테이션 생략
public String send(SessionDTO sessionDTO) {
	logger.info("데이터확인-"+sessionDTO);
	return "./session/sessionview";
}
}
