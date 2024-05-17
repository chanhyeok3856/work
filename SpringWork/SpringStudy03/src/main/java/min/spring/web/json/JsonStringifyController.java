package min.spring.web.json;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class JsonStringifyController {

private static final Logger logger = LoggerFactory.getLogger(JsonStringifyController.class);
@GetMapping(value="/jsonget", produces = "application/json")
public void json_receive(HttpServletResponse response) throws Exception{
	List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
	for (int i = 0; i < 3; i++) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "id" + i);
		map.put("name", "name" + i);
		list.add(map);
	}
	logger.info("데이터 확인 -" + list); 
	response.setContentType("text/html; charset=UTF-8");
	PrintWriter out = response.getWriter();
	out.println("데이터 : "+list);
}
}
