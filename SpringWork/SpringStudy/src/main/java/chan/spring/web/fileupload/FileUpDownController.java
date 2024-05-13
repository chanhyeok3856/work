package chan.spring.web.fileupload;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FileUpDownController {
	

	private static final Logger logger = LoggerFactory.getLogger(FileUpDownController.class);
	//spring 4.3 이후, 파라미터 생성자가 하나면 @RequestMapping 어노 있으면 @Autowired어노 생략가능
	private final FileUpDownService fileUpDownService;
	@GetMapping("/upload")
	public String form() {
		logger.info("컨트롤러 확인");
		return "./fileupdown/uploadform";
	}
	@PostMapping("/upload")
	public String upload(Model model, FileUpDownDTO fileUpDownDTO, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception, Exception {
		return fileUpDownService.uploadFile(model, fileUpDownDTO, multipartHttpServletRequest);
	}
	@GetMapping("/down")
	public String down(@RequestParam(value="fileName", required = true) String fileName, HttpServletResponse response) throws Exception{
		return fileUpDownService.downloadFile(fileName, response);
		
	}
	

}
