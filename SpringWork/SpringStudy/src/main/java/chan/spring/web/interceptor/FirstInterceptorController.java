package chan.spring.web.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FirstInterceptorController {


private static final Logger logger = LoggerFactory.getLogger(FirstInterceptorController.class);
@GetMapping("/interceptor")
public String firstInterceptor(Model model) {
	logger.info("call interceptor");
	return "./interceptor/interceptor";
	
}

}
