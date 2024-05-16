package chan.spring.web.ajax;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AjaxController {
	

	private static final Logger logger = LoggerFactory.getLogger(AjaxController.class);
//웹 브라우저 요청을 처리할 url 매핑명과 처리할 임의의 서블릿 베서드를 설정해 아작스를 요청함
@GetMapping("/ajaxRequest")
public String ajax_request() {
	logger.info("데이터 요청 확인");
	return "./ajax/ajax_request";
}
//웹 브라우저의 요청을 처리할 URL 매핑명과 처리할 임의의 서블릿 메서드를 설정하여 아작스를 응답한다.
@GetMapping("/ajaxData")
public String ajax_data() {
	logger.info("데이터 응답 확인");
	return "./ajax/ajax_data";
}
}
