package min.spring.web.ajax;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class AjaxSetupController {
	
	private static final Logger logger = LoggerFactory.getLogger(AjaxSetupController.class);
	
	@GetMapping("/ajaxSetup")
	public String ajax_request() {
		logger.info("데이터 요청 확인");
		return "./ajax/ajax_request";
	}
	@PostMapping("/ajaxData")
	public String ajax_data() {
		logger.info("데이터 응답 확인");
		return "./ajax/ajax_data";
	}

}
