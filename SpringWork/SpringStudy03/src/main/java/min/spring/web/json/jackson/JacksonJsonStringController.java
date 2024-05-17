package min.spring.web.json.jackson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletResponse;
import min.spring.web.json.dto.JsonDTO;

@RestController
public class JacksonJsonStringController {

private static final Logger logger = LoggerFactory.getLogger(JacksonJsonStringController.class);
@GetMapping(value="/jsonStringJava", produces = "application/json")
public void json_java(HttpServletResponse response) throws Exception {
	String jsonStr = "{\"id\" : \"min\", \"password\" : \"1234\", \"name\" : \"홍길동\"}";
	ObjectMapper objectMapper = new ObjectMapper();
	JsonDTO jsonDTO = objectMapper.readValue(jsonStr, JsonDTO.class);
	logger.info("데이터 확인 -" + jsonDTO);
	response.setContentType("text/html; charset=UTF-8");
	response.getWriter().println(jsonDTO);
}
}
