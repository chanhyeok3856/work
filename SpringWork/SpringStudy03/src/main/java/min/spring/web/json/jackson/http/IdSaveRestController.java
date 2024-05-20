package min.spring.web.json.jackson.http;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdSaveRestController {

private static final Logger logger = LoggerFactory.getLogger(IdSaveRestController.class);
@PostMapping(value="/id_Save", produces="application/json")
public Map<String, Integer> idSave(@RequestParam String id){
	logger.info("아이디-"+id);
	int result=1;
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("result", result);
	return map;
}
}
