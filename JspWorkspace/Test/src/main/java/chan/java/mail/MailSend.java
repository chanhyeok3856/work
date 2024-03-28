package chan.java.mail;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import org.apache.commons.logging.*;

@WebServlet("/MailSend")
public class MailSend extends HttpServlet {
private static Log log = LogFactory.getLog(MailSend.class);
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// SMTP 서버에 설정된 이메일 주소로 보내는 메일을 설정한다. 
	String senderMail = "songminhaett@naver.com";
// 보내는 사람의 이름을 설정한다. 
	String senderName = "홍길동";
// 받는 메일의 주소를 설정한다. 
	String receiverMail = "minhaett@hanmail.net";
// 메일의 제목을 설정한다. 
	String subject = "테스트 메일";
// 메일의 내용을 설정한다. 
	String content = "테스트 메일입니다.";
// SMTP 서버의 사용자를 설정한다. 
	String user = "songminhaett";
// SMTP 서버의 비밀번호를 설정한다.
	String password = "abcd1234";
// 영구 속성 집합을 구현할 인스턴스를 선언한다. 
	Properties properties = new Properties( );
// 연결할 SMTP 서버를 설정한다. 
	properties.put("mail.smtp.host", "smtp.naver.com");
// 연결할 SMTP 서버 포트를 설정한다. 
	properties.put("mail.smtp.port", "465");
	// 권한 부여 명령인 AUTH 명령을 사용하여 사용자 인증에 대한 시도를 설정한다. 
	properties.put("mail.smtp.auth", "true");
	// SSL을 사용하여 기본적으로 SSL 포트에 연결하고 사용하도록 설정한다. 
	properties.put("mail.smtp.ssl.enable", "true");
	// SMTP 호스트에서 신뢰성을 부여할 수 있도록 설정한다. 
	properties.put("mail.smtp.ssl.trust", "smtp.naver.com");
	// SMTP 호스트에서 TLS 프로토콜 버전을 TLS 1.2 버전으로 부여할 수 있도록 설정한다. 
	properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
	// 익명 중첩 클래스를 선언하여 네트워크 연결에 대한 인증 요청을 수행한다. 
	Authenticator authenticator = new Authenticator( ) {
	//비밀번호 인증이 필요할 때 호출하여 사용자 이름과 비밀번호를 저장소에 저장한다. 
		@Override
	protected PasswordAuthentication getPasswordAuthentication( ) {
	//데이터 홀더로 사용자 이름과 비밀번호를 저장소로 반환한다. 
			return new PasswordAuthentication(user, password);
	}
	};
	// 새 세션 객체를 생성하여 할당한다. 
	Session session = Session.getInstance(properties, authenticator);
	log.info(session);
	// 세션에 대한 디버그를 설정한다.
	session.setDebug(true);
	// MIME 타입의 이메일 메시지를 나타내며 적절한 속성과 콘텐츠로 채우고 할당한다. 
	Message message = new MimeMessage(session);
	try {
	//메시지에서 From 속성을 주소와 개인 이름으로 설정한다. 
		message.setFrom(new InternetAddress(senderMail, senderName));
	//받는 사람의 이메일 주소를 받는 사람 유형과 받는 이메일 주소를 분석하여 설정한다. 
		message.setRecipients(RecipientType.TO, InternetAddress.parse(receiverMail));
	//메시지의 제목을 설정한다. 
		message.setSubject(subject);
	//메시지의 보낸 날짜를 설정한다. 
		message.setSentDate(new Date( ));
	//메시지의 텍스트를 설정한다. 
		message.setText(content);
	//메시지를 보내며 메시지는 각 주소에 적절한 메시지 전송을 사용하여 메시지에 설정된 모든 수신자 주소로 전송한다. 
		Transport.send(message);
	} catch(MessagingException e) {
	log.info("메일 전송 실패 - ", e);
	}
	request.setAttribute("receiverMail", receiverMail);
	RequestDispatcher dispatcher = request.getRequestDispatcher("./component/sendMail.jsp");
	dispatcher.forward(request, response);
	}
	}
