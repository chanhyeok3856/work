package chan.spring.web.mail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class MailSendSupportService {


private static final Logger logger = LoggerFactory.getLogger(MailSendSupportService.class);
private final JavaMailSender javaMailSender;
@Autowired
public MailSendSupportService(JavaMailSender javaMailSender) {
	this.javaMailSender = javaMailSender;
}
public void sendEmail() throws Exception{
	String subject = "테스트 메일";
	String content = "메일 테스트 내용입니다 이찬혁";
	String senderMail = "songminhaett@naver.com";
	String receiverMail = "bb1a5@naver.com";
	MimeMessage mimeMessage = javaMailSender.createMimeMessage();
	MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
	mimeMessageHelper.setFrom(senderMail);
	mimeMessageHelper.setTo(receiverMail);
	mimeMessageHelper.setSubject(subject);
	mimeMessageHelper.setText(content, true);
	javaMailSender.send(mimeMessage);
	logger.info("메일 전송 확인-"+mimeMessage);
}
}
