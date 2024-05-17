package min.spring.web.json;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class JsonParseController {
	

	private static final Logger logger = LoggerFactory.getLogger(JsonParseController.class);

	@GetMapping(value="/jsonpost", produces = "application/json")
	public String json_receive() {
		return"./json/json_parse";
	}
	@PostMapping(value="/jsonpost", consumes = "application/json")
	public void json_receive(@RequestBody Map<String,Object> data, HttpServletResponse response) {
		logger.info("메서드 실행\n"+data);
		response.setStatus(HttpServletResponse.SC_NO_CONTENT);
	}

}
