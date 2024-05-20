package min.spring.web.json.jackson.http;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdCheckRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(IdCheckRestController.class);
	
	@GetMapping(value = "/id_Check", produces = "application/json")
	public Map<String, Integer> idCheck(@RequestParam String id){
		logger.info("아이디 - "+id);
		int result = 1;
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("result", result);
		return map;
	}

}
