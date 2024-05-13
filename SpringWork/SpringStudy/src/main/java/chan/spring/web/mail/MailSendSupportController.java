package chan.spring.web.mail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MailSendSupportController {


private static final Logger logger = LoggerFactory.getLogger(MailSendSupportController.class);
private final MailSendSupportService mailSendSupportService;
@Autowired
public MailSendSupportController(MailSendSupportService mailSendSupportService) {
	this.mailSendSupportService = mailSendSupportService;
}
@GetMapping("/sendMail")
public String send(Model model) throws Exception {
	mailSendSupportService.sendEmail();
	String receiverMail = "minhaett@naver.com";
	logger.info(receiverMail);
	model.addAttribute("receiverMail", receiverMail);
	return "./mail/sendMail";
}
}
