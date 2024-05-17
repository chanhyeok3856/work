package min.spring.web.json.jackson;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletResponse;
import min.spring.web.json.dto.JsonDTO;

@RestController
public class JacksonJsonObjectController {
	
	private static final Logger logger = LoggerFactory.getLogger(JacksonJsonObjectController.class);
	@GetMapping(value="/jacksonJson", produces = "application/json")
	public void json_create(HttpServletResponse response, JsonDTO jsonDTO) throws Exception{
		jsonDTO.setId("min");
		jsonDTO.setPassword("1234");
		jsonDTO.setName("홍길동");
		logger.info("데이터 확인 -" +jsonDTO.toString());
		File file = new File("C:\\data\\write.json");
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(file, jsonDTO);
		String jsonData = objectMapper.writeValueAsString(jsonDTO);
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().println(jsonData);
	}
}
